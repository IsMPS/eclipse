package tema4;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("¿Que ha tomado de comer? (Donut/Palmera/Pitufo) ");
		String comida = sc.next();
		double precio = 0;
		double precio2 = 0;
		switch (comida) {
		case "Donut" :
			precio = 1;
			break;
		case "Palmera" :
			precio = 1.40;
			break;
		case "Pitufo":
			System.out.print("¿Con tortilla o con aceite? (Tortilla/Aceite) ");
			String pitufo = sc.next();
			switch (pitufo) {
			case "Tortilla" :
				comida = "Pitufo con tortilla";
				precio = 1.60;
				break;
			case "Aceite" :
				comida = "Pitufo con aceite";
				precio = 1.40;
				break;
			}
			break;
		}
		System.out.print("¿Que ha tomado de beber? (Cafe/Zumo) ");
		String bebida = sc.next();
		switch (bebida) {
		case "Cafe" :
			precio2 = 1.20;
			break;
		case "Zumo" :
			precio2 = 1.50;
			break;
		}
		System.out.println(comida + "			" + precio + " €");
		System.out.println(bebida + "			" + precio2 + " €");
		System.out.println("Total			" + (precio+precio2) + " €");
		sc.close();
	}

}
