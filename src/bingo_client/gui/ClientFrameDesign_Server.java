/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

/**
 *
 * @author Luis
 */
public class ClientFrameDesign_Server extends javax.swing.JFrame {

    /**
     * Creates new form ClientFrameDesign
     */
    public ClientFrameDesign_Server() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        content_view = new javax.swing.JPanel();
        content_head = new javax.swing.JPanel();
        content_head_info = new javax.swing.JPanel();
        head_info_A = new javax.swing.JPanel();
        head_info_A_type = new javax.swing.JPanel();
        head_info_A_type_label = new javax.swing.JLabel();
        head_info_A_status = new javax.swing.JPanel();
        head_info_A_status_count_label = new javax.swing.JLabel();
        head_info_A_status_count = new javax.swing.JLabel();
        head_info_A_status_estado_label = new javax.swing.JLabel();
        head_info_A_status_estado = new javax.swing.JLabel();
        head_info_A_status_btn = new javax.swing.JButton();
        head_info_B = new javax.swing.JPanel();
        head_info_B_bingo = new javax.swing.JPanel();
        head_info_B_bingo_stats = new javax.swing.JPanel();
        head_info_B_bingo_porllamar_label = new javax.swing.JLabel();
        head_info_B_bingo_porllamar = new javax.swing.JLabel();
        head_info_B_bingo_cantadas_label = new javax.swing.JLabel();
        head_info_B_bingo_cantadas = new javax.swing.JLabel();
        head_info_B_bingo_top = new javax.swing.JPanel();
        head_info_B_bingo_5 = new javax.swing.JPanel();
        head_info_B_bingo_5_label = new javax.swing.JLabel();
        head_info_B_bingo_4 = new javax.swing.JPanel();
        head_info_B_bingo_4_label = new javax.swing.JLabel();
        head_info_B_bingo_3 = new javax.swing.JPanel();
        head_info_B_bingo_3_label = new javax.swing.JLabel();
        head_info_B_bingo_2 = new javax.swing.JPanel();
        head_info_B_bingo_2_label = new javax.swing.JLabel();
        head_info_B_bingo_1 = new javax.swing.JPanel();
        head_info_B_bingo_1_label = new javax.swing.JLabel();
        content_head_bingo_numbers = new javax.swing.JPanel();
        content_body_A = new javax.swing.JPanel();
        content_body_A_table_scrollPane = new javax.swing.JScrollPane();
        content_body_A_table = new javax.swing.JTable();
        content_body_B = new javax.swing.JPanel();
        content_body_B_historic_scrollPane = new javax.swing.JScrollPane();
        content_body_B_historic = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        menu_file_close = new javax.swing.JMenuItem();
        menu_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content_view.setLayout(new javax.swing.BoxLayout(content_view, javax.swing.BoxLayout.Y_AXIS));

        content_head.setLayout(new javax.swing.BoxLayout(content_head, javax.swing.BoxLayout.LINE_AXIS));

        content_head_info.setPreferredSize(new java.awt.Dimension(400, 200));
        content_head_info.setLayout(new javax.swing.BoxLayout(content_head_info, javax.swing.BoxLayout.LINE_AXIS));

        head_info_A.setPreferredSize(new java.awt.Dimension(400, 200));

        head_info_A_type_label.setText("Servidor - 192.168.0.101");

