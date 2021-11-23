import java.util.Scanner;

public class matrizespejo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int x = 0;
		int y = 0;
		do {
			System.out.println("Dimensiones");
			x = Integer.parseInt(sc.nextLine());
			y = Integer.parseInt(sc.nextLine());
		} while (x<1 || y<1);
		int espejo[][] = new int [x][y];
		int matriz[][] = new int [x][y];
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<y;a++) {
				num++;
				matriz[i][a] = num;	
				System.out.print(matriz[i][a] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n-----------------------------------");
		for (int i = 0 ; i<x;i++) {
			int j = x;
			for (int a = 0 ; a<y;a++) {
				j--;	
				espejo[i][j]=matriz[i][a];
			}
		}
		for (int i = 0 ; i<x;i++) {
			for (int a = 0 ; a<y;a++) {
				System.out.print(espejo[i][a] + "\t");
			}
			System.out.println();
		}
				sc.close();

	}

}
