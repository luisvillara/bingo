/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class ServerListener extends Thread
{
    private ClientDispatcher mClientDispatcher;
    private ServerInfo mServerInfo;
    private BufferedReader mIn;
 
    public ServerListener(ServerInfo aServerInfo, ClientDispatcher aClientDispatcher)
    throws IOException
    {
        mServerInfo = aServerInfo;
        mClientDispatcher = aClientDispatcher;
        Socket socket = aServerInfo.mSocket;
        mIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
    }
 
    /**
     * Until interrupted, reads messages from the client socket, forwards them
     * to the server dispatcher's queue and notifies the server dispatcher.
     */
    public void run()
    {
        try {
           while (!isInterrupted()) {
               String message = mIn.readLine();
               if (message == null)
                   break;
               mClientDispatcher.dispatchMessage(mServerInfo, message);
           }
        } catch (IOException ioex) {
           // Problem reading from socket (communication is broken)
        }
 
        // Communication is broken. Interrupt both listener and sender threads
        mServerInfo.mClientSender.interrupt();
        mClientDispatcher.deleteServer(mServerInfo);
        JOptionPane.showMessageDialog(null, "El servidor se desconecto", "Error", JOptionPane.ERROR_MESSAGE);
    }
 
}