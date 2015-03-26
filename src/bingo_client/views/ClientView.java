/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.views;

import bingo_client.bingo_client.Settings;
import bingo_client.gui.ClientFrameDelegate;
import bingo_client.gui.ClientTypeContent;
import bingo_client.lib.ClientConfDialogDelegate;
import bingo_client.lib.ClientDelegate;
import bingo_client.views.client.Client;
import bingo_client.views.server.Server;
import bingo_client.views.server.ServerList;
import javax.swing.SwingWorker;
import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public class ClientView extends SwingWorker<Void, Void> implements ClientFrameDelegate {
    
    private ClientDelegate delegate;
    
    public ClientView(ClientDelegate delegate) {
        this.delegate = delegate;
    }
    
    public void beginApp(){
        // Empiezo con la primera vista
        client_type_view(); 
    }
    
    public void client_type_view(){
        this.delegate.did_client_type_view(this);
    }
    
    public void client_server_view(){
        // Inicializo al servidor
        Server server = new Server(this);
        // Va a anunciarse
        server.start();
        // Empieza el hilo que escucha clientes
        server.startServerDispatcher();
    } 
    
    public void client_client_view(){
        Client client = new Client(this);
        client.start();
    }

    @Override
    protected Void doInBackground() throws Exception {
        beginApp();
        return null;
    }

    @Override
    public void exe_client_type_view(int option_value) {
        if(option_value == 0){
            client_client_view();
        }else if(option_value == 1){
            client_server_view();
            this.delegate.remove_client_type_view();
        }
    }

    public ClientDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(ClientDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public void process_message(JSONObject message, int code) {
        if(code == Settings.CODE_100){
            // Conexión
            
        }
    }
    
}
