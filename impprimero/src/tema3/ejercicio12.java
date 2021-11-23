package tema3;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
//		Realiza un programa que calcule la nota que hace falta sacar en el segundo
//		examen de la asignatura Programación para obtener la media deseada. Hay
//		que tener en cuenta que la nota del primer examen cuenta el 40% y la del
//		segundo examen un 60%.
//		Ejemplo 1:
//		Introduce la nota del primer examen: 7
//		¿Qué nota quieres sacar en el trimestre? 8.5
//		Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
//		Ejemplo 2:
//		Introduce la nota del primer examen: 8
//		¿Qué nota quieres sacar en el trimestre? 7
//		Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
		
		System.out.println("Introduzca la nota del primer examen");
		Scanner sc = new Scanner(System.in);
		double nota1;
		double notaTrim;
		nota1 = sc.nextDouble();
		System.out.println("Introduzca la deseada en el trimestre");
		notaTrim = sc.nextDouble();
		System.out.println(notaTrim *  - nota1);
		// nota1  + nota2 = notaTrim * 3 /1.2 - nota1
		sc.close();
	}

}
