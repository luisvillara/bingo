/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.server;

import bingo_ws.lib.MD5;
import java.net.InetAddress;

/**
 *
 * @author Luis
 */
public class ServerList {
    private String id;
    private InetAddress serverIP;
    private String nombre;

    public ServerList(InetAddress serverIP) {
        this.id = MD5.MD5(serverIP.toString());
        this.serverIP = serverIP;
        this.nombre = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InetAddress getServerIP() {
        return serverIP;
    }

    public void setServerIP(InetAddress serverIP) {
        this.serverIP = serverIP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object object){
        boolean exists = false;
        if (object != null && object instanceof ServerList)
        {
            exists = this.id.equals(((ServerList) object).id);
        }
        return exists;
    }
    
    
}
