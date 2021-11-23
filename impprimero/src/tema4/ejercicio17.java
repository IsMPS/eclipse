package tema4;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número y te diré la última cifra");
		int num = sc.nextInt();
		int num1 = num/10;
		num1 = num1*10;
		System.out.println("La última cifra es " + (num - num1));
		sc.close();
	}

}
