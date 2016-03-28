package Ventanas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Definici�n de la clase mediante la palabra reservada Jugador 
 **/
public class Login extends JFrame{
	
	
	//PROPIEDADES
	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField textoApellido1;
	private JTextField textoApellido2;
	private JTextField textoEdad;
	//Creamos la referencia a Juego
	private Juego juego1;
	private Contenedor conten1;
	//Creamos la referencia a Login
	private Login cerrar;
	
	
	JButton botonDatos;
	
	//Creamos objeto Jugador
	private Jugador j1;
	
	
	// Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo Juagador
	public Login() {
			
		//Hacemos referencia cerrar
			cerrar=this;
		
		
		//Las propiedades de nuestra ventana
				setTitle("JUGADOR");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Dimensiones de nuestra ventana		
				setBounds(100, 100, 450, 384);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				
		//Lo a�adimos al JFrame		
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
		//A�adimos la etiqueta T�tulo		
				JLabel etiquetaTitulo = new JLabel("DATOS DEL JUGADOR");
				etiquetaTitulo.setBounds(12, 13, 140, 16);
				contentPane.add(etiquetaTitulo);
				
		//A�adimos la etiqueta Nombre
				JLabel etiquetaNombre = new JLabel("Nombre");
				etiquetaNombre.setBounds(12, 61, 140, 16);
				contentPane.add(etiquetaNombre);
				
		//A�adimos la etiqueta Apellido1
				JLabel etiquetasApellido1 = new JLabel("Apellido1");
				etiquetasApellido1.setBounds(12, 108, 72, 16);
				contentPane.add(etiquetasApellido1);
				
		//A�adimos la etiqueta Apellido2
				JLabel etiquetasApellido2 = new JLabel("Apellido2");
				etiquetasApellido2.setBounds(12, 156, 72, 16);
				contentPane.add(etiquetasApellido2);
		
		//A�adimos la etiqueta Edad
				JLabel etiquetaEdad = new JLabel("Edad");
				etiquetaEdad.setBounds(12, 203, 72, 16);
				contentPane.add(etiquetaEdad);
				
		//A�adimos cuadro de texto Nombre
				textoNombre = new JTextField();
				textoNombre.setBounds(81, 58, 226, 22);
				contentPane.add(textoNombre);
				textoNombre.setColumns(10);
				
		//A�adimos cuadro de texto Apellidos1	
				textoApellido1 = new JTextField();
				textoApellido1.setColumns(10);
				textoApellido1.setBounds(81, 105, 226, 22);
				contentPane.add(textoApellido1);
				

		//A�adimos cuadro de texto Apellidos1					
				textoApellido2 = new JTextField();
				textoApellido2.setColumns(10);
				textoApellido2.setBounds(81, 153, 226, 22);
				contentPane.add(textoApellido2);
				
		//A�adimos cuadro de texto Edad		
				textoEdad = new JTextField();
				textoEdad.setColumns(10);
				textoEdad.setBounds(81, 200, 226, 22);
				contentPane.add(textoEdad);
		
		//A�adimos caja de texto Datos
				JTextArea textoDatos = new JTextArea();
				textoDatos.setBounds(12, 273, 408, 51);
				contentPane.add(textoDatos);
				
		//A�adimos bot�n de Datos
				botonDatos = new JButton("A JUGAR");
		//Evento addActionListener		
				botonDatos.addActionListener(new ActionListener() {
		//Acci�n del evento			
					public void actionPerformed(ActionEvent arg0) {
						
						if ((textoNombre.getText().length()==0)||(textoApellido1.getText().length()==0)||(textoApellido2.getText().length()==0)||(textoEdad.getText().length()==0)) {//comparamos si las cajas de texto est�n vacias
						
						textoDatos.setText("Alg�n campo por rellenar");
						
						}else{
							j1=new Jugador();
							conten1=new Contenedor();
							j1.setNombre(textoNombre.getText());
							j1.setApellido1(textoApellido1.getText());
							j1.setApellido2(textoApellido2.getText());
							String EdadString=textoEdad.getText();
							int edad=Integer.valueOf(EdadString);
							j1.setEdad(edad);
							
							//juego1.setJugador(j1);
							
							//Cerramos la ventana Login
							cerrar.setVisible(false);
							//Abrimos la ventana Juego
							conten1.setVisible(true);
							
						
								
							
							
						}
					}
				});
				botonDatos.setBounds(12, 235, 408, 25);
				contentPane.add(botonDatos);
				
			
	
			;			
		
	}
}