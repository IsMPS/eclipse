package tema4;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
//		Escribe un programa que diga cuál es la primera cifra de un número entero
//		introducido por teclado. Se permiten números de hasta 5 cifras.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número para saber su primera cifra. Máximo 5 números de 5 cifras.");
		int num = sc.nextInt();
		int cifra = 0;
		if (num<10) {
		cifra = num;
		}
		if (num>9 && num<100) {
		cifra = num/10;
		}
		if (num>99 && num<1000) {
		cifra = num/100;
		}
		if (num>999 && num<10000) {
		cifra = num/1000;
		}
		if (num>9999 && num<100000) {
		cifra = num/10000;
		} 	
		System.out.println("La primera cifra del número " + num + " es " + cifra);
		sc.close();
	}

}
