/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class WSFunctions {
    public WSFunctions(){
        
    }
    public static void broadcastIPAddress(){
        try {
            Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
            while (en.hasMoreElements()) {
                NetworkInterface ni = en.nextElement();
                System.out.println(" Display Name = " + ni.getDisplayName());

                List<InterfaceAddress> list = ni.getInterfaceAddresses();
                Iterator<InterfaceAddress> it = list.iterator();

                while (it.hasNext()) {
                    InterfaceAddress ia = it.next();
                    System.out.println(" Broadcast = " + ia.getBroadcast());
                }
            }
        } catch (SocketException ex) {
            Logger.getLogger(WSFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}