package tema4;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Turno del jugador 1 (piedra/papel/tijeras): ");
		String jug1 = sc.next();
		System.out.print("Turno del jugador 2 (piedra/papel/tijeras): ");
		String jug2 = sc.next();
		switch (jug1) {
		case "piedra" :
			switch (jug2) {
			case "piedra" :
				System.out.println("Empate");
				break;
			case "papel" :
				System.out.println("Ha ganado el jugador 2");
			break;
			case "tijeras" :
				System.out.println("Ha ganado el jugador 1");
			break;
			}
			break;
		case "papel" :
			switch (jug2) {
			case "piedra" :
					System.out.println("Ha ganado el jugador 1");
			break;
			case "papel" :
					System.out.println("Empate");
			break;
			case "tijeras" :
					System.out.println("Ha ganado el jugador 2");
			break;
			 }
			break;
		case "tijeras" :
			switch (jug2) {
				case "piedra" :
						System.out.println("Ha ganado el jugador 2");
				break;
				case "papel" :
						System.out.println("Ha ganado el jugador 1");
				break;
				case "tijeras" :
						System.out.println("Empate");
				break;
			}
			break;
		}
		sc.close();
	}

}
