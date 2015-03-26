/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.gui;

import bingo_client.lib.ClientConfDialogDelegate;
import bingo_client.resources.Button;
import bingo_client.resources.Fonts;
import bingo_client.resources.Label;
import bingo_client.resources.Panel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Luis
 */
public class ClientContainerFrame extends Panel {
    private javax.swing.JPanel content_body_A;
    private JPanel content_body;
    private javax.swing.JScrollPane content_body_A_table_scrollPane;
    private javax.swing.JPanel content_body_B;
    private javax.swing.JTextArea content_body_B_historic;
    private javax.swing.JScrollPane content_body_B_historic_scrollPane;
    private javax.swing.JPanel content_head;
    private javax.swing.JPanel content_head_bingo_numbers;
    private javax.swing.JPanel content_head_info;
    private javax.swing.JPanel head_info_A;
    private Panel head_info_A_status;
    private Button head_info_A_status_btn;
    private Label head_info_A_status_count;
    private Label head_info_A_status_count_label;
    private Label head_info_A_status_estado;
    private Label head_info_A_status_estado_label;
    private Panel head_info_A_type;
    private Label head_info_A_type_label;
    private javax.swing.JPanel head_info_B;
    private Panel head_info_B_bingo;
    private Panel head_info_B_bingo_1;
    private javax.swing.JLabel head_info_B_bingo_1_label;
    private Panel head_info_B_bingo_2;
    private javax.swing.JLabel head_info_B_bingo_2_label;
    private Panel head_info_B_bingo_3;
    private javax.swing.JLabel head_info_B_bingo_3_label;
    private Panel head_info_B_bingo_4;
    private javax.swing.JLabel head_info_B_bingo_4_label;
    private Panel head_info_B_bingo_5;
    private javax.swing.JLabel head_info_B_bingo_5_label;
    private Label head_info_B_bingo_cantadas;
    private Label head_info_B_bingo_cantadas_label;
    private Label head_info_B_bingo_porllamar;
    private Label head_info_B_bingo_porllamar_label;
    private javax.swing.JPanel head_info_B_bingo_stats;
    private javax.swing.JPanel head_info_B_bingo_top;
    private ClientFrameDelegate delegate;
    private ClientConfDialogDelegate delegate_client;
    
    private int type;
    
    public ClientContainerFrame(ClientFrameDelegate delegate, JPanel content_body) {
        super("STYLE1", 0x1c4138, 0x1c5c4f, 0x1c4138, 0x1c4138, 0);
        this.delegate = delegate;
        this.content_body = content_body;
        this.type = 1;
        initComponents();
    }
    
    public ClientContainerFrame(ClientConfDialogDelegate delegate, JPanel content_body) {
        super("STYLE1", 0x1c4138, 0x1c5c4f, 0x1c4138, 0x1c4138, 0);
        this.delegate_client = delegate;
        this.content_body = content_body;
        this.type = 2;
        initComponents();
    }
    
