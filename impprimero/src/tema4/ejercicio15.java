package tema4;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
//		Escribe un programa que pinte una pir�mide rellena con un car�cter introducido
//		por teclado que podr� ser una letra, un n�mero o un s�mbolo como *, +, -, $, &,
//		etc. El programa debe permitir al usuario mediante un men� elegir si el v�rtice
//		de la pir�mide est� apuntando hacia arriba, hacia abajo, hacia la izquierda o
//		hacia la derecha.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un s�mbolo cualquiera para hacer una pir�mide");
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
