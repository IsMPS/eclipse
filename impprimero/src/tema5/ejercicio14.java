package tema5;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce la base ");
		int base = sc.nextInt();
		System.out.print("Introduce el exponente ");
		int n = sc.nextInt();
		int resultado = 0;
		int ba =base;
		while (n-1>0) {
			 resultado = base*ba;
			ba=resultado;
			n--;
		}
		System.out.println(resultado);
		sc.close();

	}

}
