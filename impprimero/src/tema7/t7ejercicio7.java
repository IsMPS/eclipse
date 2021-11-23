package tema7;

import java.util.Scanner;

public class t7ejercicio7 {

	public static void main(String[] args) {
//		Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
//		muestre por pantalla separados por espacios. El programa pedirá entonces por
//		teclado dos valores y a continuación cambiará todas las ocurrencias del primer
//		valor por el segundo en la lista generada anteriormente. Los números que se
//		han cambiado deben aparecer entrecomillados.
		Scanner sc = new Scanner(System.in);
		int al[] = new int[100];
		for(int i = 0 ;i<100;i++) {
			al[i]=((int) (Math.random() * (20+1)));
				}
		imparray (al);
		System.out.println("\nIntroduce el primer número");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo número");
		int b = Integer.parseInt(sc.nextLine());
		b = b-1;
		a = a-1;
		int num = al[a];
		int num2 = al[b];
		al[a]= num2;
		al[b] = num;
		for(int i = 0 ;i<100;i++) {
			if (i==a || i==b) {
				System.out.print("'" + al[i] + "' ");
			} else {
				System.out.print(al[i] + " ");
			}
		}
		sc.close();
		}
	static void imparray(int[] array) {
		for(int i = 0 ;i<100;i++) {
			System.out.print(array[i] + " ");
		}
	}
}
