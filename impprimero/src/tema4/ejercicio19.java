package tema4;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
//		Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero entero que
//		puede ser positivo o negativo. Se permiten n�meros de hasta 5 d�gitos.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un n�mero de m�ximo 5 cifras");
		int num = sc.nextInt();
		if (num>-10 && num<10) {
			System.out.println("El n�mero tiene 1 cifra");
		}
		if (num>-100 && num<-9 || num<100 && num>9) {
			System.out.println("El n�mero tiene 2 cifras");
		}
		if (num<1000 && num>99 || num<-1000 && num>-99) {
			System.out.println("Tiene 3 cifras");
		}
		if (num<10000 && num>999 || num<-10000 && num>-999) {
			System.out.println("Tiene 4 cifras");
		}

		if (num<100000 && num>9999 || num<-100000 && num>-9999) {
			System.out.println("Tiene 5 cifras");
		}
		else {
			System.out.println("Te he disho que hasta 5 cifra >:(");
		}
		sc.close();
	}

}
