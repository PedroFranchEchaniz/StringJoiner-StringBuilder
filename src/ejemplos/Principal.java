package ejemplos;

import java.util.StringJoiner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner sj = new StringJoiner(",");
		sj.add("Lolo");
		sj.add("Pedro");
		sj.add("Angel");
		
		System.out.println(sj);
	}

}
