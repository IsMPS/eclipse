package tema7;

import java.util.Scanner;

public class t7ejercicio6 {

	public static void main(String[] args) {
//		Escribe un programa que lea 15 n�meros por teclado y que los almacene en un
//		array. Rota los elementos de ese array, es decir, el elemento de la posici�n 0
//		debe pasar a la posici�n 1, el de la 1 a la 2, etc. El n�mero que se encuentra en
//		la �ltima posici�n debe pasar a la posici�n 0. Finalmente, muestra el contenido
//		del array.
		Scanner sc = new Scanner (System.in);
		int num[] = new int [15];
		int cambio[] = new int [16];
		for (int i = 0;i<num.length;i++) {
		System.out.print("Introduce el n�mero " + (i+1) + ": ");
		num[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0;i<num.length;i++) {
				cambio[i+1]=num[i];
				cambio[0]=num[14];
			System.out.println("N�mero " + (i+1) + " es " + cambio[i]);
		}
		sc.close();
	}

}
