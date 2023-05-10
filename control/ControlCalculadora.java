package control;


//falta programar exit y modulo
//falta acondicionar multiplicacion y division al igual
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import vista.*;
import modelo.calculadora;

public class ControlCalculadora implements ActionListener{
	//atributos para la clase
	Vista vista;
	
	static calculadora calculator;
	static ArrayList<String> cadena= new ArrayList<>();
	static int indice=0;
	static String numero="";
	public static String numeroConcatenado="";
	public static int contador;
	
	
	public ControlCalculadora() {
		try {
			this.vista=Vista.vista;
			calculator=new calculadora();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof numeros) {
			numeros boton=(numeros)e.getSource();
			String numero=boton.getText();
			concatenaNumero(numero);
			montaCadena(numero);
			leeCadena();
			
		}else if(e.getSource() instanceof simbolos) {
			simbolos simbolo=(simbolos) e.getSource();
			String operacion=simbolo.getText();
			if(operacion.equals("Exit")) {
				operacion(operacion,"");
			}else {
			if(operacion.equals("+")==true || operacion.equals("-")==true) {
				concatenaNumero(operacion);
			}
		
			montaCadena(operacion);
			leeCadena();
		
		}
		}
	}
	
	public void concatenaNumero(String numero) {
		
		numeroConcatenado=numeroConcatenado+numero;
		vista.textFieldDown.setText(numeroConcatenado);
	}
	

	
	
	//montacadena monta el array que despues leecadena leerá. Cada vez que se pulsa un boton se acciona
	//de tal modo que en tiempo real se va mostrando el calculo
	
	public void montaCadena(String texto) {
			
			if(texto.equals("+")||texto.equals("-")) {
				cadena.add("");
				indice++;
				cadena.add(indice, texto);
				indice++;
				numero="";
				
			}else if(texto.equals("x")||texto.equals("÷")||texto.equals("%")) {
				
				if(cadena.size()>=3) {
					cadena=new ArrayList<>();
					indice=0;
					cadena.add(String.valueOf(calculator.getResultado()));
					numero=String.valueOf(calculator.getResultado());
					operacion("=","");
				}
				indice++;
				cadena.add(indice, texto);
				indice++;
				numero="";
				concatenaNumero(texto);
				
			}else if(texto.equals("AC")){
				cadena.add("");
				cadena=new ArrayList<>();
				indice=0;
				numero="";
				operacion("AC","0");
			}else if(texto.equals("=")) {
				cadena=new ArrayList<>();
				indice=0;
				cadena.add(String.valueOf(calculator.getResultado()));
				numero=String.valueOf(calculator.getResultado());
				operacion("=","");
				cadena.add("");
			}else if(texto.equals("DEL")) {
				cadena.add("");
				if(numero.equals("")) {
					
				}else {
					String numeroAux="";
					for(int j=0;j<numero.length()-1;j++) {
						numeroAux=numeroAux+numero.charAt(j);
					}
					numero=numeroAux;
					cadena.set(indice, numero);
					operacion("DEL","");
					
				}

			}else {
				if(cadena.size()<=0) {
					cadena.add("");
				}else if(cadena.size()-1<indice) {
					cadena.add("");
				}
				
					
				
				
				numero=numero+texto;
				
				cadena.set(indice, numero);
			}
				
					
		}
	
	public void leeCadena() {
		for (int i=0;i<cadena.size();i++) {
			String texto=cadena.get(i);
			if(texto.equals("+")||texto.equals("-")||texto.equals("x")||texto.equals("÷")||texto.equals("%")) {
				if(i==1) {
					Double resultado=Double.parseDouble(cadena.get(i-1));
					calculator.setResultado(resultado);
					String resultText=String.valueOf(calculator.getResultado());
					this.vista.textFieldUp.setText(resultText);
				}
				operacion(cadena.get(i),cadena.get(i+1));
			}
		}
	}
	

	
	
	
	public void operacion(String simbolo,String numero) {
		
		switch(simbolo) {
		case "+":
			Double resultado=Double.parseDouble(numero);
			calculator.sumar(resultado);
			String resultText=String.valueOf(calculator.getResultado());
			this.vista.textFieldUp.setText(resultText);
			//numeroConcatenado="";
			//concatenaNumero(simbolo);
			break;
		case "-":
			resultado=Double.parseDouble(numero);
			calculator.restar(resultado);
			resultText=String.valueOf(calculator.getResultado());
			this.vista.textFieldUp.setText(resultText);
			//numeroConcatenado="";
			break;
			
		case "x":
			
			resultado=Double.parseDouble(numero);
			calculator.multiplicar(resultado);
			resultText=String.valueOf(calculator.getResultado());
			this.vista.textFieldUp.setText(resultText);
			//numeroConcatenado="";
			
			break;
			
		case "÷":
			resultado=Double.parseDouble(numero);
			calculator.dividir(resultado);
			resultText=String.valueOf(calculator.getResultado());
			this.vista.textFieldUp.setText(resultText);
			//numeroConcatenado="";
			break;
			
		case "%":
			resultado=Double.parseDouble(numero);
			calculator.modulo(resultado);
			resultText=String.valueOf(calculator.getResultado());
			this.vista.textFieldUp.setText(resultText);
			//numeroConcatenado="";
			break;
			
		case "AC":
			calculator.setResultado(0);
			this.vista.textFieldUp.setText("");
			this.vista.textFieldDown.setText("");
			numeroConcatenado="";
			
		
		
			
		case "DEL":
			if(numeroConcatenado.length()==0) {
				
			}else {
				String numeroAux="";
				for(int i=0;i<numeroConcatenado.length()-1;i++) {
					numeroAux=numeroAux+numeroConcatenado.charAt(i);
				}
				numeroConcatenado=numeroAux;
				this.vista.textFieldDown.setText(numeroConcatenado);
			}
			break;
		case "=":
			this.vista.textFieldUp.setText("");
			resultText=String.valueOf(calculator.getResultado());
			this.vista.textFieldDown.setText(resultText);
			numeroConcatenado=resultText;
			break;
		case "Exit":
			vista.frame.dispose();
		
			
		}
	}
}
	
	

