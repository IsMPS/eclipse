package tema3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
//		Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
//		convertir debe ser introducida por teclado.
		System.out.println("Introduce la cantidad de euros para pasar a pesetas ");
		Scanner sc = new Scanner(System.in);
		double euros;
		euros = sc.nextDouble();
		double difpesetas = 166.386;
		
		System.out.println(euros + " euros son " + (euros*difpesetas) + " pesetas");
		sc.close();
	}

}
