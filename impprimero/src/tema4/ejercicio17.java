package tema4;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// Escribe un programa que diga cu�l es la �ltima cifra de un n�mero entero introducido por teclado.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un n�mero y te dir� la �ltima cifra");
		int num = sc.nextInt();
		int num1 = num/10;
		num1 = num1*10;
		System.out.println("La �ltima cifra es " + (num - num1));
		sc.close();
	}

}
