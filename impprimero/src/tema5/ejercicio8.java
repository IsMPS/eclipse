package tema5;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número para mostrar su tabla de multiplicar ");
		int a = sc.nextInt();
		int i = 0;
		while (i<=10) {
			System.out.println(i + " * " + a + " = " + (i*5));
			i++;
		}
		sc.close();
	}

}
