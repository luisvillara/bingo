/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Luis
 */
public class ClientTypeContent extends JPanel {
    private ClientFrameDelegate delegate;
    private javax.swing.JButton client_type_btn;
    private javax.swing.JComboBox client_type_select;

    public ClientTypeContent(ClientFrameDelegate delegate) {
        this.delegate = delegate;
        initComponents();
    }
    
    public void initComponents(){
        setBackground(Color.white);
        client_type_select = new javax.swing.JComboBox();
        client_type_btn = new javax.swing.JButton();
        client_type_select.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Cliente", "Servidor"}));
        client_type_btn.setText("Seleccionar");
        client_type_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delegate.exe_client_type_view(client_type_select.getSelectedIndex());
            }
        });
        javax.swing.GroupLayout client_type_contentLayout = new javax.swing.GroupLayout(this);
        this.setLayout(client_type_contentLayout);
        client_type_contentLayout.setHorizontalGroup(
                client_type_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(client_type_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(client_type_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(client_type_select, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(client_type_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap()));
        client_type_contentLayout.setVerticalGroup(
                client_type_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(client_type_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(client_type_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(client_type_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap()));
    }
    
    public int execute(int option_value){
        return option_value;
    }
}
