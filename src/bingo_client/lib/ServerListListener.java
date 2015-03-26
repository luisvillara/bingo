/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.lib;

import bingo_client.views.server.ServerList;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Luis
 */
public class ServerListListener extends MouseAdapter {
    private ServerList server;
    public ServerListListener(ServerList server) {
        this.server = server;
    }

    public ServerList getServer() {
        return server;
    }

    public void setServer(ServerList server) {
        this.server = server;
    }
    
}
