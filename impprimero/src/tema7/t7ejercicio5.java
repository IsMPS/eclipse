package tema7;

import java.util.Scanner;

public class t7ejercicio5 {

	public static void main(String[] args) {
//		Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
//		n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
//		m�ximo y del m�nimo respectivamente.
//		1 2 3 4 5 6 7 8 9 10 
		Scanner sc = new Scanner (System.in);
		int num[] = new int [10];
		for (int i = 0; i<num.length; i++) {
		System.out.print("Introduce el n�mero " + (i+1) + " = ");
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
		System.out.println("N�mero m�ximo " + max);
		System.out.println("N�mero m�nimo " + min);
		sc.close();
	}

}
