/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.resources;

import javax.swing.ImageIcon;

/**
 *
 * @author Luis
 */
public class ResizeImageIcon {
    public ResizeImageIcon(){}
    
    public static ImageIcon resize_h(ImageIcon img, int height){
        int w, h;
        w = img.getImage().getWidth(null);
        h = img.getImage().getHeight(null);
        float we = (height/(float)h)*(float)w;
        return new ImageIcon(img.getImage().getScaledInstance((int)we, height, java.awt.Image.SCALE_SMOOTH));
    }
    public static ImageIcon resize_w(ImageIcon img, int width){
        int w, h;
        w = img.getImage().getWidth(null);
        h = img.getImage().getHeight(null);
        float he = (width/(float)w)*(float)h;
        return new ImageIcon(img.getImage().getScaledInstance(width, (int)he, java.awt.Image.SCALE_SMOOTH));
    }
    
}
