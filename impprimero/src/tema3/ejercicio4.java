package tema3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
//		Escribe un programa que sume, reste, multiplique y divida dos n�meros
//		introducidos por teclado.
		System.out.println("Introduce dos n�meros:");
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Su suma es " + (num1+num2));
		System.out.println("Su resta es " + (num1-num2));
		System.out.println("Su divisi�n es " + (num1/num2));
		System.out.println("El resultado de la multiplicaci�n es " + (num1*num2));
		sc.close();

	}

}
