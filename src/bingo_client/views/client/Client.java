/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.client;

import bingo_client.bingo_client.Settings;
import bingo_client.gui.ClientConfDialog;
import bingo_client.gui.ClientContainerFrame;
import bingo_client.lib.ClientConfDialogDelegate;
import bingo_client.lib.ClientDelegate;
import bingo_client.views.ClientView;
import bingo_client.views.server.Server;
import bingo_client.views.server.ServerList;
import bingo_ws.lib.Json;
import bingo_ws.lib.ServerDelegate;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.json.JSONException;
import org.json.JSONObject;

public class Client extends Thread implements ClientConfDialogDelegate , ServerDelegate
{
    private ArrayList<ServerList> serversIP;
    public static String hostname = "localhost";
    public boolean first_server;
    public int server_count;
    
    private ClientDelegate delegate;
    
    private ClientConfDialog client_conf_dialog;
    
    private ServerList server;
    private String username;
    private String myIP;
    
    private ClientThreadListener clientThreadListener;
    
    private ClientView client_view;
    
    private ClientContainerFrame container_frame;
    
    public Client(ClientView client_view){
        this.client_view = client_view;
        this.delegate = client_view.getDelegate();
        serversIP = new ArrayList<ServerList>();
        first_server = false;
        server_count = 0;
        try {
            myIP = InetAddress.getLocalHost().getHostAddress().toString();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Inicializo el Dialog
        client_conf_dialog = this.delegate.did_client_client_conf_dialog_view(this);
    }
    
    public void receiveServersAnnounce(){
        while(Settings.RECEIVE_ANNOUNCE_SERVER){
            String text = "";
            byte[] message = new byte[Settings.MAX_BYTES];
            try {
                DatagramPacket p = new DatagramPacket(message, message.length);
                DatagramSocket s = new DatagramSocket(Settings.UDP_SERVER_PORT);
                s.receive(p);
                // Guardo la IP de servidores
                ServerList server = new ServerList(p.getAddress());
                System.out.println(new String(p.getData()));
                JSONObject ser = new JSONObject(new String(p.getData()));
                server.setNombre(ser.getString("SALA"));
                addServer(server);
                text = new String(message, 0, p.getLength());
                s.close();
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Error al recibir servidor");
            }
        }
    }
    
    public void addServer(ServerList server){
        if(!serversIP.contains(server)){
            System.out.println("Agrego un nuevo servidor: " + server.getNombre());
            serversIP.add(server);
            this.delegate.set_server(server, this.client_conf_dialog);
        }
    }
    
    public void connectingToServer(){
        ClientDispatcher client_dispatcher = new ClientDispatcher(this);
        client_dispatcher.start();
        clientThreadListener = new ClientThreadListener(this, client_dispatcher);
        clientThreadListener.start();
    }
    
    public void run() {
        // El cliente inicializa recibiendo servidores por Broadcast
        receiveServersAnnounce();
    }

    @Override
    public void set_server_client_conf_dialog(ServerList server) {
        this.server = server;
    }

    @Override
    public void entrar_servidor(String username) {
        this.client_conf_dialog.dispose();
        this.delegate.remove_client_type_view();
        this.container_frame = this.delegate.did_client_client_view(this);
        this.delegate.show_client_info(this, this.container_frame);
        this.username = username;
        connectingToServer();
    }
    
    public void joinMulticastGroup(){
        try {
            MulticastSocket socket = new MulticastSocket(Settings.UDP_MULTICAST_PORT);
            InetAddress group = InetAddress.getByName(Settings.MULTICAST_IPADDRESS);
            socket.joinGroup(group);
            ClientMulticastThread client_multicast_thread = new ClientMulticastThread(socket);
            client_multicast_thread.start();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ServerList getServer() {
        return server;
    }

    public void setServer(ServerList server) {
        this.server = server;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMyIP() {
        return myIP;
    }

    public void setMyIP(String myIP) {
        this.myIP = myIP;
    }

    @Override
    public void process_message(String senderIP, JSONObject message, int code) {
        if(code == 101){
            try {
                System.out.println("ID del juego es " + message.getString("IDJUEGO"));
                this.delegate.update_console(
                        senderIP + ": Ha entrado a un nuevo juego",
                        this.container_frame);
                // Me uno al grupo Multicast
                joinMulticastGroup();
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Nro. Cartones:");
                JTextField pass = new JTextField();
                pass.setSize(100, 35);
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
                panel.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addContainerGap()));
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(0, Short.MAX_VALUE)));
                String[] options = new String[]{"Continuar"};
                int option = JOptionPane.showOptionDialog(null, panel, "Número de cartones",
                        JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, 0);
                String cartones = pass.getText();
                Json mensaje = new Json();
                mensaje.set_entry_int("NroCartones", Integer.parseInt(cartones));
                clientThreadListener.send_message(Settings.M_102_C(Integer.parseInt(cartones)).create(102));
            } catch (JSONException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(code == 103){
            this.delegate.update_console(
                    senderIP + ": Se han enviado sus cartones",
                    this.container_frame);
        }
    }

    
}
