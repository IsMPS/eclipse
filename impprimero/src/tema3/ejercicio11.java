package tema3;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca los Kb");
		Scanner sc = new Scanner(System.in);
		double kb;
		kb = sc.nextDouble();
		System.out.println( kb + " Kb son " + kb * 0.001 + " Mb");
		sc.close();
	}

}
