/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.resources;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;

/**
 *
 * @author Luis
 */
public class Button extends JButton implements MouseListener{
    
    private Graphics2D g2;
    private Color color1;
    private Color color2;
    private Color borderColor;
    
    private boolean mouseEnteredEvt;
    private boolean mouseReleasedEvt;
    public boolean mouseClickedEvt;
    
    public Button(int color1, int color2, int border_color, int foreground){
        setForeground(new Color(foreground));
        setFocusable(false);
        this.color1 = new Color(color1);
        this.color2 = new Color(color2);
        borderColor = new Color(border_color);
        this.mouseEnteredEvt = false;
        this.mouseReleasedEvt = false;
        this.mouseClickedEvt = false;
        addMouseListener(this);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        setContentAreaFilled(false);
        if (ui != null) {
            Graphics scratchGraphics = (g == null) ? null : g.create();
            g2 = (Graphics2D) scratchGraphics;
            
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            if(!mouseClickedEvt){
                if(!mouseEnteredEvt){
                    g2.setPaint(new GradientPaint(new Point(0, 0), this.color1, new Point(0, getHeight()), this.color2));
                }else {
                    g2.setPaint(new GradientPaint(new Point(0, 0), this.color2, new Point(0, getHeight()), this.color1));
                }
            }else{
                g2.setPaint(new GradientPaint(new Point(0, 0), this.color2.darker(), new Point(0, getHeight()), this.color1));
                mouseClickedEvt = false;
            }
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
            
            g2.setPaint(new Color(255,255,255,80));
            g2.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, 6, 6);
            
            g2.setPaint(this.borderColor);
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 8, 8);
            try {
                ui.update(g2, this);
            } finally {
                scratchGraphics.dispose();
                g2.dispose();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseClickedEvt = true;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseEnteredEvt = true;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseEnteredEvt = false;
        repaint();
    }
}
