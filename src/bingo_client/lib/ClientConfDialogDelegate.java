/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.lib;

import bingo_client.views.server.ServerList;

/**
 *
 * @author Luis
 */
public interface ClientConfDialogDelegate {
    public void set_server_client_conf_dialog(ServerList server);
    public void entrar_servidor(String username);
}
