/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import bingo_client.lib.ClientConfDialogDelegate;
import bingo_ws.lib.Server;
import bingo_ws.lib.ServerList;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Luis
 */
public class ClientConfDialog extends JDialog implements ClientConfDialogDelegate {
    private javax.swing.JPanel content_view;
    private javax.swing.JButton enter_btn;
    private javax.swing.JPanel form_container;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_label;
    private javax.swing.JPanel serverlist_container;
    private javax.swing.JLabel serverlist_label;
    private javax.swing.JScrollPane serverlist_scroll;

    public ClientConfDialog(JFrame frame) {
        super(frame);
        setModal(true);
        setTitle("Configuración del cliente");
        setSize(420, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0xffffff));
        initComponents();
    }
    
    public void initComponents(){
        content_view = new javax.swing.JPanel();
        serverlist_scroll = new javax.swing.JScrollPane();
        serverlist_container = new javax.swing.JPanel();
        serverlist_label = new javax.swing.JLabel();
        form_container = new javax.swing.JPanel();
        enter_btn = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        name = new javax.swing.JTextField();

        serverlist_container.setLayout(new org.jdesktop.swingx.VerticalLayout());

        serverlist_scroll.setViewportView(serverlist_container);

        serverlist_label.setText("Selección de servidor");

        enter_btn.setText("Entrar");

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
    public void set_server(ServerList server) {
        javax.swing.JLabel server_ip_label;
        javax.swing.JPanel server_item;
        
        server_item = new javax.swing.JPanel();
        server_ip_label = new javax.swing.JLabel();
        
        server_item.setBackground(Color.red);
                
        server_ip_label.setText(server.getServerIP().toString());

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
}
