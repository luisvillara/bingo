/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_client.resources;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Luis
 */
public class Label extends JLabel {
    private String style;
    public Label(String style){
        this.style = style;
        Styles estilo = Styles.valueOf(this.style);
        switch(estilo){
            case STYLE1:{
                setFont(Fonts.getFont(Fonts.style1));
                setForeground(Fonts.style1.color);
                break;
            }
            case STYLE2:{
                setFont(Fonts.getFont(Fonts.style2));
                setForeground(Fonts.style2.color);
                break;
            }
            case STYLE3:{
                setFont(Fonts.getFont(Fonts.style3));
                setForeground(Fonts.style3.color);
                break;
            }
            case STYLE4:{
                setFont(Fonts.getFont(Fonts.style4));
                setForeground(Fonts.style4.color);
                break;
            }
            case STYLE5:{
                setFont(Fonts.getFont(Fonts.style5));
                setForeground(Fonts.style5.color);
                break;
            }
            case STYLE6:{
                setFont(Fonts.getFont(Fonts.style6));
                setForeground(Fonts.style6.color);
                break;
            }
            case STYLE7:{
                setFont(Fonts.getFont(Fonts.style7));
                setForeground(Fonts.style7.color);
                break;
            }
            case STYLE8:{
                setFont(Fonts.getFont(Fonts.style8));
                setForeground(Fonts.style8.color);
                break;
            }
            case STYLE11:{
                setFont(Fonts.getFont(Fonts.style11));
                setForeground(Fonts.style11.color);
                break;
            }
            case STYLE12:{
                setFont(Fonts.getFont(Fonts.style12));
                setForeground(Fonts.style12.color);
                break;
            }
            case STYLE13:{
                setFont(Fonts.getFont(Fonts.style13));
                setForeground(Fonts.style13.color);
                break;
            }
            case STYLE14:{
                setFont(Fonts.getFont(Fonts.style14));
                setForeground(Fonts.style14.color);
                break;
            }
            case STYLE_ONLINE:{
                setFont(Fonts.getFont(Fonts.style_online));
                setForeground(Fonts.style_online.color);
                break;
            }
            case STYLE_OFFLINE:{
                setFont(Fonts.getFont(Fonts.style_offline));
                setForeground(Fonts.style_offline.color);
                break;
            }
        }
    }
    public enum Styles{
        STYLE1,
        STYLE2,
        STYLE3,
        STYLE4,
        STYLE5,
        STYLE6,
        STYLE7,
        STYLE8,
        STYLE9,
        STYLE10,
        STYLE11,
        STYLE12,
        STYLE13,
        STYLE14,
        STYLE_ONLINE,
        STYLE_OFFLINE
    }
}
