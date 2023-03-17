package ejemploPractico;

import java.util.StringJoiner;

public class Correo {

	private String nombre;
	private String apellido;
	
	
	public Correo(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Correo [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public String acortarNombre() {
		StringBuilder nombre = new StringBuilder(this.nombre.toLowerCase());		
		return nombre.substring(0, 3);		
	}
	
	public String acortarApellido() {
		StringBuilder apellido = new StringBuilder(this.apellido.toLowerCase());		
		return apellido.substring(0, 3);		
	}
	
	public void generarCorreo() {
		StringJoiner correogenerado = new StringJoiner("23", "", "@gmail.com");
		correogenerado.add(acortarNombre());
		correogenerado.add(acortarApellido());
		System.out.println(correogenerado);
	}
	
}
