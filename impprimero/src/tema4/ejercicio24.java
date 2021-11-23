package tema4;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
//		Escribe un programa que genere la nómina (bien desglosada) de un empleado
//		según las siguientes condiciones:
//		• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
//		de proyecto), los días que ha estado de viaje visitando clientes durante el
//		mes y su estado civil (1 - Soltero, 2 - Casado).
//		• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
//		si se trata de un prog. junior, un prog. senior o un jefe de proyecto
//		respectivamente.
//		• Por cada día de viaje visitando clientes se pagan 30 euros extra en
//		concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
//		un 25% en caso de estar soltero y un 20% en caso de estar casado.
//		Ejemplo:
//		1 - Programador junior
//		2 - Prog. senior
//		3 - Jefe de proyecto
//		Introduzca el cargo del empleado (1 - 3): 2
//		¿Cuántos días ha estado de viaje visitando clientes? 5
//		Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
		Scanner sc = new Scanner (System.in);
		double sueldo1 = 0;
		double irpf = 0;
		System.out.println("1 - Programador junior\n2 - Prog. senior\n3 - Jefe de proyecto");
		System.out.print("Introduzca el cargo del empleado (1 - 3) : ");
		int cargo = sc.nextInt();
		System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
		double dia = sc.nextDouble();
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado) : ");
		int estado = sc.nextInt();
		switch (cargo) {
		case 1 : 
			sueldo1=950;
			break;
		case 2 : 
			sueldo1 = 1200;
			break;
		case 3 :
			sueldo1 = 1600;
			break;
		}
		switch (estado) {
		case 1 : 
			irpf = 25;
			break;
		case 2 : 
			irpf = 20;
			break;
		}

		System.out.println("-------------------------------------------------");
		System.out.println("|	Sueldo base			" + sueldo1 + "	|");
		System.out.println("|	Dietas	(" + dia + " viajes)		" + (dia*30) + "	|");
		System.out.println("|-----------------------------------------------|");
		System.out.println("|	Sueldo bruto			" + (sueldo1+dia*30) +"	|");
		System.out.println("|	Retención IRPF	(" + irpf + "%)		" + ((sueldo1+dia*30)*irpf/100) + "	|");
		System.out.println("|-----------------------------------------------|");
		System.out.println("|	Sueldo neto			" + ((sueldo1+dia*30)-(sueldo1+dia*30)*irpf/100) + "	|");
		System.out.println("-------------------------------------------------");
		sc.close();
	}

}
