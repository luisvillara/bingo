/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import bingo_client.bingo_client.Settings;
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
    
    private ObjectInputStream in = null;
    private ObjectOutputStream out = null;
        
    public ClientThreadListener(ServerList server) {
        this.serverIp = server.getServerIP();
        System.out.println("Inicalizo el objeto " + serverIp.toString());
    }

    @Override
    public void run() {
        Socket socket;
        try {
            System.out.println("Abriendo socket");
            socket = new Socket(this.serverIp, Settings.TCP_SERVER_PORT);
            out = new ObjectOutputStream(socket.getOutputStream());
            //in = new ObjectInputStream(socket.getInputStream());
            System.out.println("Enviando mensajes desde cliente");
            out.write("Hola servidor".getBytes());
            out.flush();
            /*while (true) {
                Object object = null;
                try {
                    object = in.readObject();
                } catch (IOException e) {
                    System.out.println("IOException");
                } catch (ClassNotFoundException e) {
                    System.out.println("ClassNotFoundException");
                }
                if (object == null) {
                    System.out.println("El objeto es nulo");
                    break;
                }
            }*/
            // Enviando un mensaje
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientThreadListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientThreadListener.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
