/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.server;

import bingo_client.views.server.ServerDispatcher;
import bingo_client.bingo_client.Settings;
import bingo_client.gui.ClientContainerFrame;
import bingo_client.gui.ClientsTable;
import bingo_client.lib.ClientDelegate;
import bingo_client.views.ClientView;
import bingo_ws.lib.Json;
import bingo_ws.lib.MD5;
import bingo_ws.lib.ServerDelegate;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Server extends Thread implements ServerDelegate
{
    private ClientView client_view;
    private ClientDelegate delegate;
    private String myIP;
    
    private ServerThreadListener serverListener;
    
    private ClientContainerFrame container_frame;
    
    private MulticastSocket msocket;
    
    public Server(ClientView client_view){
        this.client_view = client_view;
        this.delegate = client_view.getDelegate();
        try {
            myIP = InetAddress.getLocalHost().getHostAddress().toString();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        container_frame = this.delegate.did_client_server_view(this.client_view);
        this.delegate.show_server_info(this, this.container_frame);
    }

    public void initBroadcastAnnouncement(){
        System.out.println("Inicia anunciamiento del servidor");
        while(Settings.ANNOUNCE_SERVER){
            try {
                DatagramSocket s = new DatagramSocket();
                InetAddress local = InetAddress.getByName(Settings.BROADCAST_IPADDRESS);//my broadcast ip
                String msg = Settings.M_105_S(this.getMyIP(), "Luis V.").create(105);
                int msg_length = msg.length();
                byte[] message = msg.getBytes();
                DatagramPacket p = new DatagramPacket(message, msg_length, local, Settings.UDP_SERVER_PORT);
                s.send(p);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al anunciar servidor");
            }
            try {
                Thread.sleep(Settings.ANNOUNCE_SERVER_TIME);
            } catch (InterruptedException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void initMulticastGroup(){
        try {
            InetAddress group = InetAddress.getByName(Settings.MULTICAST_IPADDRESS);
            msocket = new MulticastSocket(Settings.UDP_MULTICAST_PORT);
            //socket.send(packg);
            System.out.println("Inicializo el grupo multicast");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void startServerDispatcher(){
        ServerDispatcher serverDispatcher = new ServerDispatcher(this);
        serverDispatcher.start();
        acceptingClients(serverDispatcher);
    }
    
    public void acceptingClients(ServerDispatcher serverDispatcher){
        serverListener = new ServerThreadListener(serverDispatcher);
        serverListener.start();
    }
    
    @Override
    public void run() {
        //WSFunctions.broadcastIPAddress();
        initBroadcastAnnouncement();
    }

    public String getMyIP() {
        return myIP;
    }

    public void setMyIP(String myIP) {
        this.myIP = myIP;
    }

    @Override
    public void process_message(String senderIP, JSONObject message, int code) {
        if(code == Settings.CODE_100){
            String username = "";
            try {
                username = message.getString("CLIENTE");
                this.delegate.update_console(
                        senderIP + ": Conexión establecida con el cliente " + username,
                        this.container_frame);
            } catch (JSONException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            ClientsTable clients_table = new ClientsTable();
            Vector clients = new Vector();
            clients.addElement(clients_table.new Data(1, senderIP, username, Settings.TCP_SERVER_PORT));
            clients_table.setData(clients);
            this.delegate.update_clients_table(clients_table, container_frame);
            // Conexión
            serverListener.send_message(Settings.M_101_S(MD5.MD5(this.getMyIP())).create(101));
            try {
                InetAddress group = InetAddress.getByName(Settings.MULTICAST_IPADDRESS);
                DatagramPacket packg = new DatagramPacket("hola".getBytes(), "hola".length(), group, Settings.UDP_MULTICAST_PORT);
                msocket.send(packg);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(code == 102){
            try {
                // Conexión
                int cant_cartones = message.getInt("NROCARTONES");
                this.delegate.update_console(
                    senderIP + ": El cliente pidió " + cant_cartones + " carton(es)",
                    this.container_frame);
                Json mensaje = new Json();
                JSONArray cartones = new JSONArray();
                int checksum;
                for(int i = 0; i < cant_cartones; i++){
                    checksum = 0;
                    Json carton = new Json();
                    int[][] board = new int[5][5];
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    int number = 0;
                    int index = 0;
                    int increment = 1;
                    int col = 0;

                    //Run a loop until you're at your last column.
                    while (col < board.length) {

                        //Ensure uniqueness of your numbers
                        while (list.size() < 5) {
                            number = (int) (Math.random() * 15) + increment;
                            if (!list.contains(number)) {
                                list.add(number);
                            }
                        }

                        //Add elements to the array.
                        int j = 0;
                        for (int h : list) {
                            checksum = checksum + h;
                            board[index][j++] = h;
                        }

                        //Set values for the next iteration.
                        index++;
                        increment += 15;
                        list.clear();
                        col++;
                    }
                    board[2][2] = 0;
                    System.out.println("CHECKSUM DEL CARTON: " + Integer.toString(checksum));
                    carton.set_entry_string("IDCARTON", MD5.MD5(Integer.toString(checksum)));
                    JSONArray numeros = new JSONArray(board);
                    carton.set_entry_array("NUMEROS", numeros);
                    serverListener.send_message(carton.create(103));
                    //cartones.put(carton.getMessage());
                }
                //mensaje.set_entry_array("Cartones", cartones);
                //serverListener.send_message(mensaje.create(103));
            } catch (JSONException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
