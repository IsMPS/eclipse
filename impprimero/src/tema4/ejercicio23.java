package tema4;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el precio final de un producto según su
//		base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
//		reducido o superreducido) y el código promocional. Los tipos de IVA general,
//		reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
//		promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
//		respectivamente que no se aplica promoción, el precio se reduce a la mitad,
//		se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
//		muestran los valores correctos, aunque los números no estén tabulados.
//		Ejemplo:
//		Introduzca la base imponible: 25
//		Introduzca el tipo de IVA (general, reducido o superreducido): reducido
//		Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
//		Base imponible 25.00
//		IVA (10%) 2.50
//		Precio con IVA 27.50
//		Cód. promo. (mitad): -13.75
//		TOTAL 13.75
		Scanner sc = new Scanner (System.in);
		double precio = 0;
		System.out.print("Introduzca el precio del producto : ");
		double preciooriginal = sc.nextDouble();
		System.out.print("Introduzca tipo de IVA : (general/reducido(superreducido) ");
		String iva = sc.next();
		System.out.print("Introduzca código de descuento : ");
		String codigo = sc.next();
		System.out.println("Base imponible : " + preciooriginal);
		switch (iva) {
		case "general" :
			precio = preciooriginal*0.21;
			System.out.println("IVA (21%) : " + (precio));
			break;
		case "reducido" :
			precio = preciooriginal*0.1;
			System.out.println("IVA (10%) : " + (precio));
			break;
		case "superreducido" :
			precio = preciooriginal*0.04;
			System.out.println("IVA (4%) : " + (precio));
			break;
		}
		double precio1 = 0;
		switch (codigo) {
		case "mitad" :
			precio1=(preciooriginal+precio)/2;
			System.out.println("Cód. promo. (mitad) : " + -precio1);
		break;
		case "meno5" :
			precio1=precio+preciooriginal-5;
			System.out.println("Cód. promo. (meno5) : " + -5);
		break;
		case "5porc" :
			precio1=(precio+preciooriginal)*0.05;
		System.out.println("Cód. promo. (5porc) : " + -precio1);
		break;
		}
		System.out.println("Total : " + (preciooriginal+precio-precio1));
		sc.close();
	}

}
