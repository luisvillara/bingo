/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_ws.lib;

import java.net.InetAddress;

/**
 *
 * @author Luis
 */
public class ServerList {
    private String id;
    private InetAddress serverIP;

    public ServerList(InetAddress serverIP) {
        this.id = MD5.MD5(serverIP.toString());
        this.serverIP = serverIP;
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
