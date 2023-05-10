package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Vista {
	public static Vista vista;
    public JFrame frame;
    public JTextField textFieldUp,textFieldDown;
    private JPanel panel, panelRes;
     public numeros button0, button1, button2, button3, button4, button5, button6, button7, button8, button9 ,buttonDecimal;
  public simbolos  buttonEquals, buttonAdd, buttonSubtract, 
    buttonMultiply, buttonDivide, buttonClear,buttonDelete,buttonModule, buttonExit;
    
    public Vista() {
    	vista=this;
        frame = new JFrame("Calculator");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //campo de arriba con las operaciones
        textFieldUp = new JTextField();
        textFieldUp.setPreferredSize(new Dimension(400, 100));
        textFieldUp.setFont(new Font("Arial", Font.BOLD, 24));
        textFieldUp.setHorizontalAlignment(JTextField.RIGHT);
        textFieldUp.setEditable(false);
        textFieldUp.setBorder(new EmptyBorder(0,0,0,0));
        
        //campo de abajo con el igual
        textFieldDown = new JTextField("0");
        textFieldDown.setPreferredSize(new Dimension(400, 100));
        textFieldDown.setFont(new Font("Arial", Font.BOLD, 24));
        textFieldDown.setHorizontalAlignment(JTextField.RIGHT);
        textFieldDown.setEditable(false);
        textFieldDown.setBorder(new EmptyBorder(0,0,0,0));
        
        //panel con los resultados
        panelRes=new JPanel();
        panelRes.setLayout(new GridLayout(2,1));
        
        panelRes.add(textFieldUp);
        panelRes.add(textFieldDown);
        
        //panel con los botones
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        //generamos botones
        button7 = new numeros("7");
        button8 = new numeros("8");
        button9 = new numeros("9");
        buttonDivide = new simbolos("÷");
        button4 = new numeros("4");
        button5 = new numeros("5");
        button6 = new numeros("6");
        buttonMultiply = new simbolos("x");
        button1 = new numeros("1");
        button2 = new numeros("2");
        button3 = new numeros("3");
        buttonSubtract = new simbolos("-");
        button0 = new numeros("0");
        buttonDecimal = new numeros(".");
        buttonEquals = new simbolos("=");
        buttonAdd = new simbolos("+");
        buttonClear = new simbolos("AC");
        buttonDelete= new simbolos("DEL");
        buttonModule= new simbolos("%");
        buttonExit=new simbolos("Exit");
        
        //añadimos los botones a su panel
        panel.add(buttonClear);
        panel.add(buttonDelete);
        panel.add(buttonModule);
        panel.add(buttonDivide);
        
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonMultiply);
        
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonSubtract);
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonAdd);
        
        panel.add(buttonExit);
        panel.add(button0);
        panel.add(buttonDecimal);
        panel.add(buttonEquals);
        
        panel.setBackground(Color.WHITE);
        textFieldUp.setBackground(Color.white);
        textFieldDown.setBackground(Color.white);
        
        frame.add(panelRes, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

	}}
