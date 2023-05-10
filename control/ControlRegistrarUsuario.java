package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Usuario;
import modelo.login;
import vista.CrearUsuario;
import vista.LoginForm;
//activador que gestiona la creacion de un nuevo usuario
public class ControlRegistrarUsuario  implements ActionListener{
		
		CrearUsuario ventanaInicio;
		
		public ControlRegistrarUsuario(CrearUsuario ventanaInicio) {
			this.ventanaInicio=ventanaInicio;
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
            String user = ventanaInicio.userTextField.getText();
            String password = new String(ventanaInicio.passwordField.getPassword());
            login entrada=new login();
            Usuario usuario=new Usuario(user,password);
            boolean check=entrada.register(usuario);
            if (check==false) {
               JOptionPane.showMessageDialog(ventanaInicio, "Usuario creado exitosamente");
                ventanaInicio.dispose();
                LoginForm IniciarSesion=new LoginForm();
            } else {
                JOptionPane.showMessageDialog(ventanaInicio, "Error al crear usuario y contraseña");
            }
		}
	}


