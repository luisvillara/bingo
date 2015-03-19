/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import bingo_client.bingo_client.Settings;
import bingo_client.lib.ClientDelegate;
import java.io.*;
import java.net.*;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Server extends Thread
{
    private ClientDelegate delegate;
    private String myIP;
    
    public Server(ClientDelegate delegate){
        this.delegate = delegate;
            this.delegate = delegate;
            try {
                myIP = InetAddress.getLocalHost().getHostAddress().toString();
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void initBroadcastAnnouncement(){
        System.out.println("Inicia anunciamiento del servidor");
        while(Settings.ANNOUNCE_SERVER){
            try {
                DatagramSocket s = new DatagramSocket();
                InetAddress local = InetAddress.getByName(Settings.BROADCAST_IPADDRESS);//my broadcast ip
                int msg_length = "".length();
                byte[] message = "".getBytes();
                DatagramPacket p = new DatagramPacket(message, msg_length, local, Settings.UDP_SERVER_PORT);
                s.send(p);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al anunciar servidor");
            }
            try {
                Thread.sleep(Settings.ANNOUNCE_SERVER_TIME);
            } catch (InterruptedException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void startServerDispatcher(){
        ServerDispatcher serverDispatcher = new ServerDispatcher();
        serverDispatcher.start();
        acceptingClients(serverDispatcher);
    }
    
    public void acceptingClients(ServerDispatcher serverDispatcher){
        ServerThreadListener serverListener = new ServerThreadListener(serverDispatcher);
        serverListener.start();
    }
    
    @Override
    public void run() {
        //WSFunctions.broadcastIPAddress();
        initBroadcastAnnouncement();
    }

    public String getMyIP() {
        return myIP;
    }

    public void setMyIP(String myIP) {
        this.myIP = myIP;
    }
    
}
