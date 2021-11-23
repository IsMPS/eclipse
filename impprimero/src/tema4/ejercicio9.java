package tema4;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// x= (-b+-(raiz cuadrada)b(alcuadrado)-4ac)/2a
		//Math.pow(0, 0)
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el valor a ");
		double a = sc.nextDouble() ;
		System.out.print("Introduzca el valor b ");
		double b = sc.nextDouble() ;
		System.out.print("Introduzca el valor c ");
		double c = sc.nextDouble() ;
		if (a==0) {
			System.out.println("No resultado");
		}
		else { 
			System.out.println("El resultado de x es " + (-b + Math.sqrt(Math.pow(b, 2)- 4 * a * c))/(2*a) + " y " +(-b - Math.sqrt(Math.pow(b, 2)- 4 * a * c))/(2*a) );
		}
		sc.close();
	}

}
