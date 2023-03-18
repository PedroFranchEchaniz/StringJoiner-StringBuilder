package ejemploPractico;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String variable, nombre, apellido, extension;
		int respuesta = 0, anio;
		
		StringBuilder sb = new StringBuilder("esoEsunStrinBuilder");
		sb.insert(3, "TTTTTT");
		
		
		System.out.println(sb);

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
			System.out.println("3-Ver listado de correos");
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
				System.out.println("Indique los dos últimos digitos del año de matricula");
				anio = Leer.datoInt();
				System.out.println("Indique la extension del correo");
				extension = Leer.dato();
				salesianos.agregarCorreo(salesianos.generarCorreo(anio, extension));
				System.out.println(listaAlumnos);
				break;
			case 3:
				salesianos.imprimirListaCorreos(listaAlumnos);
				break;
			case 0:
				System.out.println("Saliendo");
				break;

			}

		} while (respuesta != 0);
	}
}
