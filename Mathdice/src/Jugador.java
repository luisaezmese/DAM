import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Definici�n de la clase mediante la palabra reservada Jugador 
 **/
public class Jugador extends JFrame{
	
	
	//PROPIEDADES
	private JPanel contentPane;
	private String Nombre;
	private String Apellido;
	private int Puntos;
	private int Edad;
	private JTextField textoNombre;
	private JTextField textoApellidos;
	private JTextField textoEdad;
	private JButton botonDatos;
	
	// Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo Juagador
	public Jugador() {
		
		
		//Las propiedades de nuestra ventana
				setTitle("JUGADOR");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Dimensiones de nuestra ventana		
				setBounds(100, 100, 450, 360);
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
				
		//A�adimos la etiqueta Apellidos
				JLabel etiquetasApellidos = new JLabel("Apellidos");
				etiquetasApellidos.setBounds(12, 108, 72, 16);
				contentPane.add(etiquetasApellidos);
		
		//A�adimos la etiqueta Edad
				JLabel etiquetaEdad = new JLabel("Edad");
				etiquetaEdad.setBounds(12, 156, 72, 16);
				contentPane.add(etiquetaEdad);
				
		//A�adimos cuadro de texto Nombre
				textoNombre = new JTextField();
				textoNombre.setBounds(81, 58, 226, 22);
				contentPane.add(textoNombre);
				textoNombre.setColumns(10);
				
		//A�adimos cuadro de texto Apellidos	
				textoApellidos = new JTextField();
				textoApellidos.setColumns(10);
				textoApellidos.setBounds(81, 105, 226, 22);
				contentPane.add(textoApellidos);
				
		//A�adimos cuadro de texto Edad		
				textoEdad = new JTextField();
				textoEdad.setColumns(10);
				textoEdad.setBounds(81, 153, 226, 22);
				contentPane.add(textoEdad);
		
		//A�adimos caja de texto Datos
				JTextArea textoDatos = new JTextArea();
				textoDatos.setBounds(12, 227, 408, 73);
				contentPane.add(textoDatos);
				
		//A�adimos bot�n de Datos
				botonDatos = new JButton("A JUGAR");
		//Evento addActionListener		
				botonDatos.addActionListener(new ActionListener() {
		//Acci�n del evento			
					public void actionPerformed(ActionEvent arg0) {
						if ((textoNombre.getText().length()==0)||(textoApellidos.getText().length()==0)||(textoEdad.getText().length()==0)) {//comparamos si las cajas de texto est�n vacias
							textoDatos.setText("Alg�n campo por rellenar");
						}else{
							setNombre(textoNombre.getText());
							setApellido(textoApellidos.getText());
							String EdadString=textoEdad.getText();
							int edad=Integer.valueOf(EdadString);
							setEdad(edad);
							textoDatos.setText("Player "+getNombre()+" "+getApellido()+" de edad "+getEdad()+" ha sido generado");
						}
					}
				});
				botonDatos.setBounds(12, 189, 408, 25);
				contentPane.add(botonDatos);
			
				
	}
	//FUNCIONES O METODOS
	//public OUT nombreMetodo (IN)

	//DEFINO EL METODO Nombre
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	//DEFINO EL METODO Apellido
	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	//DEFINO EL METODO Edad
	public int getEdad() {
		return Edad;
	}

	
	public void setEdad(int edad) {
		this.Edad = edad;
	}

	//DEFINO EL METODO Puntos
	public int getPuntos() {
		return Puntos;
	}


	public void setPuntos(int puntos) {
		this.Puntos = puntos;
	}
	
}
