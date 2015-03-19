/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import bingo_client.bingo_client.Settings;
import bingo_client.gui.ClientConfDialog;
import bingo_client.lib.ClientConfDialogDelegate;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Client extends Thread
{
    private ArrayList<ServerList> serversIP;
    public static String hostname = "localhost";
    public boolean first_server;
    public int server_count;
    
    private ClientConfDialogDelegate delegate;
    
    public Client(ClientConfDialogDelegate delegate){
        this.delegate = delegate;
        serversIP = new ArrayList<ServerList>();
        first_server = false;
        server_count = 0;
    }
    
    public void receiveServersAnnounce(){
        while(Settings.RECEIVE_ANNOUNCE_SERVER){
            String text = "";
            byte[] message = new byte[Settings.MAX_BYTES];
            try {
                DatagramPacket p = new DatagramPacket(message, message.length);
                DatagramSocket s = new DatagramSocket(Settings.UDP_SERVER_PORT);
                s.receive(p);
                // Guardo la IP de servidores
                ServerList server = new ServerList(p.getAddress());
                addServer(server);
                text = new String(message, 0, p.getLength());
                s.close();
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Error al recibir servidor");
            }
        }
    }
    
    public void addServer(ServerList server){
        if(!serversIP.contains(server)){
            System.out.println("Agrego un nuevo servidor!");
            serversIP.add(server);
            this.delegate.set_server(server);
        }
    }
    
    public void connectingToServer(){
        ClientThreadListener clientThreadListener = new ClientThreadListener(serversIP.get(0));
        clientThreadListener.start();
    }
    
    public void run() {
        // El cliente inicializa recibiendo servidores por Broadcast
        receiveServersAnnounce();
    }
}
