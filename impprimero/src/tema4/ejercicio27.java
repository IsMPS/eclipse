package tema4;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("¿De que sabor quiere la tarta? (manzana/fresa/chocolate) ");
		String sabor = sc.next();
		double precio = 0;
		switch (sabor) {
		case "manzana" :
			precio = 18;
			break;
		case "fresa":
			precio = 16;			
			break;
		case "chocolate":
			System.out.print("¿De chocolate blanco o negro? (negro/blanco) ");
			String choco = sc.next();
			switch (choco) {
			case "negro":
				precio = 14;
				break;
			case "blanco":
				precio = 15;
				break;
			}
			break;
		}
		System.out.print("¿Quieres nata? (true/false) ");
		boolean nata = sc.nextBoolean();
		System.out.print("¿Quieres que se personalice poniendo su nombre? (true/false) ");
		boolean nombre = sc.nextBoolean();
		System.out.println("Tarta de "+ sabor + "	" + precio + " €");
		if (nata) {
			precio = precio + 2.50;
			System.out.println("Con nata			 2.50 €");
		} else { 
			System.out.println("Sin nata			 0.00 €");
		}
		if (nombre) {
			precio = precio + 2.75;
			System.out.println("Con nombre			 2.75 €");
		} else {
			System.out.println("Sin nombre			 0.00 €");
		}
		System.out.println("Total				" + precio + " €");
		sc.close();
	}

}
