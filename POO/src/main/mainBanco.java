package main;

import java.util.Scanner;

import models.Banco;

public class mainBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean prog = true;
		boolean dentro = false;
		boolean block = false;
		
		Banco miCuenta = new Banco("Paco", "77077089J", 3776432, 1234);
		do {
			System.out.println("Introduce tu PIN");
			int pinin = Integer.parseInt(sc.nextLine());
			miCuenta.entrar(pinin);
			dentro = miCuenta.isDentro();
			block = miCuenta.isBlock();
		} while (!dentro || block);
		do {
			System.out.println("\tMenú");
			System.out.println("1. Meter\n2. Sacar \n3. Transferencia\n4. Mostrar cuenta\n5. Salir");
			int decision = Integer.parseInt(sc.nextLine());
			double cantidad;
			switch (decision) {
			case 1:
				do {
					System.out.println("\nIntroduce la cantidad deseada");
					cantidad = Integer.parseInt(sc.nextLine());
				} while (cantidad <= 0);
				miCuenta.meter(cantidad);
				break;
			case 2:
				do {
					System.out.print("\nIntroduce la cantidad deseada");
					cantidad = Integer.parseInt(sc.nextLine());
				} while (cantidad <= 0);
				miCuenta.sacar(cantidad);
				break;
			case 3:
				System.out.println("\nEn verdad no se hacer transferencias ¯\\_(ツ)_/¯\n");
//				miCuenta.transferencia(decision, decision, decision);
				break;
			case 4:
				System.out.println(miCuenta);
				break;
			case 5:
				prog = false;
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Introduce el numero correcto.\n");
				break;
			}
		} while (prog);
		sc.close();
	}
}
