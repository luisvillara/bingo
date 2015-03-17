/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

/**
 *
 * @author Luis
 */
public class ClientFrameDesign extends javax.swing.JFrame {

    /**
     * Creates new form ClientFrameDesign
     */
    public ClientFrameDesign() {
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
        client_type_content = new javax.swing.JPanel();
        client_type_select = new javax.swing.JComboBox();
        client_type_btn = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menu_file_close = new javax.swing.JMenuItem();
        menu_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        client_type_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        client_type_btn.setText("jButton1");
        client_type_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_type_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout client_type_contentLayout = new javax.swing.GroupLayout(client_type_content);
        client_type_content.setLayout(client_type_contentLayout);
        client_type_contentLayout.setHorizontalGroup(
            client_type_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_type_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(client_type_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(client_type_select, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(client_type_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        client_type_contentLayout.setVerticalGroup(
            client_type_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_type_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(client_type_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(client_type_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout content_viewLayout = new javax.swing.GroupLayout(content_view);
        content_view.setLayout(content_viewLayout);
        content_viewLayout.setHorizontalGroup(
            content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_viewLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(client_type_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        content_viewLayout.setVerticalGroup(
            content_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_viewLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(client_type_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        menu_file.setText("Archivo");

        menu_file_close.setText("Cerrar");
        menu_file_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_file_closeActionPerformed(evt);
            }
        });
        menu_file.add(menu_file_close);

        menu.add(menu_file);

        menu_help.setText("Ayuda");
        menu.add(menu_help);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_file_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_file_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_file_closeActionPerformed

    private void client_type_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_type_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_type_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ClientFrameDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrameDesign().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton client_type_btn;
    private javax.swing.JPanel client_type_content;
    private javax.swing.JComboBox client_type_select;
    private javax.swing.JPanel content_view;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenuItem menu_file_close;
    private javax.swing.JMenu menu_help;
    // End of variables declaration//GEN-END:variables
}
