package tema3;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el volumen de un cono según la fórmula
		System.out.println("Introduzca el radio del cono");
		Scanner sc = new Scanner(System.in);
		double radio;
		double altura;
		double pi = Math.PI;
		radio = sc.nextDouble();
		System.out.println("Introduzca la altura del cono");
		altura = sc.nextDouble();
		System.out.println("El volumen del cono es " + ((1.0/3) * pi * radio * radio * altura));
		sc.close();
	}

}
