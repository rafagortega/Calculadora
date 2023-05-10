package modelo;

import java.io.Serializable;

public class Usuario implements Serializable{
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", password=" + password + "]";
	}


	public Usuario() {
		super();
	}


	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
