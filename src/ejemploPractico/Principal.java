package ejemploPractico;

import java.util.StringJoiner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder texto = new StringBuilder("ñonñraseña ñoña");
		Texto t1 = new Texto (texto);
		
		t1.cambiarLetra("ñ", 'n');
		
		System.out.println(t1);
		
		t1.eliminarEspacios(" ");
		System.out.println(t1);
		
		
		StringBuilder nombre = new StringBuilder("pedro");
		StringBuilder apellido = new StringBuilder("franch");
		
		String apellidoCorreo=apellido.substring(0, 3);
		String nombreCorreo= nombre.substring(0, 3);
		
		StringJoiner correo = new StringJoiner("", "", "@gmail.com");
		correo.add(nombreCorreo);
		correo.add(apellidoCorreo);
		System.out.println(correo);
		
	}
}
