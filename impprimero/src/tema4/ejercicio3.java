package tema4;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
	//	Escribe un programa en que dado un n�mero del 1 a 7 escriba el correspondiente nombre del d�a de la semana.
		System.out.println("Introduzca un n�mero");
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
			dianame = "Mi�rcoles";
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
		System.out.println("El d�a es " + dianame );
		sc.close();
	}

}
