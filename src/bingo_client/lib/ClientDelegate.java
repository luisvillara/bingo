/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.lib;

import bingo_client.views.ClientView;

/**
 *
 * @author Luis
 */
public interface ClientDelegate {
    public void did_client_type_view(ClientView client_view);
    public void did_client_server_view(ClientView client_view);
    public void remove_client_type_view();
}
