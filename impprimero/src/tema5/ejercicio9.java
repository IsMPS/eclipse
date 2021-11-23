package tema5;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
//		Realiza un programa que nos diga cuántos dígitos tiene un número introducido
//		por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
//		la salvedad de que el anterior estaba limitado a números de 5 dígitos como
//		máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
//		esta manera, la única limitación en el número de dígitos la establece el tipo de
//		dato que se utilice (int o long).
		Scanner sc = new Scanner (System.in);
		int i = 1;
		System.out.print("Introduce un número para saber cuantos dígitos tiene ");
		int num = sc.nextInt();
		while (i>0) {
			if (num>-(Math.pow(10, i)) && num<Math.pow(10, i)) {
				System.out.println("El número tiene " + i + " cifra");
				i = -1;
				} else {
					i++;
				}
		}
//		while (num>=10) {
//			num= num/10;
//			i++;
//			}
//		System.out.println("El número tiene " + i + " dígitos.");
		sc.close();
	}
}
