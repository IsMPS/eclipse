package tema4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
//		System.out.println("Lunes\t\tBBDD
//		System.out.println("Martes\t\tSIST
//		System.out.println("Mi�rcoles\tFOL
//		System.out.println("Jueves\t\tBBDD\
//		System.out.println("Viernes\t\tPROG
		System.out.println("Introduzca seg�n el d�a de la semana en min�sculas y con tilde si es necesario");
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
		case "mi�rcoles" :
			asignatura = "FOL";
			break;
		case "jueves" :
			asignatura = "BBDD";
			break;
		case "viernes" :
			asignatura = "Programaci�n";
			break;
		default : 
			asignatura = "ERROR";
		}
		System.out.println("La asignatura del d�a " + dia + " es " + asignatura);
		sc.close();
	}

}
