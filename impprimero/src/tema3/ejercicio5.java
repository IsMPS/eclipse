package tema3;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
	//	Escribe un programa que calcule el �rea de un rect�ngulo.
		System.out.println("Introduce la medida de los lados del rect�ngulo");
		Scanner sc = new Scanner(System.in);
		int altura;
		int lado;
		altura = sc.nextInt();
		lado = sc.nextInt();
		System.out.println("El �rea del rect�ngulo es " + (altura*lado));
		sc.close();
	}

}
