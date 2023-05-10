package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.login;
import vista.LoginForm;
import vista.Vista;

public class ControlLogin implements ActionListener{
	//gestiona el login, introduccion de usuario y password
	LoginForm ventanaInicio;
	public ControlLogin(LoginForm ventanaInicio) {
		this.ventanaInicio=ventanaInicio;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
            String user = ventanaInicio.userTextField.getText();
            String password = new String(ventanaInicio.passwordField.getPassword());
            login entrada=new login();
            boolean check=entrada.check(user, password);
            if (check==true) {
                JOptionPane.showMessageDialog(ventanaInicio, "Inicio de sesión exitoso");
                ventanaInicio.dispose();
                Vista prueba=new Vista();
            } else {
                JOptionPane.showMessageDialog(ventanaInicio, "Nombre de usuario o contraseña incorrectos");
            }
	
	
}
}
