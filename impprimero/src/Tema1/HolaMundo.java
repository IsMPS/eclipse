package Tema1;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.print("Hola, dime tu nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
				
				System.out.println("Bienvenido " + nombre);
			
				sc.close();
	}

}
