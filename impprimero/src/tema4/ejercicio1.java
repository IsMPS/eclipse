package tema4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
//		System.out.println("Lunes\t\tBBDD
//		System.out.println("Martes\t\tSIST
//		System.out.println("Miércoles\tFOL
//		System.out.println("Jueves\t\tBBDD\
//		System.out.println("Viernes\t\tPROG
		System.out.println("Introduzca según el día de la semana en minúsculas y con tilde si es necesario");
		Scanner sc = new Scanner(System.in);
		String dia = sc.next();
		String asignatura;
		switch(dia) {
		case "lunes":
			asignatura = "BBDD";
			break;
		case "martes" :
			asignatura = "SIST";
			break;
		case "miércoles" :
			asignatura = "FOL";
			break;
		case "jueves" :
			asignatura = "BBDD";
			break;
		case "viernes" :
			asignatura = "Programación";
			break;
		default : 
			asignatura = "ERROR";
		}
		System.out.println("La asignatura del día " + dia + " es " + asignatura);
		sc.close();
	}

}
