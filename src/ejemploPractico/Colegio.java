package ejemploPractico;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Colegio implements GenerarCorreo, CorregirNombre {

	private List<Alumno> listaAlumno;

	public Colegio(List<Alumno> listaAlumno) {
		super();
		this.listaAlumno = listaAlumno;
	}

	public List<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	@Override
	public String toString() {
		return "Colegio [listaAlumno=" + listaAlumno + "]";
	}

	public String acortarNombre(int index) {
		String nombre;		
		StringBuilder nombreAcortado = new StringBuilder(listaAlumno.get(index).getNombre());
		nombre = nombreAcortado.subSequence(0, 3).toString();
		return nombre;
	}
	
	public String acortarApellido(int index) {
		String apellido;		
		StringBuilder apellidoAcortado = new StringBuilder(listaAlumno.get(index).getApellido());
		apellido=apellidoAcortado.subSequence(0, 3).toString();
		return apellido;
	}

	public List<String> generarCorreo(int anio, String extension) {
		StringBuilder correo = new StringBuilder();
		List<String> correogenerado = new ArrayList<String>();

		for (int i = 0; i<listaAlumno.size(); i++) {
			correo.append(acortarNombre(i).toLowerCase());
			correo.append(acortarApellido(i).toLowerCase());
			correo.append(anio);
			correo.append(extension);
			correogenerado.add(correo.toString());
			correo.delete(0, 18);
		}
		return correogenerado;
	}
	
	public void agregarCorreo(List<String> correos) {
		for(int i = 0; i<listaAlumno.size(); i++) {
			listaAlumno.get(i).setCorreo(correos.get(i));
		}
	}
	
	public String eliminarEspacios(String texto) {
		StringBuilder textoaux = new StringBuilder(texto);
		int index = textoaux.indexOf(" ");
		while (index != -1) {
			textoaux.deleteCharAt(index);
			index = textoaux.indexOf(" ", index + 1);
		}
		return textoaux.toString();
	}
}
