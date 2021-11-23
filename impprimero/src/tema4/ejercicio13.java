package tema4;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// Escribe un programa que ordene tres números enteros introducidos por teclado.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tres números enteros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>b && b>c) {
			System.out.println("El orden es " + a + ", " + b + ", " + c);
		}
		if (b>a && a>c) { 
			System.out.println("El orden es " + b + ", " + a + ", " + c);
		}
		if (c>a && a>b) { 
			System.out.println("El orden es " + c + ", " + a + ", " + b);
		}
		if (b>c && c>a) { 
			System.out.println("El orden es " + b + ", " + c + ", " + a);
		}
		if (a>c && c>b) { 
			System.out.println("El orden es " + a + ", " + c + ", " + b);
		}
		if (c>b && b>a) { 
			System.out.println("El orden es " + c + ", " + b + ", " + a);
		}
		sc.close();
		}
}
