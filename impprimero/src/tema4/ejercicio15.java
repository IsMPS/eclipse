package tema4;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
//		Escribe un programa que pinte una pirámide rellena con un carácter introducido
//		por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
//		etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
//		de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
//		hacia la derecha.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un símbolo cualquiera para hacer una pirámide");
		String sim = sc.next();
		System.out.println("Elige si quiere que sea hacia 'arriba', 'abajo', 'izquierda' o 'derecha'");
		String tipo = sc.next();
		switch (tipo) {
		case "arriba" :
			System.out.println("      " + sim);
			System.out.println("     " + sim + " " + sim);
			System.out.println("    " + sim + " " + sim + " " + sim);
			System.out.println("   " + sim + " " + sim + " " +  sim + " " + sim);
			System.out.println("  " + sim + " " + sim + " " + sim + " " + sim + " " + sim);
			System.out.println(" " + sim + " " + sim + " " + sim + " " + sim + " " + sim + " " + sim);
			System.out.println(sim + " " + sim + " " + sim + " " + sim + " " + sim + " " + sim + " " + sim);
		break;
		case "abajo" :
			System.out.println(sim + " " + sim + " " + sim + " " + sim + " " + sim + " " + sim + " " + sim);
			System.out.println(" " + sim + " " + sim + " " + sim + " " + sim + " " + sim + " " + sim);
			System.out.println("  " + sim + " " + sim + " " + sim + " " + sim + " " + sim);
			System.out.println("   " + sim + " " + sim + " " +  sim + " " + sim);
			System.out.println("    " + sim + " " + sim + " " + sim);
			System.out.println("     " + sim + " " + sim);
			System.out.println("      " + sim);
		break;
		case "derecha":
			System.out.println(sim);
			System.out.println(sim + "	" + sim);
			System.out.println(sim + "	" + sim + "	" + sim);
			System.out.println(sim + "	" + sim + "	" + sim + "	" + sim);
			System.out.println(sim + "	" + sim + "	" + sim + "	" + sim + "	" + sim);
			System.out.println(sim + "	" + sim + "	" + sim + "	" + sim);
			System.out.println(sim + "	" + sim + "	" + sim);
			System.out.println(sim + "	" + sim);
			System.out.println(sim);
		break;
		case "izquierda":
			System.out.println("				" + sim);
			System.out.println("	" + sim + "	" + sim + "	" + sim + "	" + sim);
			System.out.println(sim + "	" + sim + "	" + sim + "	" + sim + "	" + sim);
			System.out.println("	" + sim + "	" + sim + "	" + sim + "	" + sim);
			System.out.println("				" + sim);
		break;
		}
		sc.close();
	}

}
