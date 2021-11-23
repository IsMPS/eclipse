package tema7;

import java.util.Scanner;

public class t7ejercicio5 {

	public static void main(String[] args) {
//		Escribe un programa que pida 10 números por teclado y que luego muestre los
//		números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//		máximo y del mínimo respectivamente.
//		1 2 3 4 5 6 7 8 9 10 
		Scanner sc = new Scanner (System.in);
		int num[] = new int [10];
		for (int i = 0; i<num.length; i++) {
		System.out.print("Introduce el número " + (i+1) + " = ");
		num[i] = Integer.parseInt(sc.nextLine());
		}
		int max = num[0];
		int min = num[0];
		for (int i = 0; i<num.length; i++) {
				if (num[i]>max) {
					max=num[i];
				}
				if (num[i]<min) {
					min=num[i];
				}
		}
		System.out.println("Número máximo " + max);
		System.out.println("Número mínimo " + min);
		sc.close();
	}

}
