/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.bingo_client;

import java.awt.Dimension;

/**
 *
 * @author Luis
 */
public class Settings {
    public static boolean DEBUG = true;
    
    public static String BINGO_NAME = "Bingo";
    
    public static Dimension MIN_WINDOWSIZE = new Dimension(1024, 600);
    
    public static int MAX_BYTES = 1500;
    
    public static boolean ANNOUNCE_SERVER = true;
    public static boolean RECEIVE_ANNOUNCE_SERVER = true;
    public static int ANNOUNCE_SERVER_TIME = 5000;
    public static String BROADCAST_IPADDRESS = "192.168.0.255";
    public static int UDP_SERVER_PORT = 10022;
    public static int TCP_SERVER_PORT = 10022;
    
    public static boolean ACCEPTING_CLIENTS = true;
}
