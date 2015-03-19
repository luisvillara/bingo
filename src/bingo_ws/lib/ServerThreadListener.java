/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import bingo_client.bingo_client.Settings;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class ServerThreadListener extends Thread {

    private ServerDispatcher serverDispatcher;
    private ServerSocket serverSocket;
    
    public ServerThreadListener(ServerDispatcher serverDispatcher) {
        this.serverDispatcher = serverDispatcher;
        try {
            serverSocket = new ServerSocket(Settings.TCP_SERVER_PORT);
        } catch (IOException ex) {
            Logger.getLogger(ServerThreadListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        while(Settings.ACCEPTING_CLIENTS){
            try {
                System.out.println("Esperando clientes...");
                Socket socket = serverSocket.accept();
                ClientInfo clientInfo = new ClientInfo();
                clientInfo.mSocket = socket;
                ClientListener clientListener = new ClientListener(clientInfo, this.serverDispatcher);
                ClientSender clientSender = new ClientSender(clientInfo, this.serverDispatcher);
                clientInfo.mClientListener = clientListener;
                clientInfo.mClientSender = clientSender;
                clientListener.start();
                clientSender.start();
                serverDispatcher.addClient(clientInfo);
                System.out.println("Primer cliente!!!");
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
