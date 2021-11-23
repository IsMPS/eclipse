package tema4;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
//		Realiza un programa que calcule el precio de unas entradas de cine en función
//		del número de personas y del día de la semana. El precio base de una entrada
//		son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
//		jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
//		Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
//		grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
//		que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
//		1 individual que son 41 euros (33 + 8).
		Scanner sc = new Scanner (System.in);
		System.out.print("Número de personas : ");
		int personas = sc.nextInt();
		System.out.print("Día de la semana : ");
		String dia = sc.next();
		double precio = 8*personas;
		System.out.print("Tiene tarjeta CineCampa : (true/false) ");
		boolean tarj = sc.nextBoolean();
		switch (dia) {
		case "miércoles":
			 precio = 5*personas;
			 System.out.println("Entradas individuales : " + personas + " €");
			break;
		case "jueves" :
			if ((personas%2)==0 && personas>1) {
				precio = 11.0/2*personas;
				System.out.println("Entradas de pareja : " + personas/2);
				System.out.println("Precio " + (precio*(personas-1)/2) + " €");
			} else {
				if (personas>1) {
					precio = 11.0/2*(personas-1)+8;
					System.out.println("Entradas de pareja :		" + (personas-1)/2);
					System.out.println("Precio		" + (precio*(personas-1)/2) + " €");
					System.out.println("Entradas indivivuales		: " + 1);
					System.out.println("Precio		" + 8 + " €");
				}
			}
			break;
			}
		double descuento = 0;
		if (tarj) {
		descuento =  precio*0.1;
			System.out.println("Descuento		" + descuento + " €");
		} else {
			System.out.println("Descuento		0.00 €");
		}
		System.out.println("Total :		" + (precio-descuento));
		sc.close();
	}

}
