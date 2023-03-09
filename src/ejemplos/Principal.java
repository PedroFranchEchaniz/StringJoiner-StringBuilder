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
		
		StringBuilder sb = new StringBuilder("Pedro");
		boolean verdad = true;	
		sb.append(" El mejor del mundo");
		
		System.out.println(sb);
		sb.append(verdad);
		System.out.println(sb);
		
	}

}
