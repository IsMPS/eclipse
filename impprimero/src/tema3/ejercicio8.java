package tema3;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el salario semanal de un empleado en base a
//		las horas trabajadas, a razón de 12 euros la hora.
		System.out.println("Introduzca las horas trabajadas ");
		Scanner sc = new Scanner(System.in);
		double horas ;
		horas = sc.nextDouble();
		System.out.println("El salario es de "+(horas*12)+" euros por " + horas + " horas trabajadas");
		sc.close();
	}

}
