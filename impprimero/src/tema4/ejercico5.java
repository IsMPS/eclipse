package tema4;

import java.util.Scanner;

public class ejercico5 {

	public static void main(String[] args) {
//		Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
//				0).
//				Ejemplo 1:
//				Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//				Por favor, introduzca el valor de a: 2
//				Ahora introduzca el valor de b: 1
//				x = -0.5
//				Ejemplo 2:
//				Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//				Por favor, introduzca el valor de a: 0
//				Ahora introduzca el valor de b: 7
//				Esa ecuación no tiene solución real.
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca valor para a:");
			double a = sc.nextDouble();
			System.out.println("Introduzca valor para b:");
			double b = sc.nextDouble();
			if (a == 0) {
			System.out.println("Esa ecuación no tiene solución real");
			}
			else {
				System.out.println("x es igual a " + -b/a);
			}
sc.close();
	}

}
