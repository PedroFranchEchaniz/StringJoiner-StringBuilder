package ejemplos;

import java.util.StringJoiner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------StringJoiner------");
		String nombre = "Lolo Pedro Angel";
		
		StringJoiner sj = new StringJoiner(":");
		sj.add("Lolo");
		sj.add("Pedro");
		sj.add("Angel");
		sj.add("Fran");
		
		System.out.println(sj);
		
		
		StringJoiner sj2 = new StringJoiner (",", "[","]");
		sj2.add("Lolo");
		sj2.add("Pedro");
		sj2.add("Angel");
		System.out.println("-------------");
		System.out.println(sj2);
		System.out.println("-------------");
		
		System.out.println(sj.length());
		System.out.println(sj2.length());
		System.out.println("-------------");
		sj.merge(sj2);
		System.out.println(sj);
		System.out.println("-------------");
		StringJoiner sj3 = new StringJoiner(":");
		sj3.setEmptyValue(nombre);
		System.out.println(sj3);
		System.out.println("-------------");
		System.out.println(sj3.toString());
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("------StringBuilder------");
		
		StringBuilder sb = new StringBuilder (); 
		StringBuilder sb2 = new StringBuilder (20);
		StringBuilder sb3 = new StringBuilder ('f');
		StringBuilder sb4 = new StringBuilder ("Pedro");
		StringBuilder sb5 = new StringBuilder ("Paco");
		
		
		
		int numero;
		
		char c [] =   {'a', 'b', 'c', 'd', 'e'};
		
		char c2[] = new char [10];
		String s = "Franch";
		
		sb4.append(c);		
		System.out.println(sb4);
		
		
		System.out.println(sb2.append(c, 2, 2));
		
		
		sb3.append(c, 0, 5);
		System.out.println(sb3); 
		
		sb4.append(s.toLowerCase(), 0, 3);
		System.out.println(sb4);
		
		
		System.out.println(sb5);
		
		System.out.println(sb5.capacity());
		System.out.println(sb3.capacity());
		
		System.out.println(sb5.charAt(3));
		
		System.out.println(sb5.codePointAt(3));
		
		numero = sb5.compareTo(sb5);
		
		System.out.println(numero);
		System.out.println(sb5);
		sb5.delete(0,2);
		System.out.println(sb5);
		
		
		System.out.println(sb4);
		sb4.deleteCharAt(1);
		System.out.println(sb4);
		System.out.println("************");
		sb4.getChars(0, 5, c2, 1);
		System.out.println(c2);	
		System.out.println("************");
		
		System.out.println(sb4.indexOf("d"));
		System.out.println(sb4.indexOf("Pdroabcdefra"));
		
		sb4.insert(2, c2, 3, 4);
		System.out.println(sb4);
		
	}

}
