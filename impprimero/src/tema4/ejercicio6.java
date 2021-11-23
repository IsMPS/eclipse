package tema4;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
//Math.sqrt(0) (raíz cuadrada)
		Scanner sc = new Scanner(System.in);
		double g = 9.81;
		System.out.println("Introduzca la altura en metros para saber cuanto tarda en caer el objeto de dicha altura");
		double h = sc.nextDouble();
		System.out.println("El tiempo que tarda en caer es de " + Math.sqrt(2*h/g) + " segundos");
		sc.close();
	}
}
