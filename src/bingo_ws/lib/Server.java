/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.io.*;
import java.net.*;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends Thread
{
    public Server(){
        
    }

    @Override
    public void run() {
        while(true){
            String messageStr = "";
            try {
                messageStr = InetAddress.getLocalHost().getHostAddress().toString();
            } catch (UnknownHostException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            int server_port = 50008; //port that I’m using
            try {
                DatagramSocket s = new DatagramSocket();
                InetAddress local = InetAddress.getByName("192.168.0.255");//my broadcast ip
                int msg_length = messageStr.length();
                byte[] message = messageStr.getBytes();
                DatagramPacket p = new DatagramPacket(message, msg_length, local, server_port);
                s.send(p);
                System.out.println("Envio!");
            } catch (Exception e) {
                System.out.println("Error!");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
