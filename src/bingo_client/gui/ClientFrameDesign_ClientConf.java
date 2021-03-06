/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

/**
 *
 * @author Luis
 */
public class ClientFrameDesign_ClientConf extends javax.swing.JFrame {

    /**
     * Creates new form ClientFrameDesign
     */
    public ClientFrameDesign_ClientConf() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content_view = new javax.swing.JPanel();
        serverlist_scroll = new javax.swing.JScrollPane();
        serverlist_container = new javax.swing.JPanel();
        server_item = new javax.swing.JPanel();
        server_ip_label = new javax.swing.JLabel();
        serverlist_label = new javax.swing.JLabel();
        form_container = new javax.swing.JPanel();
        enter_btn = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serverlist_container.setLayout(new org.jdesktop.swingx.VerticalLayout());

        server_item.setPreferredSize(new java.awt.Dimension(398, 36));

        server_ip_label.setText("192.168.0.104");

        javax.swing.GroupLayout server_itemLayout = new javax.swing.GroupLayout(server_item);
        server_item.setLayout(server_itemLayout);
        server_itemLayout.setHorizontalGroup(
            server_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_itemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(server_ip_label)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        server_itemLayout.setVerticalGroup(
            server_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_itemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(server_ip_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        serverlist_container.add(server_item);

        serverlist_scroll.setViewportView(serverlist_container);

        serverlist_label.setText("Selección de servidor");

        enter_btn.setText("Entrar");
        enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_btnActionPerformed(evt);
            }
        });

        name_label.setText("Nombre del jugador:");

        name.setText("jTextField1");

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
    }// </editor-fold>//GEN-END:initComponents

    private void enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_ClientConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_ClientConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_ClientConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_ClientConf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrameDesign_ClientConf().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content_view;
    private javax.swing.JButton enter_btn;
    private javax.swing.JPanel form_container;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel server_ip_label;
    private javax.swing.JPanel server_item;
    private javax.swing.JPanel serverlist_container;
    private javax.swing.JLabel serverlist_label;
    private javax.swing.JScrollPane serverlist_scroll;
    // End of variables declaration//GEN-END:variables
}
