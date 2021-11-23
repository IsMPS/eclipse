package tema4;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
	//	Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
		System.out.println("Introduzca un número");
		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();
		String dianame;
		switch(dia) {
		case 1 :
			dianame = "Lunes";
			break;
		case 2 :
			dianame = "Martes";
			break;
		case 3 :
			dianame = "Miércoles";
			break;
		case 4 :
			dianame = "Jueves";
		case 5 :
			dianame = "Viernes";
			break;
		case 6 :
			dianame = "Sabado";
			break;
		case 7 :
			dianame = "Domingo";
			break;
		default : 
			dianame = "ERROR";
		}
		System.out.println("El día es " + dianame );
		sc.close();
	}

}
