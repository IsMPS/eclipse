package tema4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
//		 Escribe un programa que calcule el salario semanal de un  && || 
//		trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
//		trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
//		la hora.
//		Ejemplo 1:
//		Por favor, introduzca el número de horas trabajadas durante la semana: 36
//		El sueldo semanal que le corresponde es de 432 euros
//		Ejemplo 2:
//		Por favor, introduzca el número de horas trabajadas durante la semana: 40
//		El sueldo semanal que le corresponde es de 480 euros
//		Ejemplo 3:
//		Por favor, introduzca el número de horas trabajadas durante la semana: 55
//		El sueldo semanal que le corresponde es de 720 euros
		System.out.println("Introduzca el número de horas trabajadas durante la semana");
		Scanner sc = new Scanner (System.in);
		double horas = sc.nextDouble();
		
		double sueldo ;
		if (horas<=40 ) {
		sueldo = horas*12.0;
		}
		else {
		sueldo = 40.0 * 12.0 + (horas-40) * 16;
		}
			System.out.println("El sueldo semanal es de " + sueldo);
		sc.close();
	}

}
