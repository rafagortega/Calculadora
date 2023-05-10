package vista;

import javax.swing.*;

import control.ControlCrearUsuario;
import control.ControlLogin;

import java.awt.*;
public class LoginForm extends JFrame {

    public JLabel userLabel, passwordLabel;
    public JTextField userTextField;
    public JPasswordField passwordField;
    public JButton loginButton,createUser;

    public LoginForm() {
        setTitle("Inicio de sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);

        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userTextField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Iniciar sesión");
        createUser=new JButton("Crear Usuario");
        
        ControlLogin oyente=new ControlLogin(this);
        ControlCrearUsuario crearUsuario=new ControlCrearUsuario(this);
        loginButton.addActionListener(oyente);
        createUser.addActionListener(crearUsuario);
        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(createUser);

        add(panel);
        setVisible(true);
    }
    
    
}
