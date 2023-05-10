package vista;

import control.ControlCalculadora;

//los numeros son negros
public class numeros extends boton {
	ControlCalculadora oyente;
	public numeros() {	
		
	}
	
	public numeros(String etiqueta) {
		super(etiqueta);
		this.oyente=new ControlCalculadora();
		this.addActionListener(oyente);
	}
}
