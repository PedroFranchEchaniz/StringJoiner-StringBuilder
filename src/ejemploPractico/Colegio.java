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

	/*Este metodo selecciona los tres primeros caracteres del nombre*/
	public String acortarNombre(int index) {
		String nombre;		
		StringBuilder nombreAcortado = new StringBuilder(listaAlumno.get(index).getNombre());
		nombre = nombreAcortado.subSequence(0, 3).toString();
		return nombre;
	}
	
	/*Este metodo selecciona los tres primeros caracteres del apellido*/
	public String acortarApellido(int index) {
		String apellido;		
		StringBuilder apellidoAcortado = new StringBuilder(listaAlumno.get(index).getApellido());
		apellido=apellidoAcortado.substring(0, 3);
		return apellido;
	}

	/*Este metodo une el nombre generado por el metodo acortarNombre, el apellido generado por acortarApellido junto al int y el String indicado por el usuario*/
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
	
	/*Este metodo setea los correos electronicos a los alumnos*/
	public void agregarCorreo(List<String> correos) {
		for(int i = 0; i<listaAlumno.size(); i++) {
			listaAlumno.get(i).setCorreo(correos.get(i));
		}
	}
	
	/*Este metodo elimina los espacios de las cadenas, funciona buscando la primera aparición de un espacio en la cadena, almacena su índice y lo borra, a continuación recorre nuevamente la cadena
	 * y realiza el mismo proceso si vuelve a encontrar otro espacio. Esto lo hace hasta que no encuentre ninguno e indexOf pase a valer -1*/
	public String eliminarEspacios(String texto) {
		StringBuilder textoaux = new StringBuilder(texto);
		int index = textoaux.indexOf(" ");
		while (index != -1) {
			textoaux.deleteCharAt(index);
			index = textoaux.indexOf(" ", index + 1);
		}
		return textoaux.toString();
	}
	
	/*Este metodo utiliza StringJoiner para imprimir una lista de correos separados por comas y haciendo que la lista se encuentre entre corchetes*/
	public void imprimirListaCorreos (List<Alumno> lista) {
		StringJoiner listaCorreos = new StringJoiner(",", "[", "]");
		for (Alumno a : lista) {
			listaCorreos.add(a.getCorreo());
		}
		System.out.println(listaCorreos.toString());
	}
}
