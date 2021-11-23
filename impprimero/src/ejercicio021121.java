import java.util.Scanner;

public class ejercicio021121 {

	public static void main(String[] args) {
//		1. Dada una matriz cualquiera, calcula el número de ocurrencias que hay de un determinado valor. (2 ptos)

		Scanner sc = new Scanner(System.in);
		int num=0;
		int cont=0;
		int x = 0;
		int y = 0;
		do {
			System.out.println("Dimensiones");
			x = Integer.parseInt(sc.nextLine());
			y = Integer.parseInt(sc.nextLine());
		} while (x<1 || y<1);
		System.out.println("Que número quieres buscar?");
		int pregnum = Integer.parseInt(sc.nextLine());
		int matriz[][] = new int [x][y];
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<y;a++) {
				num++;
				matriz[i][a] = num;	
				System.out.print(matriz[i][a] + "\t");
				if(matriz[i][a]==pregnum) {
					cont++;
				}
			}
			System.out.println();
		}
		System.out.println("Veces del número indicado en la matriz: " + cont);
				sc.close();
	}

}