        javax.swing.GroupLayout head_info_A_typeLayout = new javax.swing.GroupLayout(head_info_A_type);
        head_info_A_type.setLayout(head_info_A_typeLayout);
        head_info_A_typeLayout.setHorizontalGroup(
            head_info_A_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_A_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_A_type_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        head_info_A_typeLayout.setVerticalGroup(
            head_info_A_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_A_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_A_type_label, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        head_info_A_status_count_label.setText("Conectados:");

        head_info_A_status_count.setText("15");

        head_info_A_status_estado_label.setText("Estado del juego:");

        head_info_A_status_estado.setText("Iniciado");

        head_info_A_status_btn.setText("Conectado");
        head_info_A_status_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                head_info_A_status_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout head_info_A_statusLayout = new javax.swing.GroupLayout(head_info_A_status);
        head_info_A_status.setLayout(head_info_A_statusLayout);
        head_info_A_statusLayout.setHorizontalGroup(
            head_info_A_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_A_statusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_info_A_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(head_info_A_status_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(head_info_A_statusLayout.createSequentialGroup()
                        .addGroup(head_info_A_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(head_info_A_statusLayout.createSequentialGroup()
                                .addComponent(head_info_A_status_count_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(head_info_A_status_count))
                            .addGroup(head_info_A_statusLayout.createSequentialGroup()
                                .addComponent(head_info_A_status_estado_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(head_info_A_status_estado)))
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        head_info_A_statusLayout.setVerticalGroup(
            head_info_A_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_A_statusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_info_A_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(head_info_A_status_count_label)
                    .addComponent(head_info_A_status_count))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(head_info_A_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(head_info_A_status_estado_label)
                    .addComponent(head_info_A_status_estado))
                .addGap(18, 18, 18)
                .addComponent(head_info_A_status_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout head_info_ALayout = new javax.swing.GroupLayout(head_info_A);
        head_info_A.setLayout(head_info_ALayout);
        head_info_ALayout.setHorizontalGroup(
            head_info_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_ALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_info_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(head_info_A_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(head_info_A_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        head_info_ALayout.setVerticalGroup(
            head_info_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_A_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(head_info_A_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        content_head_info.add(head_info_A);

        head_info_B.setPreferredSize(new java.awt.Dimension(400, 200));

        head_info_B_bingo.setLayout(new javax.swing.BoxLayout(head_info_B_bingo, javax.swing.BoxLayout.Y_AXIS));

        head_info_B_bingo_porllamar_label.setText("Por llamar:");

        head_info_B_bingo_porllamar.setText("15");

        head_info_B_bingo_cantadas_label.setText("Cantadas:");

        head_info_B_bingo_cantadas.setText("5");

        javax.swing.GroupLayout head_info_B_bingo_statsLayout = new javax.swing.GroupLayout(head_info_B_bingo_stats);
        head_info_B_bingo_stats.setLayout(head_info_B_bingo_statsLayout);
        head_info_B_bingo_statsLayout.setHorizontalGroup(
            head_info_B_bingo_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_B_bingo_statsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_info_B_bingo_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(head_info_B_bingo_statsLayout.createSequentialGroup()
                        .addComponent(head_info_B_bingo_porllamar_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(head_info_B_bingo_porllamar))
                    .addGroup(head_info_B_bingo_statsLayout.createSequentialGroup()
                        .addComponent(head_info_B_bingo_cantadas_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(head_info_B_bingo_cantadas)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        head_info_B_bingo_statsLayout.setVerticalGroup(
            head_info_B_bingo_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_B_bingo_statsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_info_B_bingo_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(head_info_B_bingo_porllamar_label)
                    .addComponent(head_info_B_bingo_porllamar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(head_info_B_bingo_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(head_info_B_bingo_cantadas_label)
                    .addComponent(head_info_B_bingo_cantadas))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        head_info_B_bingo.add(head_info_B_bingo_stats);

        head_info_B_bingo_top.setLayout(new javax.swing.BoxLayout(head_info_B_bingo_top, javax.swing.BoxLayout.LINE_AXIS));

        head_info_B_bingo_5_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_5_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_info_B_bingo_5_label.setText("1");

        javax.swing.GroupLayout head_info_B_bingo_5Layout = new javax.swing.GroupLayout(head_info_B_bingo_5);
        head_info_B_bingo_5.setLayout(head_info_B_bingo_5Layout);
        head_info_B_bingo_5Layout.setHorizontalGroup(
            head_info_B_bingo_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_5_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        head_info_B_bingo_5Layout.setVerticalGroup(
            head_info_B_bingo_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_5_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        head_info_B_bingo_top.add(head_info_B_bingo_5);

        head_info_B_bingo_4_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_4_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_info_B_bingo_4_label.setText("1");

        javax.swing.GroupLayout head_info_B_bingo_4Layout = new javax.swing.GroupLayout(head_info_B_bingo_4);
        head_info_B_bingo_4.setLayout(head_info_B_bingo_4Layout);
        head_info_B_bingo_4Layout.setHorizontalGroup(
            head_info_B_bingo_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_4_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        head_info_B_bingo_4Layout.setVerticalGroup(
            head_info_B_bingo_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_4_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        head_info_B_bingo_top.add(head_info_B_bingo_4);

        head_info_B_bingo_3_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_3_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_info_B_bingo_3_label.setText("1");

        javax.swing.GroupLayout head_info_B_bingo_3Layout = new javax.swing.GroupLayout(head_info_B_bingo_3);
        head_info_B_bingo_3.setLayout(head_info_B_bingo_3Layout);
        head_info_B_bingo_3Layout.setHorizontalGroup(
            head_info_B_bingo_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_3_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        head_info_B_bingo_3Layout.setVerticalGroup(
            head_info_B_bingo_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_3_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        head_info_B_bingo_top.add(head_info_B_bingo_3);

        head_info_B_bingo_2_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_2_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_info_B_bingo_2_label.setText("1");

        javax.swing.GroupLayout head_info_B_bingo_2Layout = new javax.swing.GroupLayout(head_info_B_bingo_2);
        head_info_B_bingo_2.setLayout(head_info_B_bingo_2Layout);
        head_info_B_bingo_2Layout.setHorizontalGroup(
            head_info_B_bingo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        head_info_B_bingo_2Layout.setVerticalGroup(
            head_info_B_bingo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        head_info_B_bingo_top.add(head_info_B_bingo_2);

        head_info_B_bingo_1_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_1_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head_info_B_bingo_1_label.setText("1");

        javax.swing.GroupLayout head_info_B_bingo_1Layout = new javax.swing.GroupLayout(head_info_B_bingo_1);
        head_info_B_bingo_1.setLayout(head_info_B_bingo_1Layout);
        head_info_B_bingo_1Layout.setHorizontalGroup(
            head_info_B_bingo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        head_info_B_bingo_1Layout.setVerticalGroup(
            head_info_B_bingo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head_info_B_bingo_1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        head_info_B_bingo_top.add(head_info_B_bingo_1);

        head_info_B_bingo.add(head_info_B_bingo_top);

        javax.swing.GroupLayout head_info_BLayout = new javax.swing.GroupLayout(head_info_B);
        head_info_B.setLayout(head_info_BLayout);
        head_info_BLayout.setHorizontalGroup(
            head_info_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_B_bingo, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );
        head_info_BLayout.setVerticalGroup(
            head_info_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_info_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_B_bingo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        content_head_info.add(head_info_B);

        content_head.add(content_head_info);

        content_head_bingo_numbers.setLayout(new java.awt.GridLayout(3, 5));
        content_head.add(content_head_bingo_numbers);

        content_view.add(content_head);

        content_body_A.setPreferredSize(new java.awt.Dimension(800, 300));

        content_body_A_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        content_body_A_table_scrollPane.setViewportView(content_body_A_table);

        javax.swing.GroupLayout content_body_ALayout = new javax.swing.GroupLayout(content_body_A);
        content_body_A.setLayout(content_body_ALayout);
        content_body_ALayout.setHorizontalGroup(
            content_body_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_body_ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_A_table_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        content_body_ALayout.setVerticalGroup(
            content_body_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_body_ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_A_table_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        content_view.add(content_body_A);

        content_body_B.setPreferredSize(new java.awt.Dimension(800, 250));

        content_body_B_historic.setColumns(20);
        content_body_B_historic.setRows(5);
        content_body_B_historic_scrollPane.setViewportView(content_body_B_historic);

        javax.swing.GroupLayout content_body_BLayout = new javax.swing.GroupLayout(content_body_B);
        content_body_B.setLayout(content_body_BLayout);
        content_body_BLayout.setHorizontalGroup(
            content_body_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_body_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_B_historic_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        content_body_BLayout.setVerticalGroup(
            content_body_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_body_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_B_historic_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        content_view.add(content_body_B);

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
            .addComponent(content_view, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_file_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_file_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_file_closeActionPerformed

    private void head_info_A_status_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_head_info_A_status_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_head_info_A_status_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ClientFrameDesign_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientFrameDesign_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrameDesign_Server().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content_body_A;
    private javax.swing.JTable content_body_A_table;
    private javax.swing.JScrollPane content_body_A_table_scrollPane;
    private javax.swing.JPanel content_body_B;
    private javax.swing.JTextArea content_body_B_historic;
    private javax.swing.JScrollPane content_body_B_historic_scrollPane;
    private javax.swing.JPanel content_head;
    private javax.swing.JPanel content_head_bingo_numbers;
    private javax.swing.JPanel content_head_info;
    private javax.swing.JPanel content_view;
    private javax.swing.JPanel head_info_A;
    private javax.swing.JPanel head_info_A_status;
    private javax.swing.JButton head_info_A_status_btn;
    private javax.swing.JLabel head_info_A_status_count;
    private javax.swing.JLabel head_info_A_status_count_label;
    private javax.swing.JLabel head_info_A_status_estado;
    private javax.swing.JLabel head_info_A_status_estado_label;
    private javax.swing.JPanel head_info_A_type;
    private javax.swing.JLabel head_info_A_type_label;
    private javax.swing.JPanel head_info_B;
    private javax.swing.JPanel head_info_B_bingo;
    private javax.swing.JPanel head_info_B_bingo_1;
    private javax.swing.JLabel head_info_B_bingo_1_label;
    private javax.swing.JPanel head_info_B_bingo_2;
    private javax.swing.JLabel head_info_B_bingo_2_label;
    private javax.swing.JPanel head_info_B_bingo_3;
    private javax.swing.JLabel head_info_B_bingo_3_label;
    private javax.swing.JPanel head_info_B_bingo_4;
    private javax.swing.JLabel head_info_B_bingo_4_label;
    private javax.swing.JPanel head_info_B_bingo_5;
    private javax.swing.JLabel head_info_B_bingo_5_label;
    private javax.swing.JLabel head_info_B_bingo_cantadas;
    private javax.swing.JLabel head_info_B_bingo_cantadas_label;
    private javax.swing.JLabel head_info_B_bingo_porllamar;
    private javax.swing.JLabel head_info_B_bingo_porllamar_label;
    private javax.swing.JPanel head_info_B_bingo_stats;
    private javax.swing.JPanel head_info_B_bingo_top;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenuItem menu_file_close;
    private javax.swing.JMenu menu_help;
    // End of variables declaration//GEN-END:variables
}
