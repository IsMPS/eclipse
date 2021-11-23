package mainapp;

import java.util.ArrayList;
import java.util.Scanner;

import models.Persona;
import models.CuentaCorriente;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean programa = true;
		String nombreelegido = null;
		int i = 1;

		ArrayList<Persona> personas = new ArrayList<Persona>();
		ArrayList<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
		System.out.println("Bienvenido a la App del banco Soles\n");

		do {
			System.out.println(
					"¿Qué quieres hacer?\n\na. Añadir persona\nb. Elegir persona\nc. Borrar persona\nd. Salir");
			System.out.println();
			String decision = sc.nextLine();
			System.out.println();
			
			switch (decision) {
			case "a":
				System.out.print("Introduzca su nombre: ");
				String nombre = sc.nextLine();
				System.out.print("Introduzca sus apellidos: ");
				String apellidos = sc.nextLine();
				System.out.print("Introduzca su DNI: ");
				String dni = sc.nextLine();
				System.out.println();

				Persona persona = new Persona(nombre, apellidos, dni, 0, null);
				CuentaCorriente cuenta = new CuentaCorriente(i, 0, dni);

				personas.add(persona);
				cuentas.add(cuenta);

				persona.setCuentacorriente(cuenta);
				cuenta.setTitular(persona.getNombre());

				i++;
				break;
			case "b":
				if (cuentas.size()>0) {
					int x = 1;
					for (Persona c : personas) {
						System.out.println(x + ". " + c.getDni() + " " + c.getNombre());
						x++;
					}
					int posicion;
					do {
						System.out.println();
						System.out.print("Introduzca el número deseado: ");
						posicion = Integer.parseInt(sc.nextLine());
					} while (posicion < 1 || posicion > cuentas.size());
					int cont = 1;
					for (CuentaCorriente c : cuentas) {
						if (cont == posicion) {
							nombreelegido = c.getTitular();						
						}
						cont++;
					}

					System.out.println(
							"i. Cobrar sueldo\nii. Sacar pasta\niii. Subir sueldo\niv. Mostrar detalles de la persona");
					String decisionb = sc.nextLine();
					System.out.println();
					
					switch (decisionb) {
					case "i":
						for (Persona c : personas) {
							if (c.getNombre().equals(nombreelegido)) {
								c.cobrarSueldo();
								break;
							}
						}
						break;
					case "ii":
						for (Persona c : personas) {
							if (c.getNombre().equals(nombreelegido)) {
								System.out.print("Introduzca la cantidad que deseas sacar: ");
								int cantidad = Integer.parseInt(sc.nextLine());
								if (c.getSueldo() >= cantidad) {
									c.sacarPasta(cantidad);
									break;
								}
							}
						}
						break;
					case "iii":
						for (Persona c : personas) {
							if (c.getNombre().equals(nombreelegido)) {
								System.out.println("Inserte el nuevo de sueldo: ");
								int sueldo = Integer.parseInt(sc.nextLine());
								c.subirSueldo(sueldo);
								break;
							}
						}
						break;
					case "iv":
						for (Persona c : personas) {
							if (c.getNombre().equals(nombreelegido)) {
								System.out.println(c);
								System.out.println();
								break;
							}
						}
						break;
					default:
						System.out.println("tas confudio");
						break;
					}
				} else {
					System.out.println("No hay cuentas deberías crear una antes.");
					System.out.println();
				}
				break;
			case "c":
				if (cuentas.size()>0) {
					int x = 1;
					int posicion;
					for (Persona c : personas) {
						System.out.println(x + ". " + c.getDni() + " " + c.getNombre());
						x++;
					}
					do {
						System.out.println();
						System.out.print("Introduzca el número deseado: ");
						System.out.println();
						posicion = Integer.parseInt(sc.nextLine());
					} while (posicion < 1 || posicion > cuentas.size());
					cuentas.remove(posicion - 1);
					personas.remove(posicion - 1);
				}
				break;
			case "d":
				programa = false;
				break;
			default:
				System.out.println("tas confudio");
				System.out.println();
				break;
			}

		} while (programa);
		System.out.println("bonito mensaje");
		sc.close();
	}

}
