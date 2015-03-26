/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.resources;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Luis
 */
public class Fonts {
    public static Style style1 = new Style("Arial", "fff8c6", 12, Font.PLAIN);
    public static Style style2 = new Style("Arial", "751a41", 14, Font.BOLD);
    public static Style style3 = new Style("Courier", "ffffff", 12, Font.PLAIN);
    public static Style style4 = new Style("Arial", "a1aab3", 13, Font.BOLD);
    public static Style style5 = new Style("Arial", "751a41", 13, Font.BOLD);
    public static Style style6 = new Style("Arial", "808080", 10, Font.PLAIN);
    public static Style style7 = new Style("Arial", "808080", 14, Font.BOLD);
    public static Style style8 = new Style("Arial", "405496", 11, Font.BOLD);
    public static Style style9 = new Style("Arial", "000000", 13, Font.PLAIN);
    public static Style style10 = new Style("Arial", "ffffff", 11, Font.BOLD);
    public static Style style11 = new Style("Arial", "7a8599", 11, Font.BOLD);
    public static Style style12 = new Style("Arial", "0f244d", 11, Font.PLAIN);
    public static Style style13 = new Style("Arial", "d95049", 14, Font.BOLD);
    public static Style style14 = new Style("Arial", "1a2233", 11, Font.BOLD);
    public static Style style_online = new Style("Arial", "3eb341", 12, Font.BOLD);
    public static Style style_offline = new Style("Arial", "f03a3a", 12, Font.BOLD);
    
    public Fonts(){}
    
    public static Font getFont(Style style){
        return new Font(style.font, style.font_weigth, style.size);
    }
    /* Clase de estilos */
    public static class Style{
        public String font;
        public Color color;
        public int size;
        public int font_weigth;
        
        public Style(String font, String color, int size, int font_weigth){
            this.font = font;
            this.color = new Color(Integer.parseInt(color, 16));
            this.size = size;
            this.font_weigth = font_weigth;
        }
    }
}
