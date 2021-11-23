package tema5;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
//		Realiza un programa que sume los 100 números siguientes a un número entero
//		y positivo introducido por teclado. Se debe comprobar que el dato introducido
//		es correcto (que es un número positivo).
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		int i = 1;
		int suma = 0;
		while (num<0) {
				System.out.println("Error, el número debe ser positivo");
		System.out.println("Introduce un número");
		num = sc.nextInt();

		
		if (num>=0) {
			while (i<=100) {
				suma += num;
				num++;
				i++;
			}
		}
	}
		System.out.println(suma);
		sc.close();
	}

}
