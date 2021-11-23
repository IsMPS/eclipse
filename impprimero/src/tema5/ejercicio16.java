package tema5;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
//		Escribe un programa que diga si un número introducido por teclado es o no
//		primo. Un número primo es aquel que sólo es divisible entre él mismo y la
//		unidad.
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número ");
		int num = sc.nextInt();
		int i = 1;
		int resultado = 0;
		while (num>=i) {
			resultado = num%i;	
			if (num!=i && resultado==0 && i!=1 && num!=1) {
				System.out.println("No es primo.");
				num=0;
			} else {
				i++;
			}
		}	
		if(num!=0)
		System.out.println("Es primo");
		sc.close();
	}

}
