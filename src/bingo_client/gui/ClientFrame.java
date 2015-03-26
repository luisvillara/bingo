/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import bingo_client.bingo_client.Settings;
import bingo_client.lib.ClientConfDialogDelegate;
import bingo_client.lib.ClientDelegate;
import bingo_client.resources.Panel;
import bingo_client.views.ClientView;
import bingo_client.views.client.Client;
import bingo_client.views.server.Server;
import bingo_client.views.server.ServerList;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Luis
 */
public class ClientFrame extends JFrame implements ClientDelegate {
    
    private Panel content_view;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenuItem menu_file_close;
    private javax.swing.JMenu menu_help;
    
    public ClientFrame() {
        init();
        initComponents();
    }
    
    public void init(){
        // Inicializar Frame
        setDefaultLookAndFeel();
        setTitle(Settings.BINGO_NAME);
        setMinimumSize(Settings.MIN_WINDOWSIZE);
        //setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setClosingWindowListener();
    }
    
    public void initComponents(){
        content_view = new Panel();
        content_view.setBackgroundImage("/images/bingo_bg.jpg", 1);
        menu = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menu_file_close = new javax.swing.JMenuItem();
        menu_help = new javax.swing.JMenu();
        menu_file.setText("Archivo");

        menu_file_close.setText("Cerrar");
        menu_file.add(menu_file_close);

        menu.add(menu_file);

        menu_help.setText("Ayuda");
        menu.add(menu_help);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(content_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(content_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }
    
    public void setDefaultLookAndFeel(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }
    }
    
    public void setClosingWindowListener(){
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                if (JOptionPane.showConfirmDialog(ClientFrame.this, "¿Está seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }
    
    public void content_viewRepaint(){
        this.content_view.revalidate();
        this.content_view.repaint();
    }

    @Override
    public void did_client_type_view(ClientView client_view) {
        ClientTypeContent client_type_content = new ClientTypeContent(client_view);
        javax.swing.GroupLayout content_viewLayout = new javax.swing.GroupLayout(this.content_view);
        this.content_view.setLayout(content_viewLayout);
        content_viewLayout.setHorizontalGroup(
                content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_viewLayout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(client_type_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)));
        content_viewLayout.setVerticalGroup(
                content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(content_viewLayout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(client_type_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)));
        content_viewRepaint();
    }

    @Override
    public void remove_client_type_view() {
        this.content_view.removeAll();
        content_viewRepaint();
    }

    @Override
    public ClientContainerFrame did_client_server_view(ClientView client_view) {
        ServerContent server_content = new ServerContent();
        ClientContainerFrame client_server_view = new ClientContainerFrame(client_view, (JPanel)server_content);
        javax.swing.GroupLayout content_viewLayout = new javax.swing.GroupLayout(this.content_view);
        this.content_view.setLayout(content_viewLayout);
        content_viewLayout.setHorizontalGroup(
                content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(client_server_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        content_viewLayout.setVerticalGroup(
                content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(client_server_view, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));
        content_viewRepaint();
        return client_server_view;
    }

    @Override
    public void show_server_info(Server server, ClientContainerFrame client_server_frame) {
        client_server_frame.setHead_info_A_type_label_text("Servidor: " + server.getMyIP());
    }

    @Override
    public ClientConfDialog did_client_client_conf_dialog_view(Client client) {
        final ClientConfDialog client_conf_dialog = new ClientConfDialog(client, this);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                client_conf_dialog.setVisible(true);
            }
        });
        return client_conf_dialog;
    }

    @Override
    public void set_server(ServerList server, ClientConfDialogDelegate client_conf_dialog_delegate) {
        client_conf_dialog_delegate.set_server_client_conf_dialog(server);
    }

    @Override
    public ClientContainerFrame did_client_client_view(Client client) {
        ClientContent client_content = new ClientContent();
        ClientContainerFrame client_client_view = new ClientContainerFrame(client, (JPanel)client_content);
        javax.swing.GroupLayout content_viewLayout = new javax.swing.GroupLayout(this.content_view);
        this.content_view.setLayout(content_viewLayout);
        content_viewLayout.setHorizontalGroup(
                content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(client_client_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        content_viewLayout.setVerticalGroup(
                content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(client_client_view, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));
        content_viewRepaint();
        return client_client_view;
    }

    @Override
    public void show_client_info(Client client, ClientContainerFrame client_server_frame) {
        client_server_frame.setHead_info_A_type_label_text("Cliente: " + client.getMyIP());
    }

    @Override
    public void update_console(String message, ClientContainerFrame client_server_frame) {
        client_server_frame.setContent_body_B_historic_text(message);
    }

    @Override
    public void update_clients_table(ClientsTable model, ClientContainerFrame client_server_frame) {
        client_server_frame.set_table_model(model);
    }
    
}
