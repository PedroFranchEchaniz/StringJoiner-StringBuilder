package ejemploPractico;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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

	public void cambiarLetra(String letraAcambiar, char letraDeCambio) {
		int index = contenido.indexOf(letraAcambiar);
		while (index != -1) {
			contenido.setCharAt(index, letraDeCambio);
			index = contenido.indexOf(letraAcambiar, index + 1);
		}

	}

	public void eliminarEspacios(String espacio) {
		int index = contenido.indexOf(espacio);
		while (index != -1) {
			contenido.deleteCharAt(index);
			index = contenido.indexOf(espacio, index + 1);
		}
	}

	/*
	 * Es como el Turing busca la primera concurrencia con indexOf(letraAcambiar) la
	 * encuentra en una posición y entra en el bucle con un valor en el indice. En
	 * setCharAt cambia la letra en el indice que a encontrado en un primer momento
	 * por la letra de cambio. Para pasar a por la siguiente letra volvemos a
	 * utilizar indexOf pero esta vez pasamos la letra que queremos encontrar y el
	 * indice que es el anterior + 1 para que empiece desde la siguiente letra que
	 * se cambio. Así recore la cadena cambiando una a una las letras hasta que no
	 * encuentre ninguna y devuelva -1 saliendo del bubcle
	 */

}
