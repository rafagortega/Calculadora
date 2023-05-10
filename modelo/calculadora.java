package modelo;

import java.math.*;

public class calculadora {

	//En esta clase se encuentra la logica de la calculadora
	
	/*solucion al problema de los resultados raros
	 * 
	 * Reiniciar resultado cada vez que se le dé a igual*/
	public static double resultado;
	
	public calculadora() {
		resultado=0;
		
	}
	
	public void sumar(double numero) {
		resultado=resultado+numero;
	}
	
	public void restar(double numero) {
		resultado=resultado-numero;
	}
	
	public void multiplicar(double numero) {
		resultado=resultado*numero;
	}
	
	public void dividir(double numero) {
		resultado=resultado/numero;
	}
	
	public void potencia(double numero) {
		resultado=Math.pow(resultado, numero);
	}
	
	public void modulo(double numero) {
		resultado=resultado%numero;
	}
	
	public void raizCuadrada() {
		resultado=Math.sqrt(resultado);
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
	
	
}