package tema4;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
//		Realiza un programa que, dado un d�a de la semana (de lunes a viernes) y una
//		hora (horas y minutos), calcule cu�ntos minutos faltan para el fin de semana.
//		Se considerar� que el fin de semana comienza el viernes a las 15:00h. Se da
//		por hecho que el usuario introducir� un d�a y hora correctos, anterior al viernes
//		a las 15:00h.
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Introduzca el d�a ");
		 String dia = sc.next();
		 System.out.print("Introduzca la hora y despues los minutos ");
		 int hora = sc.nextInt();
		 int min = sc.nextInt();
		 int resultado = (hora*60+min);
		 int resultado2 = 0;
		 switch (dia) {
		 case "lunes":
			 resultado2 = 6660-resultado;
		 break;
		 case "martes":
			 resultado2 = 5220-resultado;
		 break;
		 case "mi�rcoles" :
			 resultado2 = 3780-resultado;
		 case "jueves":
			 resultado2 = 2340-resultado;
		 case "viernes" :
			 resultado2 = 900-resultado;
		 }
		 System.out.println("Quedan " + resultado2 + " minutos.");
		 sc.close();;
	}

}
