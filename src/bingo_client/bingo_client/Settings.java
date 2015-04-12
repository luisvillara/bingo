/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.bingo_client;

import bingo_ws.lib.Json;
import java.awt.Dimension;
import org.json.JSONArray;

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
    public static String BROADCAST_IPADDRESS = "10.0.255.255";
    public static int UDP_SERVER_PORT = 10022;
    public static int TCP_SERVER_PORT = 10022;
    
    public static boolean ACCEPTING_CLIENTS = true;
    
    public static int CODE_100 = 100;
    
    // Mensajes
    public static Json M_105_S(String IP, String SALA){
        Json message = new Json();
        message.set_entry_string("IP", IP);
        message.set_entry_string("SALA", SALA);
        return message;
    }
    public static Json M_100_C(String IP, String CLIENTE){
        Json message = new Json();
        message.set_entry_string("IP", IP);
        message.set_entry_string("CLIENTE", CLIENTE);
        return message;
    }
    public static Json M_101_S(String IDJUEGO){
        Json message = new Json();
        message.set_entry_string("IDJUEGO", IDJUEGO);
        return message;
    }
    public static Json M_102_C(int NROCARTONES){
        Json message = new Json();
        message.set_entry_int("NROCARTONES", NROCARTONES);
        return message;
    }
    public static Json M_103_S(String IDCARTON, JSONArray NUMEROS){
        Json message = new Json();
        message.set_entry_string("IDCARTON", IDCARTON);
        message.set_entry_array("NUMEROS", NUMEROS);
        return message;
    }
    public static Json M_106_S (String IDCARTON, JSONArray NUMEROS){
        Json message = new Json();
        message.set_entry_string("IDCARTON", IDCARTON);
        message.set_entry_array("NUMEROS", NUMEROS);
        return message;
    }
}
