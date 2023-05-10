package vista;

import java.awt.Color;
import java.awt.Graphics;

import control.ControlCalculadora;

//los simbolos son naranjas
public class simbolos extends boton {
	ControlCalculadora oyente;
	public simbolos() {
		
	}
	
	public simbolos(String etiqueta) {
		super(etiqueta);
		this.oyente=new ControlCalculadora();
		this.addActionListener(oyente);
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        setForeground(Color.ORANGE); // Establecemos el color naranja para el texto
        super.paintComponent(g);
    }
}