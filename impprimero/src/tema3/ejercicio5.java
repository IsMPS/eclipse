package tema3;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
	//	Escribe un programa que calcule el área de un rectángulo.
		System.out.println("Introduce la medida de los lados del rectángulo");
		Scanner sc = new Scanner(System.in);
		int altura;
		int lado;
		altura = sc.nextInt();
		lado = sc.nextInt();
		System.out.println("El área del rectángulo es " + (altura*lado));
		sc.close();
	}

}
