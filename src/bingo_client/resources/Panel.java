/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.resources;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Luis
 */
public class Panel extends JPanel {
    
    private String style;
    private String orientacion;
    private int arc;
    private Color background_top;
    private Color background_bottom;
    private Color border;
    private Color shadow;
    
    private String background_url;
    private int tipo_bg;
    
    public static String ALIGN_TOP = "ALIGN_TOP";
    public static String ALIGN_BOTTOM = "ALIGN_BOTTOM"; 
    public static String ALIGN_LEFT = "ALIGN_LEFT";
    public static String ALIGN_RIGHT = "ALIGN_RIGHT";
    public static String ALIGN_ALL = "ALIGN_ALL";
    
    private boolean hover;
    
    private Color hover_color;
    private Color hover_bgcolor;
    
    private Color backgroundimage_hover_color;
    
    private static int default_hover_color = 0x21d93f;
    private static int default_hover_bgcolor = 0x21d93f;
    
    private static int default_active_color = 0xe0f218;
    private static int default_active_bgcolor = 0xe0f218;
    
    private static int default_backgroundimage_hover_color = 0x27334d;
    private static int default_backgroundimage_active_color = 0x21d93f;
    
    private boolean mouseEnteredEvt;
    private boolean mouseReleasedEvt;
    public boolean mouseClickedEvt;
    public boolean set_hover;
    
    private Object object;
    private int nivel;
    
    private Image img;
    
    private int resize_type;
    private int resize_value;
    
    public Panel(){
        this.hover = false;
        this.arc = 0;
        this.background_url = "";
        this.hover_color = new Color(default_hover_color);
        this.hover_bgcolor = new Color(default_hover_bgcolor);
        this.backgroundimage_hover_color = new Color(default_backgroundimage_hover_color);
        this.mouseEnteredEvt = false;
        this.mouseReleasedEvt = false;
        this.mouseClickedEvt = false;
        this.set_hover = false;
        this.resize_type = 0;
        this.resize_value = 0;
    }
    public Panel(String style, String orientacion, int background_top, int background_bottom, int shadow, int border){
        this.hover = false;
        this.hover_color = new Color(default_hover_color);
        this.hover_bgcolor = new Color(default_hover_bgcolor);
        this.backgroundimage_hover_color = new Color(default_backgroundimage_hover_color);
        this.style = style;
        this.orientacion = orientacion;
        this.background_top = new Color(background_top);
        this.background_bottom = new Color(background_bottom);
        this.shadow = rgba(shadow, 30);
        this.border = new Color(border);
        this.arc = 0;
        this.background_url = "";
        this.mouseEnteredEvt = false;
        this.mouseReleasedEvt = false;
        this.mouseClickedEvt = false;
        this.set_hover = false;
        this.resize_type = 0;
        this.resize_value = 0;
    }
    
    public Panel(String style, int background_top, int background_bottom, int shadow,  int border, int arc){
        this.hover = false;
        this.hover_color = new Color(default_hover_color);
        this.hover_bgcolor = new Color(default_hover_bgcolor);
        this.backgroundimage_hover_color = new Color(default_backgroundimage_hover_color);
        this.style = style;
        this.orientacion = ALIGN_ALL;
        this.background_top = new Color(background_top);
        this.background_bottom = new Color(background_bottom);
        this.shadow = rgba(shadow, 50);
        this.border = new Color(border);
        this.arc = arc;
        this.background_url = "";
        this.mouseEnteredEvt = false;
        this.mouseReleasedEvt = false;
        this.mouseClickedEvt = false;
        this.set_hover = false;
        this.resize_type = 0;
        this.resize_value = 0;
    }
    
    public void setStyle(String style, int background_top, int background_bottom, int shadow,  int border, int arc){
        this.hover = false;
        this.hover_color = new Color(default_hover_color);
        this.hover_bgcolor = new Color(default_hover_bgcolor);
        this.backgroundimage_hover_color = new Color(default_backgroundimage_hover_color);
        this.style = style;
        this.orientacion = ALIGN_ALL;
        this.background_top = new Color(background_top);
        this.background_bottom = new Color(background_bottom);
        this.shadow = rgba(shadow, 50);
        this.border = new Color(border);
        this.arc = arc;
        this.background_url = "";
        this.mouseEnteredEvt = false;
        this.mouseReleasedEvt = false;
        this.mouseClickedEvt = false;
        this.set_hover = false;
    }
    
