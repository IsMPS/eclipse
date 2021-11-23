package tema4;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// Escribe un programa que dada una hora determinada (horas y minutos), calcule
		//los segundos que faltan para llegar a la medianoche.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca las horas ");
		int horas = sc.nextInt();
		System.out.println("Introduzca los minutos ");
		int min = sc.nextInt();
		System.out.println("Quedan " + ((24*60*60)-(horas*60*60 + min*60)) + " segundos para medianoche");
		sc.close();
	}

}
