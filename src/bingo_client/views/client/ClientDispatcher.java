/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.client;

import bingo_client.lib.ClientDelegate;
import bingo_client.views.server.ClientInfo;
import bingo_ws.lib.ServerDelegate;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public class ClientDispatcher extends Thread
{
    private Vector mMessageQueue = new Vector();
    private Vector mServers = new Vector();
    
    private ServerDelegate delegate;
    
    private String senderIP;
 
    public ClientDispatcher(ServerDelegate delegate){
        this.delegate = delegate;
    }
    /**
     * Adds given client to the server's client list.
     */
    public synchronized void addServer(ServerInfo aServerInfo)
    {
        mServers.add(aServerInfo);
    }
 
    /**
     * Deletes given client from the server's client list
     * if the client is in the list.
     */
    public synchronized void deleteServer(ServerInfo aServerInfo)
    {
        int clientIndex = mServers.indexOf(aServerInfo);
        if (clientIndex != -1)
           mServers.removeElementAt(clientIndex);
    }
 
    /**
     * Adds given message to the dispatcher's message queue and notifies this
     * thread to wake up the message queue reader (getNextMessageFromQueue method).
     * dispatchMessage method is called by other threads (ClientListener) when
     * a message is arrived.
     */
    public synchronized void dispatchMessage(ServerInfo aServerInfo, String aMessage)
    {
        Socket socket = aServerInfo.mSocket;
        senderIP = socket.getInetAddress().getHostAddress();
        String senderPort = "" + socket.getPort();
        //aMessage = senderIP + ":" + senderPort + " : " + aMessage;
        mMessageQueue.add(aMessage);
        notify();
    }
 
    /**
     * @return and deletes the next message from the message queue. If there is no
     * messages in the queue, falls in sleep until notified by dispatchMessage method.
     */
    private synchronized String getNextMessageFromQueue()
    throws InterruptedException
    {
        while (mMessageQueue.size()==0)
           wait();
        String message = (String) mMessageQueue.get(0);
        mMessageQueue.removeElementAt(0);
        return message;
    }
 
    /**
     * Sends given message to all clients in the client list. Actually the
     * message is added to the client sender thread's message queue and this
     * client sender thread is notified.
     */
    private synchronized void sendMessageToAllClients(String aMessage)
    {
        for (int i=0; i<mServers.size(); i++) {
           ClientInfo clientInfo = (ClientInfo) mServers.get(i);
           clientInfo.mClientSender.sendMessage(aMessage);
        }
    }
 
    /**
     * Infinitely reads messages from the queue and dispatch them
     * to all clients connected to the server.
     */
    public void run()
    {
        try {
           while (true) {
               String message = getNextMessageFromQueue();
               System.out.println(message);
               JSONObject msg = new JSONObject(message);
               this.delegate.process_message(senderIP, msg, msg.getInt("COD"));
               //sendMessageToAllClients(message);
           }
        } catch (InterruptedException ie) {
           // Thread interrupted. Stop its execution
        } catch (JSONException ex) {
            Logger.getLogger(ClientDispatcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
