/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.io.*;
import java.net.*;

public class Client extends Thread
{
    public void run() {
        String text;
        int server_port = 50008;
        while(true){
            byte[] message = new byte[1500];
            try {
                DatagramPacket p = new DatagramPacket(message, message.length);
                DatagramSocket s = new DatagramSocket(server_port);
                s.receive(p);
                text = new String(message, 0, p.getLength());
                System.out.println("Llego!");
                System.out.println(new String(message));
                s.close();
            } catch (Exception e) {
                System.out.println("Error!2");
            }
        }
    }
}
