package tema4;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
//		Calcula la nota de un trimestre de la asignatura Programaci�n. El programa
//		pedir� las dos notas que ha sacado el alumno en los dos primeros controles.
//		Si la media de los dos controles da un n�mero mayor o igual a 5, el alumno
//		est� aprobado y se mostrar� la media. En caso de que la media sea un n�mero
//		menor que 5, el alumno habr� tenido que hacer el examen de recuperaci�n que
//		se califica como apto o no apto, por tanto se debe preguntar al usuario �Cu�l
//		ha sido el resultado de la recuperaci�n? (apto/no apto). Si el resultado
//		de la recuperaci�n es apto, la nota ser� un 5; en caso contrario, se mantiene
//		la nota media anterior.
//		Ejemplo 1:
//		Nota del primer control: 7
//		Nota del segundo control: 10
//		Tu nota de Programaci�n es 8.5
//		Ejemplo 2:
//		Nota del primer control: 6
//		Nota del segundo control: 3
//		�Cu�l ha sido el resultado de la recuperaci�n? (apto/no apto): apto
//		Tu nota de Programaci�n es 5
//		Ejemplo 3:
//		Nota del primer control: 6
//		Nota del segundo control: 3
//		�Cu�l ha sido el resultado de la recuperaci�n? (apto/no apto): no apto
//		Tu nota de Programaci�n es 4.5
		Scanner sc = new Scanner (System.in);
		System.out.print("Nota del primer examen : ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota del segundo examen : ");
		double nota2 = sc.nextDouble();
		double media = (nota1+nota2)/2;
		if (media>=5) {
			System.out.println("Tu nota media es " + media);
		}
		else {
			System.out.print("�Cu�l ha sido el resultado de la recuperaci�n? (apto/no apto): ");
			String notar = sc.next();
			switch (notar) {
			case "apto" :
				System.out.println("apto");
				System.out.println("Tu nota es un " + 5);
				break;
			case "no apto" :
				System.out.println("no apto");
				System.out.println("Tu nota media es " + media);
				break;
			}
		}
		sc.close();
	}
}
