package tema3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
//		Escribe un programa que sume, reste, multiplique y divida dos números
//		introducidos por teclado.
		System.out.println("Introduce dos números:");
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Su suma es " + (num1+num2));
		System.out.println("Su resta es " + (num1-num2));
		System.out.println("Su división es " + (num1/num2));
		System.out.println("El resultado de la multiplicación es " + (num1*num2));
		sc.close();

	}

}
