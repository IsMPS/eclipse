package tema5;

import java.util.Scanner;

public class ejercicio30 {

	public static void main(String[] args) {
//		Realiza una programa que calcule las horas transcurridas entre dos horas de
//		dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
//		El día de la semana se puede pedir como un número (del 1 al 7) o como una
//		cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
//		los datos correctamente y que el segundo día es posterior al primero.
		Scanner sc = new Scanner (System.in);
		String dia1;
		String dia2;
		int hora2;
		int dia = 0;
		int diaa = 0;
		int difhora;
		int hora1;
		boolean e = true;
		do {
			System.out.print("Introduzca la primera hora (entre 0 y 24): ");
			hora1 = sc.nextInt();
		} while (hora1<0 && hora1>24);
		do {
			System.out.print("Introduzca el primer día de la semana: ");
			dia1 = sc.next();
			switch (dia1) {
			case "lunes" :
			case "1":
				e = false;
				diaa = 1;
				break;
			case "martes" :
			case "2":
				e = false;
				diaa = 2;
				break;
			case "miercoles" :
			case "3":
				e = false;
				diaa = 3;
				break;
			case "jueves" :
			case "4":
				e = false;
				diaa = 4;
				break;
			case "viernes" :
			case "5":
				e = false;
				diaa = 5;
				break;
			case "sabado" :
			case "6":
				e = false;
				diaa = 6;
				e = true;	
				break;
			case "domingo" :
			case "7":
				e = false;
				diaa = 7;
				break;
			}
		} while (e);
		do {
			System.out.print("Introduzca la segunda hora(entre 0 y 24): ");
			hora2 = sc.nextInt();
		} while (hora2<0 && hora2>24);
		do {
			System.out.print("Introduzca el segundo día de la semana: ");
			dia2 = sc.next();
			e = true;
			switch (dia2) {
			case "lunes" :
			case "1":
				e = false;
				dia = 1;
				break;
			case "martes" :
			case "2":
				e = false;
				dia = 2;
				break;
			case "miercoles" :
			case "3":
				e = false;
				dia = 3;
				break;
			case "jueves" :
			case "4":
				e = false;
				dia = 4;
				break;
			case "viernes" :
			case "5":
				e = false;
				dia = 5;
				break;
			case "sabado" :
			case "6":
				e = false;
				dia = 6;
				e = true;	
				break;
			case "domingo" :
			case "7":
				e = false;
				dia = 7;
				break;
			}
		} while (e);
		int op = (dia-diaa)*24+hora2;
		difhora = op-hora1;
		System.out.println("Hay " + difhora + " horas entre " + hora1 + " del " + dia1 + " y " + hora2 + " del " + dia2);
		sc.close();
	}

}
