package tema4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
//		Realiza un programa que pida una hora por teclado y que muestre luego buenos
//		días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
//		6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
//		horas, los minutos no se deben introducir por teclado.
		System.out.println("Introduzca la hora sin los minutos");
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();
		if ((hora <= 12) && (hora >= 6)) {
			System.out.println("Buenos días");
		}
		if ((hora <= 20) && (hora >= 13)) {
			System.out.println("Buenas tardes");
		}
		if ((hora <= 24) && (hora >= 21) || (hora > 0) && (hora<=5)) {
			System.out.println("Buenas noches");
		}
		sc.close();
	}

}
