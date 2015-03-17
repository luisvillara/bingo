/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.bingo_client;

import bingo_client.gui.ClientFrame;
import bingo_client.views.ClientView;
import javax.swing.SwingUtilities;

/**
 *
 * @author Luis
 */
public class Main {

    private ClientView clientView;
    private ClientFrame clientFrame;
    
    public Main(){
        clientFrame = new ClientFrame();
        clientView = new ClientView(clientFrame);
    }
    
    public void init(){
        // Ejecuto el controlador
        clientView.execute();
        // Inicio la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                clientFrame.setVisible(true);
            }
        });
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }
}
