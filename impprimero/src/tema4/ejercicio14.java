package tema4;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// Realiza un programa que diga si un n�mero introducido por teclado es par y/o divisible entre 5.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un n�mero para saber si es par y/o divisible entre 5 ");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("El n�mero es par");
		}
		else {
			System.out.println("Es impar");
		}
		if (num%5==0) {
			System.out.println("El n�mero es divisible entre 5");
		}
		else {
			System.out.println("El n�mero no es divisible entre 5 con n�meros enteros");
		}
		sc.close();
	}

}
