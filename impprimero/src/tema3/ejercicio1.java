package tema3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
//		Realiza un programa que pida dos números y que luego muestre el resultado
//		de su multiplicación.
		System.out.println("Introduce dos números:");
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("El resultado de la multiplicación es " + (num1*num2));
		sc.close();
	}

}
