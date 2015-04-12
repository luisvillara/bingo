/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.lib;

import bingo_client.gui.ClientConfDialog;
import bingo_client.gui.ClientContainerFrame;
import bingo_client.gui.ClientsTable;
import bingo_client.views.ClientView;
import bingo_client.views.client.Client;
import bingo_client.views.server.Server;
import bingo_client.views.server.ServerList;

/**
 *
 * @author Luis
 */
public interface ClientDelegate {
    public void did_client_type_view(ClientView client_view);
    public ClientContainerFrame did_client_server_view(ClientView client_view);
    public ClientConfDialog did_client_client_conf_dialog_view(Client client);
    public ClientContainerFrame did_client_client_view(Client client);
    public void remove_client_type_view();
    // Server GUI functions
    public void show_server_info(Server server, ClientContainerFrame client_server_frame);
    public void show_client_info(Client client, ClientContainerFrame client_server_frame);
    // Client Dialog functions
    public void set_server(ServerList server, ClientConfDialogDelegate client_conf_dialog_delegate);
    
    public void update_console(String message, ClientContainerFrame client_server_frame);
    public void update_clients_table(ClientsTable model, ClientContainerFrame client_server_frame);
}
