package tema5;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i = 4;
		while (i>0) {
			System.out.print("Introduce la contrase�a ");
			int clave = sc.nextInt();
			if (clave==1234) {
			System.out.println("Ha abierto la caja fuerte satisfactoriamente");
			i=i-4;
			} else {
			i--;
			System.out.println("Contrase�a incorrecta. N� de intentos restantes " + i);
			}
		}
		sc.close();
	}

}
