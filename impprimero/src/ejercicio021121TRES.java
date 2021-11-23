import java.util.Scanner;

public class ejercicio021121TRES {

	public static void main(String[] args) {
//		3. Dada una matriz con más de 2 filas y más de 2 columnas, se pide sacar el borde de la matriz como un array. 
//		Se debe partir desde la esquina superior derecha
		Scanner sc = new Scanner(System.in);
		int num=0;
		int x = 0;
		int y = 0;
		do {
		System.out.println("Dimensiones");
		x = Integer.parseInt(sc.nextLine());
		y = Integer.parseInt(sc.nextLine());
		} while (x<3 || y<3);
		int matriz[][] = new int [x][y];
		int contorno[][] = new int [x][y];
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<y;a++) {
				num++;
				matriz[i][a] = num;	
				contorno[i][a]=0;
				System.out.print(matriz[i][a] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n-----------------------------------");
//		5 1 - 5 2 - 5 3 - 5 4 - 5 5 -- 4 5 - 3 5 - 2 5 - 1 5 -- 1 4 - 1 3 - 1 2 - 1 1.
		for (int i = 0 ; i<x-1;i++) {
			System.out.print(matriz[i][x-1]+" ");
			contorno[i][x-1]=matriz[i][x-1];
		}
		for (int i = x-1;i>0;i--) {
			System.out.print(matriz[x-1][i]+" ");
			contorno[x-1][i]=matriz[x-1][i];
		}
		for (int i = x-1;i>0;i--) {
			System.out.print(matriz[i][0]+" ");
			contorno[i][0]=matriz[i][0];
		}
		for (int i = 0;i<x;i++) {
			System.out.print(matriz[0][i]+" ");
			contorno[0][i]=matriz[0][i];
		}
		System.out.println("\n-----------------------------------");
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<y;a++) {
				System.out.print(contorno[i][a] + "\t");
			}
			System.out.println();
		}
				sc.close();
	}

}
