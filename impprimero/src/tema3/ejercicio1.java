package tema3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
//		Realiza un programa que pida dos n�meros y que luego muestre el resultado
//		de su multiplicaci�n.
		System.out.println("Introduce dos n�meros:");
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("El resultado de la multiplicaci�n es " + (num1*num2));
		sc.close();
	}

}
