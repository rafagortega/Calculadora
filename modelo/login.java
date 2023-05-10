package modelo;

import java.io.*;
//falta que se escriba la lista con los usuarios y contraseñas
import java.util.HashMap;
import modelo.Usuario;

//aqui va la gestión y almacenamiento de los usuarios-claves
public class login {
	private static HashMap<String,Usuario> usuarios=new HashMap<String,Usuario>();
	private static File archivo=new File("usuarios.dat");
		public login() {
			if(archivo.exists()==false) {
				try {
					archivo.createNewFile();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			read();
			System.out.println(usuarios.keySet());
			
			
		}

		public boolean register(Usuario usuario) {
			
			boolean registered=false;
			if(usuarios.containsKey(usuario.getUsername())) {
				registered=true;
			}else {
			
			FileOutputStream fos=null;
			ObjectOutputStream oos=null;
			try {
				usuarios.put(usuario.getUsername(), usuario);
				fos = new FileOutputStream(archivo);
				oos=new ObjectOutputStream(fos);
				oos.writeObject(usuarios);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			}
			//System.out.println(usuarios);
			return registered;
			
		}
		
		public void read() {
			FileInputStream fis;
			ObjectInputStream ois;
			try {
				fis=new FileInputStream(archivo);
				ois=new ObjectInputStream(fis);
				usuarios=(HashMap<String, Usuario>)ois.readObject();
				
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			
		}
		
		public boolean check(String username,String password ){
			boolean passCorrect=false;
			if(usuarios.containsKey(username)) {
				
				if(password.equals(usuarios.get(username).getPassword())) {
					passCorrect=true;
				}
			
			
		}
			return passCorrect;
		}
		
		public HashMap<String, Usuario> getLista() {
			System.out.println(usuarios);
			return usuarios;
		}
		
}
