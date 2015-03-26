/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Luis
 */
public class ServerContent extends JPanel {
    private javax.swing.JTable content_body_A_table;

    public ServerContent() {
        initComponents();
    }
    
    public void initComponents(){
        content_body_A_table = new javax.swing.JTable();
        content_body_A_table.setBackground(new Color(0x1c4138));
        content_body_A_table.setBorder(BorderFactory.createLineBorder(new Color(0x1c5c4f)));
        content_body_A_table.setGridColor(new java.awt.Color(0x1c5c4f));
        content_body_A_table.setRowHeight(25);
        content_body_A_table.setRowMargin(5);
        content_body_A_table.setForeground(new java.awt.Color(0xffffff));
        content_body_A_table.setShowVerticalLines(false);
        javax.swing.GroupLayout content_body_ALayout = new javax.swing.GroupLayout(this);
        this.setLayout(content_body_ALayout);
        content_body_ALayout.setHorizontalGroup(
            content_body_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_body_ALayout.createSequentialGroup()
                .addGap(0,0,0)
                .addComponent(content_body_A_table, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addGap(0,0,0))
        );
        content_body_ALayout.setVerticalGroup(
            content_body_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_body_ALayout.createSequentialGroup()
                .addGap(0,0,0)
                .addComponent(content_body_A_table, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addGap(0,0,0))
        );
    }

    public JTable getContent_body_A_table() {
        return content_body_A_table;
    }

    public void setContent_body_A_table(JTable content_body_A_table) {
        this.content_body_A_table = content_body_A_table;
    }
    
}
