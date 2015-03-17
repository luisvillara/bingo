/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import bingo_client.bingo_client.Settings;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Luis
 */
public class ServerSocketLib extends Thread {
    private ServerSocket serverSocket = null;
    
    public ServerSocketLib(){
        try {
           serverSocket = new ServerSocket(Settings.LISTENING_PORT);
           System.out.println("NakovChatServer started on port " + Settings.LISTENING_PORT);
        } catch (IOException se) {
           System.err.println("Can not start listening on port " + Settings.LISTENING_PORT);
           se.printStackTrace();
           System.exit(-1);
        }
    }

    @Override
    public void run() {
        // Start ServerDispatcher thread
        ServerDispatcher serverDispatcher = new ServerDispatcher();
        serverDispatcher.start();

        // Accept and handle client connections
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                ClientInfo clientInfo = new ClientInfo();
                clientInfo.mSocket = socket;
                ClientListener clientListener =
                        new ClientListener(clientInfo, serverDispatcher);
                ClientSender clientSender =
                        new ClientSender(clientInfo, serverDispatcher);
                clientInfo.mClientListener = clientListener;
                clientInfo.mClientSender = clientSender;
                clientListener.start();
                clientSender.start();
                serverDispatcher.addClient(clientInfo);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
    
    
}
