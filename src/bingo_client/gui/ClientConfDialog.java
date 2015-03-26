/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import bingo_client.lib.ClientConfDialogDelegate;
import bingo_client.lib.ClientDelegate;
import bingo_client.lib.ServerListListener;
import bingo_client.resources.Button;
import bingo_client.resources.Label;
import bingo_client.resources.Panel;
import bingo_client.views.ClientView;
import bingo_client.views.server.Server;
import bingo_client.views.server.ServerList;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class ClientConfDialog extends JDialog implements ClientConfDialogDelegate {
    private Panel content_view;
    private Button enter_btn;
    private javax.swing.JPanel form_container;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_label;
    private javax.swing.JPanel serverlist_container;
    private Label serverlist_label;
    private javax.swing.JScrollPane serverlist_scroll;
    
    private ClientConfDialogDelegate delegate;

    public ClientConfDialog(ClientConfDialogDelegate delegate, JFrame frame) {
        super(frame);
        this.delegate = delegate;
        setModal(true);
        setTitle("Configuración del cliente");
        setSize(420, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0xeab30c));
        initComponents();
    }
    
    public void initComponents(){
        content_view = new Panel("STYLE1", 0xfad111, 0xfad111, 0xfad111, 0xfad111, 0);
        serverlist_scroll = new javax.swing.JScrollPane();
        serverlist_container = new javax.swing.JPanel();
        serverlist_label = new Label("STYLE5");
        form_container = new javax.swing.JPanel();
        enter_btn = new Button(0x58cb3d,0x37ad42,0x288e31,0xffffff);
        name_label = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        
        form_container.setOpaque(false);
        serverlist_container.setBackground(new Color(0xfad111));
                
        serverlist_container.setLayout(new org.jdesktop.swingx.VerticalLayout());

        serverlist_container.setBorder(null);
        serverlist_scroll.setBorder(null);
        serverlist_scroll.setViewportView(serverlist_container);

        serverlist_label.setText("Selección de servidor");

        enter_btn.setText("Entrar");
        enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String username = name.getText();
                if(username.length() > 0)
                    delegate.entrar_servidor(name.getText());
                else
                    JOptionPane.showMessageDialog(ClientConfDialog.this, "El nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        name_label.setText("Nombre del jugador:");

        javax.swing.GroupLayout form_containerLayout = new javax.swing.GroupLayout(form_container);
        form_container.setLayout(form_containerLayout);
        form_containerLayout.setHorizontalGroup(
            form_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(form_containerLayout.createSequentialGroup()
                        .addComponent(name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name)))
                .addContainerGap())
        );
        form_containerLayout.setVerticalGroup(
            form_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout content_viewLayout = new javax.swing.GroupLayout(content_view);
        content_view.setLayout(content_viewLayout);
        content_viewLayout.setHorizontalGroup(
            content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverlist_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(content_viewLayout.createSequentialGroup()
                        .addComponent(serverlist_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(form_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        content_viewLayout.setVerticalGroup(
            content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverlist_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverlist_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(form_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    @Override
    public void set_server_client_conf_dialog(ServerList server) {
        Label server_ip_label;
        final Panel server_item;
        
        server_item = new Panel("STYLE1", "ALIGN_BOTTOM", 0xffe66f, 0xffe66f, 0xeab30c, 0xeab30c);
        server_item.setHover(true, 0xeab30c);
        server_ip_label = new Label("STYLE5");
                
        server_ip_label.setText(server.getServerIP().toString() + " - " + server.getNombre());
        
        // Evento
        server_item.addMouseListener(new ServerListListener(server) {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delegate.set_server_client_conf_dialog(getServer());
                server_item.set_hover();
            }
        });
        
        javax.swing.GroupLayout server_itemLayout = new javax.swing.GroupLayout(server_item);
        server_item.setLayout(server_itemLayout);
        server_itemLayout.setHorizontalGroup(
            server_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_itemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(server_ip_label)
                .addContainerGap(0, Short.MAX_VALUE))
        );
        server_itemLayout.setVerticalGroup(
            server_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_itemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(server_ip_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        serverlist_container.add(server_item);
        
        serverlist_container.revalidate();
        
    }

    @Override
    public void entrar_servidor(String username) {
        
    }

}
