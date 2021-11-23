package tema7;

import java.util.Scanner;

public class t7ejercicio15 {

	public static void main(String[] args) {
//		En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
//		(mesa llena). 
//		Cuando llega un cliente se le pregunta cuántos son. 
//		“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo”. 
//		primera vez mesa libre (con 0 personas). Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
//		dos personas, se podrá colocar donde haya una o dos personas. 
//		Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. 
//		Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
//		Los grupos no se pueden romper aunque haya huecos sueltos suficientes.
//		┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//		│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
//		├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//		│Ocupación│ 3  │ 2  │ 0  │ 2  │ 4  │ 1  │ 0  │ 2  │ 1  │ 1  │
//		└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
//		¿Cuántos son? (Introduzca -1 para salir del programa): 2
//		Por favor, siéntense en la mesa número 3.
//		┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
//		│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │
//		├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
//		│Ocupación│ 3  │ 2  │ 2  │ 2  │ 4  │ 1  │ 0  │ 2  │ 1  │ 1  │
//		└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
		Scanner sc = new Scanner (System.in);
		int mesa[] = new int[10];
		for (int i = 0; i<mesa.length ; i++) {
			mesa[i]=i+1;
		}
		int ocupacion[] = new int[10];
		for (int i = 0; i<ocupacion.length ; i++) {
			ocupacion[i]=0;
		}
		int personas = 0;
		do {
		System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
		System.out.print("|Mesa nº\t|\t");
		imparray(mesa);
		System.out.println("\n├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
		System.out.print("|Ocupación\t|\t");
		imparray(ocupacion);
		System.out.println("\n└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
		System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
		personas = Integer.parseInt(sc.nextLine());
		if (personas<5) {
		for (int i = 0; i<ocupacion.length ; i++) {
			 if (ocupacion[i]==0) {
				ocupacion[i] = personas;
				break;
					} 
			 else if ((ocupacion[i]+personas)<4) {
				ocupacion[i]= ocupacion[i]+personas;
				break;
					}
		}
		} else {
			System.out.println("Número máximo 4.");
		}
		} while(personas>=0);
		sc.close();
	}
	static void imparray(int[] array) {
		for (int i = 0;i<array.length;i++) {
			System.out.print(array[i] + "\t|\t");
		}
	}
}
