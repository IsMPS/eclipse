import java.util.Scanner;

public class ejercicio021121DOS {

	public static void main(String[] args) {
//		2. Dada una matriz cuadrada, extrae las dos diagonales de la matriz, guárdalas en 2 dos arrays y muestralos por pantalla (3.5 ptos)
		Scanner sc = new Scanner(System.in);
		int num=0;
		int x = 0;
		
		do {
			System.out.println("Dimension para una matriz cuadrada");
			x = Integer.parseInt(sc.nextLine());
		} while (x<1);
		int matriz[][] = new int [x][x];
		int diag1[][] = new int [x][x];
		int diag2[][] = new int [x][x];
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<x;a++) {
				num++;
				matriz[i][a] = num;	
				diag1[i][a]=0;
				diag2[i][a]=0;
				System.out.print(matriz[i][a] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		int o=x;
		for(int a=0;a<x;a++) {	
			o--;
			System.out.print(matriz[a][o] + " ");
			diag1[a][o]=matriz[a][o];
		}
		System.out.println();
//		int j = x;
//		for (int a = 0 ; a<y;a++) {
//			if(j>=x) {
//				j=0;
//			}
//			diag2[j][a]=matriz[j][a];
//			j++;
//		}
		for(int a=0;a<x;a++) {	
			System.out.print(matriz[a][a] + " ");
			diag2[a][a]=matriz[a][a];
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<x;a++) {
				System.out.print(diag1[i][a] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<x;a++) {
				System.out.print(diag2[i][a] + "\t");
			}
			System.out.println();
		}
				sc.close();
	}

}
