package vista;

import java.awt.*;
import javax.swing.*;



//estos botones no tendrán borde ni contorno, estarán integrados en el fondo 
public class boton extends JButton {

	public boton(){
		setContentAreaFilled(false); // Hacemos que no se rellene el área del botón
        setOpaque(false); // Hacemos que el botón sea opaco para que se vea el fondo
        setBorderPainted(false);
        
        setFont(new Font("Arial", Font.PLAIN, 20)); // Establecemos la fuente del botón
		
	}
	public boton(String etiqueta) {
		super(etiqueta);
		setContentAreaFilled(false); // Hacemos que no se rellene el área del botón
        setOpaque(false); // Hacemos que el botón sea opaco para que se vea el fondo
        setBorderPainted(false);
        setFont(new Font("Arial", Font.PLAIN, 20)); // Establecemos la fuente del botón
        
	}
	  
	

}
