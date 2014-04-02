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

public class Grafica1 {
    
    public static void main(String[] args) {
        Frame ventana = new Frame();
        ventana.setTitle("Mi ventana");
        ventana.setSize(new Dimension(200, 100));
        ventana.setLocation(100, 100);
        
        ventana.setBackground(new Color(159, 218, 120));
        ventana.setForeground(new Color(93, 127, 70));
        
        Font fuente = new Font("Arial", Font.BOLD, 25);
        ventana.setFont(fuente);
        ventana.setLayout(new FlowLayout());
        
        Label etiqueta = new Label("Hola Mundo");
        Label etiqueta2 = new Label("otro Label");
        ventana.add(etiqueta);
        ventana.add(etiqueta2);
        
        Button boton = new Button("click");
        boton.setBackground(new Color(186, 255, 140));
        boton.setLabel("Hola");
        ventana.add(boton);
        
        
        TextField texto = new TextField();
        texto.setBackground(new Color(186, 255, 140));
        texto.setText("TextField");
        ventana.add(texto);
        
        ventana.setVisible(true);
    }
}
