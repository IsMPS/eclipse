package tema4;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
//		La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
//		máxima calidad y nos ha pedido hacer un configurador que calcule el precio
//		según el alto y el ancho. El precio base de una bandera es de un céntimo de
//		euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
//		se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
//		son 3.25 €. El IVA ya está incluido en todas las tarifas
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca la altura en cm : ");
		double h = sc.nextDouble();
		System.out.print("Introduzca el ancho en cm : ");
		double l = sc.nextDouble();
		System.out.println("¿Quiere escudo bordado? (s/n) : ");
		String escudo = sc.next();
		double precio = h * l * 0.01;
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de " + (h*l) + " cm2: " + precio  + " €");
		switch (escudo) {
		case "s" :
			precio = precio + 2.5;
			System.out.println("Con bandera : 2,50 €");
			break;
		case "n" :
			System.out.println("Sin bandera : 0,00 €");
			break;
		}
		System.out.println("Gastos de envío : 3,25 €");
		System.out.println("Total : " + precio);


		sc.close();
	}

}
