/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author christhoval06
 */

import java.awt.*;
public class Grafica1{
    
    public  static void main(String []args){
        Frame ventana = new Frame();
        ventana.setTitle("Mi ventana");
        ventana.setSize(new Dimension(200, 100));
        ventana.setLocation(100, 100);
        ventana.setBackground(new Color(159, 218, 120));
        ventana.setVisible(true);
    }
    
}
