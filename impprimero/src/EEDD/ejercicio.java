package EEDD;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, vaya introduciendo números y pulsando INTRO");
		System.out.println("Para terminar, introduzca un número negativo.");
		int numintroducido = 0;
		int cuentanumeros=0;
		int suma = 0;
		while (numintroducido>=0) {
			numintroducido = sc.nextInt();
			cuentanumeros++;
			suma +=numintroducido;
		}
		System.out.println("Has introducido " + (cuentanumeros-1) + " números positivos.");
		System.out.println("La suma total de ellos es " + (suma-numintroducido));
		sc.close();

	}

}