    public Color rgba(int hex, int a){
        int r = (hex & 0xFF0000) >> 16;
        int g = (hex & 0xFF00) >> 8;
        int b = (hex & 0xFF);
        return new Color(r, g, b, a);
    }
    public void reset(){
        mouseReleasedEvt = true;
        mouseEnteredEvt = false;
        mouseClickedEvt = false;
        this.set_hover = false;
        repaint();
    }
    
    public void set_hover(){
        this.set_hover = true;
        repaint();
    }
    
    public void initHover(){
        if(hover){
            addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    if(!mouseClickedEvt){
                        mouseEnteredEvt = true;
                        mouseReleasedEvt = false;
                        mouseClickedEvt = false;
                        repaint();
                    }
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    if(!mouseClickedEvt){
                        mouseReleasedEvt = true;
                        mouseEnteredEvt = false;
                        mouseClickedEvt = false;
                        repaint();
                    }
                }
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    mouseClickedEvt = true;
                    mouseReleasedEvt = false;
                    mouseEnteredEvt = false;
                    repaint();
                }
            });
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth() - 1;
        int height = getHeight() - 1;
        
        Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        
        Insets insets = getInsets();
        Rectangle bounds = getBounds();
        bounds.x = insets.left;
        bounds.y = insets.top;
        bounds.width = width - (insets.left + insets.right);
        bounds.height = height - (insets.top + insets.bottom);
        
        if(background_url.length() > 0){
            drawBackgroundImage(g2, bounds);
            if(hover){
                if(mouseEnteredEvt){
                    //super.paintComponent(g);
                    this.backgroundimage_hover_color = new Color(default_backgroundimage_hover_color);
                    drawBackgroundImageHoverStyle(g2, bounds);
                    mouseEnteredEvt = false;
                }else if(mouseReleasedEvt){
                    super.paintComponent(g);
                    drawBackgroundImage(g2, bounds);
                    mouseReleasedEvt = false;
                }else if(mouseClickedEvt){
                    //super.paintComponent(g);
                    this.backgroundimage_hover_color = new Color(default_backgroundimage_active_color);
                    drawBackgroundImageHoverStyle(g2, bounds);
                    mouseEnteredEvt = false;
                    mouseReleasedEvt = false;
                }
            }
        }else{
            if(hover){
                if(mouseEnteredEvt){
                    super.paintComponent(g);
                    drawHoverStyle(g2, bounds);
                    mouseEnteredEvt = false;
                }else if(mouseReleasedEvt){
                    super.paintComponent(g);
                    drawStyle(g2, bounds);
                    mouseReleasedEvt = false;
                }else if(set_hover){
                    super.paintComponent(g);
                    this.hover_color = new Color(default_active_color);
                    //this.hover_bgcolor = new Color(default_active_bgcolor);
                    drawHoverStyle(g2, bounds);
                }else{
                    drawStyle(g2, bounds);
                    mouseClickedEvt = false;
                }
            }else{
                drawStyle(g2, bounds);
            }
        }
    }

    public void setHover(boolean hover, int color) {
        this.hover = hover;
        if(color != -1){
            this.hover_color = new Color(color);
        }
        initHover();
    }
    
    public void setBackgroundImage(String background_url, int tipo_bg){
        System.out.println("por aca1");
        this.tipo_bg = tipo_bg;
        this.background_url = background_url;
        img = new ImageIcon(getClass().getResource(background_url)).getImage();
        System.out.println("por aca");
    }
    
    public void setBackgroundImage(String background_url, int tipo_bg, Object object, int nivel){
        this.tipo_bg = tipo_bg;
        this.background_url = background_url;
        this.object = object;
        this.nivel = nivel;
        if (img == null) {
            //DebugSout.sout("FONDO POR DEFECTO");
            img = new ImageIcon(getClass().getResource("/images/sinfondo.jpg")).getImage();
            background_url = "";
        }
    }

    public void drawBackgroundImage(Graphics2D g2, Rectangle bounds){
        if(tipo_bg == 0 || tipo_bg == 2){
            if(img == null)
                img = new ImageIcon(getClass().getResource(background_url)).getImage();
            if(resize_type > 0){
                if(resize_type == 1){
                    img = ResizeImageIcon.resize_w(new ImageIcon(img), resize_value).getImage();
                }else if(resize_type == 2){
                    img = ResizeImageIcon.resize_h(new ImageIcon(img), resize_value).getImage();
                }
            }
        }
        int imgX = img.getWidth(null);
        int imgY = img.getHeight(null);
        if(tipo_bg == 2){
            //g2.setColor(new Color(0,0,0,0.2f));
            //g2.fillRoundRect(bounds.x, bounds.y , bounds.width, bounds.height , 0, 0);
        }
        g2.drawImage(img, (getWidth() - imgX) / 2, (getHeight() - imgY) / 2, imgX, imgY, null);
        if(tipo_bg == 1){
            g2.setStroke(new BasicStroke(1f));
            g2.setColor(new Color(0,0,0,0.2f));
            g2.drawRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, 0, 0);
        }
        /*if(always){
            g2.setStroke(new BasicStroke(1f));
            g2.setColor(new Color(0,0,0,0.2f));
            g2.drawRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, 0, 0);
            //g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
        }*/
    }
    
    public void drawBackgroundImageHoverStyle(Graphics2D g2, Rectangle bounds){
        g2.setColor(new Color(0,0,0,0.2f));
        g2.fillRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, 0, 0);
        
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(new Color(0,0,0,0.4f));
        g2.drawRoundRect(bounds.x + 1, bounds.y + 1, bounds.width - 2, bounds.height - 2, 0, 0);
        
        g2.setStroke(new BasicStroke(3f));
        g2.setColor(backgroundimage_hover_color);
        g2.drawRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, 0, 0);
        
        g2.setStroke(new BasicStroke(1f));
        g2.setColor(new Color(255,255,255,100));
        g2.drawRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, 0, 0);
        //drawBackgroundImage(g2, bounds);
    }
    
    public void drawStyle(Graphics2D g2, Rectangle bounds){
        Aligns align = Aligns.valueOf(this.orientacion);
        Styles estilo = Styles.valueOf(this.style);
        switch(align){
            case ALIGN_ALL:{
                switch(estilo){
                    case STYLE1:{
                        g2.setStroke(new BasicStroke(2f));
                        g2.setColor(shadow);
                        g2.drawRoundRect(bounds.x + 1, bounds.y + 1, bounds.width - 2, bounds.height - 2, arc, arc);

                        g2.setStroke(new BasicStroke(1f));
                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x + 1, bounds.y + 1, bounds.width - 2 , bounds.height - 2, arc, arc);
                        
                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x + 2, bounds.y + 2, bounds.width - 3 , bounds.height - 3, arc, arc);
                        break;
                    }
                    case STYLE2:{
                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x, bounds.y, bounds.width, bounds.height, arc, arc);
                        break;
                    }
                    case STYLE3:{
                        
                        break;
                    }
                }
                break;
            }
            case ALIGN_TOP:{
                 switch(estilo){
                    case STYLE1:{
                        g2.setColor(shadow);
                        g2.drawRoundRect(bounds.x , bounds.y, bounds.width , bounds.height - 1, 0, 0);

                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x , bounds.y + 1, bounds.width , bounds.height - 2, 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x , bounds.y + 2, bounds.width + 1 , bounds.height - 2, 0, 0);
                        break;
                    }
                    case STYLE2:{
                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x , bounds.y , bounds.width , bounds.height - 1, 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x , bounds.y , bounds.width + 1 , bounds.height, 0, 0);
                        break;
                    }
                 }
                 break;
            }
            case ALIGN_BOTTOM:{
                switch(estilo){
                    case STYLE1:{
                        g2.setColor(shadow);
                        g2.drawRoundRect(bounds.x, bounds.y + 2, bounds.width, bounds.height - 2, 0, 0);

                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x, bounds.y + 1, bounds.width , bounds.height - 2, 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x, bounds.y, bounds.width + 1 , bounds.height - 1, 0, 0);
                        break;
                    }
                    case STYLE2:{
                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x, bounds.y, bounds.width , bounds.height, 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x, bounds.y, bounds.width + 1 , bounds.height, 0, 0);
                        break;
                    }
                 }
                 break;
            }
            case ALIGN_LEFT:{
                switch(estilo){
                    case STYLE1:{
                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x + 1, bounds.y, bounds.width , bounds.height , 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x + 2, bounds.y, bounds.width , bounds.height + 2, 0, 0);

                        g2.setColor(shadow);
                        g2.drawRoundRect(bounds.x + 2, bounds.y - 1, bounds.width, bounds.height + 2 , 0, 0);
                        break;
                    }
                    case STYLE2:{
                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x, bounds.y, bounds.width , bounds.height , 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x + 1, bounds.y, bounds.width , bounds.height + 2, 0, 0);
                        
                        g2.setStroke(new BasicStroke(2f));
                        g2.setColor(shadow);
                        g2.drawRoundRect(bounds.x + 1, bounds.y, bounds.width, bounds.height , 0, 0);
                        break;
                    }
                 }
                 break;
            }
            case ALIGN_RIGHT:{
                switch(estilo){
                    case STYLE1:{
                        g2.setColor(shadow);
                        g2.drawRoundRect(bounds.x, bounds.y + 2, bounds.width, bounds.height - 2, 0, 0);

                        g2.setColor(border);
                        g2.drawRoundRect(bounds.x, bounds.y + 1, bounds.width , bounds.height - 2, 0, 0);

                        g2.setPaint(new GradientPaint(0.0f, 0.0f, background_top, 0, getHeight(), background_bottom));
                        g2.fillRoundRect(bounds.x, bounds.y, bounds.width + 1 , bounds.height - 1, 0, 0);
                        break;
                    }
                 }
                 break;
            }
        }
    }
    
    public void drawHoverStyle(Graphics2D g2, Rectangle bounds){
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(shadow);
        g2.drawRoundRect(bounds.x + 1, bounds.y + 1, bounds.width - 2, bounds.height - 2, arc, arc);
        
        if(!set_hover){
            g2.setStroke(new BasicStroke(1f));
            g2.setColor(border);
            g2.drawRoundRect(bounds.x + 1, bounds.y + 1, bounds.width - 2 , bounds.height - 2, arc, arc);
            
            g2.setPaint(new GradientPaint(0.0f, 0.0f, background_bottom, 0, getHeight(), background_top));
        }else{
            g2.setStroke(new BasicStroke(1f));
            g2.setColor(new Color(0xe6d271));
            g2.drawRoundRect(bounds.x + 1, bounds.y + 1, bounds.width - 2 , bounds.height - 2, arc, arc);
            
            g2.setPaint(new GradientPaint(0.0f, 0.0f, new Color(0xf7ed98), 0, getHeight(), new Color(0xfffdb5)));
        }
        g2.fillRoundRect(bounds.x + 2, bounds.y + 2, bounds.width - 3 , bounds.height - 3, arc, arc);
    }

    public int getResize_type() {
        return resize_type;
    }

    public void setResize_type(int resize_type) {
        this.resize_type = resize_type;
    }

    public int getResize_value() {
        return resize_value;
    }

    public void setResize_value(int resize_value) {
        this.resize_value = resize_value;
    }
    
    
    /* Lista de estilos */
    public enum Styles{
        STYLE1,
        STYLE2,
        STYLE3,
        STYLE4
    }
    
    public enum Aligns{
        ALIGN_ALL,
        ALIGN_TOP,
        ALIGN_BOTTOM,
        ALIGN_LEFT,
        ALIGN_RIGHT
    }
}
