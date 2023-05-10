package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.login;
import vista.CrearUsuario;
import vista.LoginForm;
//activador que lleva a la ventana de crear usuarios
public class ControlCrearUsuario implements ActionListener{
	
	CrearUsuario ventanaInicio;
	LoginForm ventanaLogin;
	public ControlCrearUsuario(LoginForm ventanaInicio) {
		this.ventanaLogin=ventanaInicio;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			this.ventanaInicio=new CrearUsuario();
			ventanaLogin.dispose();
	
	
}
}
