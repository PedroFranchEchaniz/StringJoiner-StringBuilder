package ejemploPractico;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String variable, nombre, apellido;
		int respuesta = 0;

		System.out.println("Introduzca el nombre de la variable");
		variable = Leer.dato();

		StringBuilder texto = new StringBuilder(variable);
		Texto t1 = new Texto(texto);

		t1.cambiarLetra("ñ", 'n');

		System.out.println(t1);

		t1.eliminarEspacios(" ");
		System.out.println(t1);

		int anio = 0;
		String extension;
		StringBuilder nombre2 = new StringBuilder("pedro");
		StringBuilder apellido2 = new StringBuilder("franch");

		String apellidoCorreo = apellido2.substring(0, 3);
		String nombreCorreo = nombre2.substring(0, 3);

		StringJoiner correo = new StringJoiner("", "", "@gmail.com");
		correo.add(nombreCorreo);
		correo.add(apellidoCorreo);
		System.out.println(correo);

		Alumno c1 = new Alumno("Pedro", "Franch");

		System.out.println(c1);

		System.out.println("---------------------------------------------------");
		Alumno a1 = new Alumno("Pedro", "Franch");
		Alumno a2 = new Alumno("Manuel", "Molina");
		Alumno a3 = new Alumno("Francisco", "Lebron");

		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);

		Colegio salesianos = new Colegio(listaAlumnos);

		do {

			System.out.println("1-Agregar alumno");
			System.out.println("2-Generar correo para el alumno");
			System.out.println("0-Salir del programa");
			respuesta = Leer.datoInt();
			switch (respuesta) {
			case 1:
				System.out.println("Indique el nombre del alumno");
				nombre = salesianos.eliminarEspacios(Leer.dato());
				System.out.println("Indique el apellido");
				apellido = salesianos.eliminarEspacios(Leer.dato());
				Alumno a4 = new Alumno(nombre, apellido);
				listaAlumnos.add(a4);
				break;
			case 2:
				System.out.println("Indique el los dos últimos digitos del año de matricula");
				anio = Leer.datoInt();
				System.out.println("Indique la extension del correo");
				extension = Leer.dato();
				salesianos.agregarCorreo(salesianos.generarCorreo(anio, extension));
				System.out.println(listaAlumnos);
				break;
			case 0:
				System.out.println("Saliendo");
				break;

			}

		} while (respuesta != 0);
	}
}
