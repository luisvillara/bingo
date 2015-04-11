/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.client;

import bingo_client.bingo_client.Settings;
import bingo_client.views.server.ServerList;
import bingo_ws.lib.Json;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class ClientThreadListener extends Thread {
    private InetAddress serverIp;
    
    private Socket socket;
    
    private ClientDispatcher clientDispatcher;
    
    private Client client;
    private ServerInfo serverInfo;
        
    public ClientThreadListener(Client client, ClientDispatcher clientDispatcher) {
        this.client = client;
        this.serverIp = client.getServer().getServerIP();
        this.clientDispatcher = clientDispatcher;
        System.out.println("Inicalizo el objeto " + serverIp.toString());
    }

    @Override
    public void run() {
        try {
            System.out.println("Creo el socket");
            socket = new Socket(this.serverIp, Settings.TCP_SERVER_PORT);
            serverInfo = new ServerInfo();
            serverInfo.mSocket = socket;
            System.out.println("Inicializa los escuchadores");
            ServerListener serverListener = new ServerListener(serverInfo, this.clientDispatcher);
            ServerSender serverSender = new ServerSender(serverInfo, this.clientDispatcher);
            serverInfo.mClientListener = serverListener;
            serverInfo.mClientSender = serverSender;
            serverListener.start();
            serverSender.start();
            this.clientDispatcher.addServer(serverInfo);
            System.out.println("Se iniciaron todos los hilos");
            // Primer mensaje (100)
            serverSender.sendMessage(Settings.M_100_C(this.client.getMyIP(), this.client.getUsername()).create(100));

        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientThreadListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientThreadListener.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public synchronized void send_message(String message){
        serverInfo.mClientSender.sendMessage(message);
    }
    
}
