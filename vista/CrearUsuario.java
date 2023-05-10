package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import control.ControlCrearUsuario;
import control.ControlLogin;
import control.ControlRegistrarUsuario;

public class CrearUsuario extends JFrame {
	public JLabel userLabel, passwordLabel;
    public JTextField userTextField;
    public JPasswordField passwordField;
    public JButton RegisterButton;

    public CrearUsuario() {
        setTitle("Crear Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);

        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userTextField = new JTextField();
        passwordField = new JPasswordField();
        RegisterButton = new JButton("Registrar Usuario");
        
        ControlRegistrarUsuario oyente=new ControlRegistrarUsuario(this);
        RegisterButton.addActionListener(oyente);
        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(RegisterButton);

        add(panel);
        setVisible(true);
}
}
