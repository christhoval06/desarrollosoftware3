/**
 * @(#)Adivinar.java
 *
 *
 * @author
 * @version 1.00 2014/4/8
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Adivinar extends Frame implements ActionListener{

	TextField txtNumero;
	Button btnEnviar, btnJugar, btnNumeroPC;
	Label msgVerificar, lblIntentos, lblNumeroPC;
	int numeroPC = 0;
	int intentos = 0;
	boolean adivino = false;
	String msgMayor = "El Número es más Grande";
	String msgMenor = "El Número es más Chico";
	String msgIgual= "Felicidades adivinastes el Número";
	Random rnd;

    public Adivinar() {
    	setTitle("Adivina el Número");
    	setSize(300,300);
	    setLocation(100,100);
	    setLayout(null);
	    addWindowListener(new WindowAdapter(){
	         public void windowClosing(WindowEvent we)
	         {
	            System.exit(0);
	         }
	      });
	    setVisible(true);
    }

    private void iniciar(){
    	btnJugar = new Button("Jugar");
    	btnJugar.setActionCommand("jugar");
    	btnJugar.setBounds(120, 250, 60, 30);
    	btnJugar.addActionListener(this);
    	add(btnJugar);
    	rnd = new Random();
    }

    private void mostrar(boolean mostrar){
    	txtNumero.setVisible(mostrar);
    	msgVerificar.setVisible(mostrar);
    	lblIntentos.setVisible(mostrar);
    	btnEnviar.setVisible(mostrar);
    	btnNumeroPC.setVisible(mostrar);
    	btnJugar.setVisible(!mostrar);
    }

    private void reset(){
    	intentos = 0;
    	numeroPC = rnd.nextInt(100) + 1;
    	adivino = false;
    	txtNumero.setText("");
    	lblNumeroPC.setText("");
    	msgVerificar.setText("Adivina el número entre 1 y 100");
    	lblIntentos.setText("Intentos: " + intentos);
    	lblNumeroPC.setText("" + numeroPC);
    	btnNumeroPC.setLabel("Mostar Número");
    	btnNumeroPC.setActionCommand("mostrar");
    	lblNumeroPC.setVisible(false);
    }

    private void jugar(boolean trampa){
    	numeroPC = rnd.nextInt(100) + 1;
    	txtNumero = new TextField();
    	btnEnviar = new Button("Verificar");
    	btnNumeroPC = new Button("Mostrar Número");
    	msgVerificar = new Label("Adivina el número entre 1 y 100");
    	lblIntentos = new Label("Intentos: " + intentos);
    	lblNumeroPC = new Label("" + numeroPC);
    	lblNumeroPC.setVisible(false);

    	txtNumero.setBounds(30, 50, 60, 30);
    	add(txtNumero);

    	lblNumeroPC.setBounds(140, 150, 50, 50);
		add(lblNumeroPC);

    	btnEnviar.setBounds(100, 50, 60, 30);
    	btnEnviar.setActionCommand("verificar");
    	btnEnviar.addActionListener(this);
    	add(btnEnviar);

    	btnNumeroPC.setBounds(170, 50, 100, 30);
    	btnNumeroPC.setActionCommand("mostrar");
    	btnNumeroPC.addActionListener(this);
    	if (trampa) add(btnNumeroPC);

    	msgVerificar.setBounds(60, 100, 230, 30);
    	add(msgVerificar);

    	lblIntentos.setBounds(300-70, 25, 60, 30);
    	add(lblIntentos);
    }



    private String verificar(){
    	intentos += 1;
    	int numero = Integer.parseInt(txtNumero.getText());
    	if( numero == numeroPC ){
    		adivino = true;
    		return msgIgual;
    	}
    	else if( numero > numeroPC ) return msgMenor;
    	else if( numero < numeroPC ) return msgMayor;
    	return "";
    }

    public static void main(String [] args){
    	Adivinar adivinar = new Adivinar();
    	adivinar.iniciar();
    }


    public void actionPerformed(ActionEvent e){
      String s = e.getActionCommand();
      if (s.equals("verificar")){
      	msgVerificar.setText(verificar());
    	lblIntentos.setText("Intentos: " + intentos);
    	if(adivino){
    		btnJugar.setVisible(true);
    		btnJugar.setActionCommand("reset");
    	}
      }
      else if (s.equals("jugar")){
      	jugar(false);
      	mostrar(true);
      }
      else if (s.equals("reset")){
      	reset();
      }
      else if (s.equals("mostrar")){
      	btnNumeroPC.setActionCommand("ocultar");
      	btnNumeroPC.setLabel("Ocultar Número");
      	lblNumeroPC.setVisible(true);
      }
      else if (s.equals("ocultar")){
      	btnNumeroPC.setActionCommand("mostrar");
      	btnNumeroPC.setLabel("Mostar Número");
      	lblNumeroPC.setVisible(false);
      }
   }


}