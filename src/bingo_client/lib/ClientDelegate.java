/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.lib;

import bingo_client.gui.ClientConfDialog;
import bingo_client.gui.ClientServerFrame;
import bingo_client.views.ClientView;
import bingo_ws.lib.Server;

/**
 *
 * @author Luis
 */
public interface ClientDelegate {
    public void did_client_type_view(ClientView client_view);
    public ClientServerFrame did_client_server_view(ClientView client_view);
    public ClientConfDialog did_client_client_view(ClientView client_view);
    public void remove_client_type_view();
    // Server GUI functions
    public void show_server_info(Server server, ClientServerFrame client_server_frame);
}
