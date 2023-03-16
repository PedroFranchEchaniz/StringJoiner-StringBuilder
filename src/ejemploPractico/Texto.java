package ejemploPractico;

import java.util.ArrayList;
import java.util.List;

public class Texto {

	private StringBuilder contenido;

	public Texto(StringBuilder contenido) {
		super();
		this.contenido = contenido;
	}

	public StringBuilder getContenido() {
		return contenido;
	}

	public void setContenido(StringBuilder contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Texto [contenido=" + contenido + "]";
	}
	
	public List<Integer> BuscarNio() {
		String letraNio = "ñ";
		int suplemento = 0;
		List<Integer> listanum = new ArrayList<Integer>();
		
			suplemento = contenido.indexOf(letraNio);
			listanum.add(suplemento);
		
		return listanum;		
		
	}
	
	public char [] separarLetras() {
		char c2[] = new char [contenido.length()];		
		contenido.getChars(0, contenido.length(), c2, 0);		
		return c2;
	}
	


	
}
