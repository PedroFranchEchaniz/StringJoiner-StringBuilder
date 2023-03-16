package ejemploPractico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder texto = new StringBuilder("coñtraseña");
		Texto t1 = new Texto(texto);

		System.out.println(t1.separarLetras());
		char[] aux = new char[texto.length()];
		int [] listaIndices = new int [texto.length()];

		aux = t1.separarLetras();

		System.out.println(t1.BuscarNio());
		System.out.println(aux[2]);

		for (int i = 0; i < t1.getContenido().length(); i++) {
			int numero= 0;
			if (aux[i] == 'ñ') {
				listaIndices[numero] = aux[i];
				numero++;
			}			
		}
		for (int i = 0; i < t1.getContenido().length(); i++) {
				System.out.println(listaIndices[i]);
		}
	}
}
