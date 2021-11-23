package tema5;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce la base ");
		int base = sc.nextInt();
		System.out.print("Introduce el exponente ");
		int n = sc.nextInt();
		int resultado = 0;
		int ba = base;
		while (n>-5) {
			 resultado = base*ba;
			ba=resultado;
			n--;
			if (n-2<0 && n-2>=-5) {
				System.out.println(resultado);
			}
		}
		sc.close();

	}

}