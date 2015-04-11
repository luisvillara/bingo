/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class ClientMulticastThread extends Thread {
    
    private MulticastSocket socket;
    
    public ClientMulticastThread(MulticastSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                byte[] buffer = new byte[1000];
                DatagramPacket packg = new DatagramPacket(buffer, buffer.length);
                this.socket.receive(packg);
                String received = new String(packg.getData());
                System.out.println("Grupo Multicast " + received);
            } catch (IOException ex) {
                Logger.getLogger(ClientMulticastThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
