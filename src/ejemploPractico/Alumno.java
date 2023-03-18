package ejemploPractico;

import java.util.StringJoiner;

public class Alumno {

	private String nombre;
	private String apellido;
	private String correo;
	
	
	public Alumno(String nombre, String apellido) {
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


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + "]";
	}	
	
	
}