    public void initComponents(){
        content_head = new javax.swing.JPanel();
        content_head_info = new javax.swing.JPanel();
        head_info_A = new javax.swing.JPanel();
        head_info_A_type = new Panel("STYLE1", 0xfad111, 0xfad111, 0x1c4138, 0x1c4138, 10);
        head_info_A_type_label = new Label("STYLE2");
        head_info_A_status = new Panel("STYLE1", 0x1c5c4f, 0x1c5c4f, 0x1c4138, 0x1c4138, 10);
        head_info_A_status_count_label = new Label("STYLE1");
        head_info_A_status_count = new Label("STYLE1");
        head_info_A_status_estado_label = new Label("STYLE1");
        head_info_A_status_estado = new Label("STYLE1");
        head_info_A_status_btn = new Button(0x58cb3d,0x37ad42,0x288e31,0xffffff);
        head_info_B = new javax.swing.JPanel();
        head_info_B_bingo = new Panel("STYLE1", 0x1c5c4f, 0x1c5c4f, 0x1c4138, 0x1c4138, 10);
        head_info_B_bingo_stats = new javax.swing.JPanel();
        head_info_B_bingo_porllamar_label = new Label("STYLE1");
        head_info_B_bingo_porllamar = new Label("STYLE1");
        head_info_B_bingo_cantadas_label = new Label("STYLE1");
        head_info_B_bingo_cantadas = new Label("STYLE1");
        head_info_B_bingo_top = new javax.swing.JPanel();
        head_info_B_bingo_5 = new Panel();
        head_info_B_bingo_5.setBackgroundImage("/images/bola_amarilla.png", 2);
        head_info_B_bingo_5_label = new javax.swing.JLabel();
        head_info_B_bingo_4 = new Panel();
        head_info_B_bingo_4.setBackgroundImage("/images/bola_amarilla.png", 2);
        head_info_B_bingo_4_label = new javax.swing.JLabel();
        head_info_B_bingo_3 = new Panel();
        head_info_B_bingo_3.setBackgroundImage("/images/bola_amarilla.png", 2);
        head_info_B_bingo_3_label = new javax.swing.JLabel();
        head_info_B_bingo_2 = new Panel();
        head_info_B_bingo_2.setBackgroundImage("/images/bola_amarilla.png", 2);
        head_info_B_bingo_2_label = new javax.swing.JLabel();
        head_info_B_bingo_1 = new Panel();
        head_info_B_bingo_1.setBackgroundImage("/images/bola_amarilla.png", 2);
        head_info_B_bingo_1_label = new javax.swing.JLabel();
        content_head_bingo_numbers = new javax.swing.JPanel();
        content_body_A = new javax.swing.JPanel();
        content_body_A_table_scrollPane = new javax.swing.JScrollPane();
        content_body_B = new javax.swing.JPanel();
        content_body_B_historic_scrollPane = new javax.swing.JScrollPane();
        content_body_B_historic = new javax.swing.JTextArea();
        
        content_head.setOpaque(false);
        content_body_A.setOpaque(false);
        content_body_B.setOpaque(false);
        
        content_head_info.setOpaque(false);
        head_info_A.setOpaque(false);
        head_info_B.setOpaque(false);
        
        content_head_bingo_numbers.setOpaque(false);
        
        head_info_B_bingo_stats.setOpaque(false);
        head_info_B_bingo_top.setOpaque(false);
        
        head_info_B_bingo_5.setOpaque(false);
        head_info_B_bingo_4.setOpaque(false);
        head_info_B_bingo_3.setOpaque(false);
        head_info_B_bingo_2.setOpaque(false);
        head_info_B_bingo_1.setOpaque(false);
                
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        content_head.setLayout(new javax.swing.BoxLayout(content_head, javax.swing.BoxLayout.LINE_AXIS));

        content_head_info.setPreferredSize(new java.awt.Dimension(400, 200));
        content_head_info.setLayout(new javax.swing.BoxLayout(content_head_info, javax.swing.BoxLayout.LINE_AXIS));

        head_info_A.setPreferredSize(new java.awt.Dimension(400, 200));

        javax.swing.GroupLayout head_info_A_typeLayout = new javax.swing.GroupLayout(head_info_A_type);
        head_info_A_type.setLayout(head_info_A_typeLayout);
        head_info_A_typeLayout.setHorizontalGroup(
                head_info_A_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(head_info_A_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_A_type_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        head_info_A_typeLayout.setVerticalGroup(
                head_info_A_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(head_info_A_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_A_type_label, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap()));

        head_info_A_status_count_label.setText("Conectados:");

        head_info_A_status_count.setText("0");

        head_info_A_status_estado_label.setText("Estado del juego:");

        head_info_A_status_estado.setText("En espera...");

        head_info_A_status_btn.setText("Conectado");

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
                .addContainerGap()));
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
                .addContainerGap()));

        javax.swing.GroupLayout head_info_ALayout = new javax.swing.GroupLayout(head_info_A);
        head_info_A.setLayout(head_info_ALayout);
        head_info_ALayout.setHorizontalGroup(
                head_info_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(head_info_ALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_info_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_A_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(head_info_A_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap()));
        head_info_ALayout.setVerticalGroup(
                head_info_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(head_info_ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_A_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(head_info_A_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()));

        content_head_info.add(head_info_A);

        head_info_B.setPreferredSize(new java.awt.Dimension(400, 200));

        head_info_B_bingo.setLayout(new javax.swing.BoxLayout(head_info_B_bingo, javax.swing.BoxLayout.Y_AXIS));

        head_info_B_bingo_porllamar_label.setText("Por llamar:");

        head_info_B_bingo_porllamar.setText("0");

        head_info_B_bingo_cantadas_label.setText("Cantadas:");

        head_info_B_bingo_cantadas.setText("0");

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
                .addContainerGap(226, Short.MAX_VALUE)));
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
                .addContainerGap(60, Short.MAX_VALUE)));

        head_info_B_bingo.add(head_info_B_bingo_stats);

        head_info_B_bingo_top.setLayout(new javax.swing.BoxLayout(head_info_B_bingo_top, javax.swing.BoxLayout.LINE_AXIS));

        head_info_B_bingo_5_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_5_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout head_info_B_bingo_5Layout = new javax.swing.GroupLayout(head_info_B_bingo_5);
        head_info_B_bingo_5.setLayout(head_info_B_bingo_5Layout);
        head_info_B_bingo_5Layout.setHorizontalGroup(
                head_info_B_bingo_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_5_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE));
        head_info_B_bingo_5Layout.setVerticalGroup(
                head_info_B_bingo_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_5_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE));

        head_info_B_bingo_top.add(head_info_B_bingo_5);

        head_info_B_bingo_4_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_4_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout head_info_B_bingo_4Layout = new javax.swing.GroupLayout(head_info_B_bingo_4);
        head_info_B_bingo_4.setLayout(head_info_B_bingo_4Layout);
        head_info_B_bingo_4Layout.setHorizontalGroup(
                head_info_B_bingo_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_4_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE));
        head_info_B_bingo_4Layout.setVerticalGroup(
                head_info_B_bingo_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_4_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE));

        head_info_B_bingo_top.add(head_info_B_bingo_4);

        head_info_B_bingo_3_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_3_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout head_info_B_bingo_3Layout = new javax.swing.GroupLayout(head_info_B_bingo_3);
        head_info_B_bingo_3.setLayout(head_info_B_bingo_3Layout);
        head_info_B_bingo_3Layout.setHorizontalGroup(
                head_info_B_bingo_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_3_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE));
        head_info_B_bingo_3Layout.setVerticalGroup(
                head_info_B_bingo_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_3_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE));

        head_info_B_bingo_top.add(head_info_B_bingo_3);

        head_info_B_bingo_2_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_2_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout head_info_B_bingo_2Layout = new javax.swing.GroupLayout(head_info_B_bingo_2);
        head_info_B_bingo_2.setLayout(head_info_B_bingo_2Layout);
        head_info_B_bingo_2Layout.setHorizontalGroup(
                head_info_B_bingo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE));
        head_info_B_bingo_2Layout.setVerticalGroup(
                head_info_B_bingo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE));

        head_info_B_bingo_top.add(head_info_B_bingo_2);

        head_info_B_bingo_1_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head_info_B_bingo_1_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout head_info_B_bingo_1Layout = new javax.swing.GroupLayout(head_info_B_bingo_1);
        head_info_B_bingo_1.setLayout(head_info_B_bingo_1Layout);
        head_info_B_bingo_1Layout.setHorizontalGroup(
                head_info_B_bingo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE));
        head_info_B_bingo_1Layout.setVerticalGroup(
                head_info_B_bingo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(head_info_B_bingo_1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE));

        head_info_B_bingo_top.add(head_info_B_bingo_1);

        head_info_B_bingo.add(head_info_B_bingo_top);

        javax.swing.GroupLayout head_info_BLayout = new javax.swing.GroupLayout(head_info_B);
        head_info_B.setLayout(head_info_BLayout);
        head_info_BLayout.setHorizontalGroup(
                head_info_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(head_info_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_B_bingo, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap()));
        head_info_BLayout.setVerticalGroup(
                head_info_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(head_info_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head_info_B_bingo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap()));

        content_head_info.add(head_info_B);

        content_head.add(content_head_info);

        content_head_bingo_numbers.setLayout(new java.awt.GridLayout(3, 5));
        content_head.add(content_head_bingo_numbers);

        add(content_head);

        content_body_A.setPreferredSize(new java.awt.Dimension(800, 300));
        
        content_body_A_table_scrollPane.setOpaque(false);
        content_body_A_table_scrollPane.setBorder(null);
        content_body_A_table_scrollPane.setViewportView(content_body);
        content_body_A_table_scrollPane.getViewport().setOpaque(false);

        javax.swing.GroupLayout content_body_ALayout = new javax.swing.GroupLayout(content_body_A);
        content_body_A.setLayout(content_body_ALayout);
        content_body_ALayout.setHorizontalGroup(
                content_body_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_body_ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_A_table_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap()));
        content_body_ALayout.setVerticalGroup(
                content_body_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(content_body_ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_A_table_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap()));

        add(content_body_A);

        content_body_B.setPreferredSize(new java.awt.Dimension(800, 250));
        content_body_B_historic.setBackground(new Color(0x1c4138));
        content_body_B_historic.setBorder(BorderFactory.createLineBorder(new Color(0x1c5c4f)));
        content_body_B_historic.setEditable(false);
        content_body_B_historic.setMargin(new java.awt.Insets(10, 10, 10, 10));
        content_body_B_historic.setFont(Fonts.getFont(Fonts.style3));
        content_body_B_historic.setForeground(new Color(0x228a75));
        content_body_B_historic_scrollPane.setBorder(null);
        content_body_B_historic_scrollPane.setViewportView(content_body_B_historic);

        javax.swing.GroupLayout content_body_BLayout = new javax.swing.GroupLayout(content_body_B);
        content_body_B.setLayout(content_body_BLayout);
        content_body_BLayout.setHorizontalGroup(
                content_body_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(content_body_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_B_historic_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap()));
        content_body_BLayout.setVerticalGroup(
                content_body_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(content_body_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_body_B_historic_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap()));

        add(content_body_B);
    }

    public void setHead_info_A_type_label_text(String text) {
        this.head_info_A_type_label.setText(text);
    }

    public void setContent_body_B_historic_text(String text) {
        this.content_body_B_historic.append(text + "\n");
    }
    
    public void set_table_model(ClientsTable model){
        if(this.type == 1){
            ServerContent server_content = (ServerContent)content_body;
            
            server_content.getContent_body_A_table().setModel(model);
        }
    }
    
}
