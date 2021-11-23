package tema7;

import java.util.Scanner;

public class t7ejercicio3 {

	public static void main(String[] args) {
//		Escribe un programa que lea 10 números por teclado y que luego los muestre
//		en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//		y viceversa.
		Scanner sc = new Scanner (System.in);
		int num[] = new int [10];
		for (int i = 0; i<num.length; i++) {
		System.out.print("Introduce el número " + (i+1) + " = ");
		num[i] = Integer.parseInt(sc.nextLine());
		}
		for (int i=9; i>=0; i--) {
			System.out.println(num[i]);
			}
		sc.close();
	}

}
