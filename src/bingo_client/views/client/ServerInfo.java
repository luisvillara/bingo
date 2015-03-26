/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views.client;

import java.net.Socket;

/**
 *
 * @author Luis
 */
public class ServerInfo
{
    public Socket mSocket = null;
    public ServerListener mClientListener = null;
    public ServerSender mClientSender = null;
}
