package tema4;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// Realiza un programa que calcule la media de tres notas
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la primera nota");
		double nota1 = sc.nextDouble();
		System.out.println("Introduzca la segunda nota");
		double nota2 = sc.nextDouble();
		System.out.println("Introuzca la tercera nota");
		double nota3 = sc.nextDouble();
		double resultado = (nota1+nota2+nota3)/3;
		System.out.println("La nota media es " + resultado);
		if (resultado<5) {
			System.out.println("Insuficiente");
		}
		if ((resultado>=5) && (resultado<6)) {
			System.out.println("Suficiente");
		}
		if ((resultado>=6) && (resultado<7)) {
			System.out.println("Bien");
		}
		if ((resultado>=7) && (resultado<=8)) {
			System.out.println("Notable");
		}
		if((resultado>8) && (resultado<=10)) {
			System.out.println("Sobresaliente");
		}
		sc.close();
	}

}
