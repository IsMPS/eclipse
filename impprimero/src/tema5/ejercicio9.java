package tema5;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
//		Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
//		por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
//		la salvedad de que el anterior estaba limitado a n�meros de 5 d�gitos como
//		m�ximo. En esta ocasi�n, hay que realizar el ejercicio utilizando bucles; de
//		esta manera, la �nica limitaci�n en el n�mero de d�gitos la establece el tipo de
//		dato que se utilice (int o long).
		Scanner sc = new Scanner (System.in);
		int i = 1;
		System.out.print("Introduce un n�mero para saber cuantos d�gitos tiene ");
		int num = sc.nextInt();
		while (i>0) {
			if (num>-(Math.pow(10, i)) && num<Math.pow(10, i)) {
				System.out.println("El n�mero tiene " + i + " cifra");
				i = -1;
				} else {
					i++;
				}
		}
//		while (num>=10) {
//			num= num/10;
//			i++;
//			}
//		System.out.println("El n�mero tiene " + i + " d�gitos.");
		sc.close();
	}
}
