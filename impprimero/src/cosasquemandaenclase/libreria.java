package cosasquemandaenclase;

import java.util.Scanner;

public class libreria {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9}};
//		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
//		int array[]= {9,9,9};
//		int matrizc[][]={ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
//		int numfil[]= {1,3};
//		int numcol[]= {0,2};
//		int m1[][] = { { 1, 2, 3 }, { 4, 5, 6 }};
//		int m2[][] = { { 1, 2 }, { 4, 5}, { 7, 8 } };
//		int mm[][] = new int [m1.length][m2.length];
//		int submat[][]=new int [numfil.length][numcol.length];
//		int array[] = { 1, 2, 3 };
//		int fila[]=new int[matriz.length];
//		int columna[]=new int[matriz[0].length];
//		int arrayinversa[]=new int[array.length];
//		int diagonal[] = new int[3];
//		int datos[] = new int[5];
		biblio.imprimir(matriz);
//		diagonal = biblio.diagonal(matriz, true);
		System.out.println();
//		biblio.imprimir(diagonal);
//		System.out.println();
//		//IMPRIME ARRAY DATOS Y LE DA VALORES
//		datos=biblio.extraerEstadisticas(matriz);
//		System.out.println();
//		biblio.imprimir(datos);
//		//IMPRIME ARRAYINVERSA Y LE METE VALORES ANTES
//		arrayinversa=biblio.invertir(array);
//		System.out.println();
//		System.out.println();
//		biblio.imprimir(arrayinversa);
//		//FILA LE DA VALORES Y LA IMPRIME
//		System.out.println();
//		System.out.println();
//		fila=biblio.getFila(matriz, 1);
//		biblio.imprimir(fila);
//		System.out.println();
//		System.out.println();
//		//COLUMNA LE DA VALORES Y LA IMPRIME
//		columna=biblio.getColumna(matriz, 1);
//		biblio.imprimir(columna);
		//submatriz
//		biblio.imprimir(mat);
//		submat=biblio.submatriz(mat, numfil, numcol);
//		System.out.println();
//		biblio.imprimir(submat);
//		biblio.imprimir(m1);
//		System.out.println();
//		biblio.imprimir(m2);
//		System.out.println();
//		mm=biblio.multiplica(m1, m2);
//		biblio.imprimir(mm);
//		biblio.reemplazarFilaConArray(matriz, array, 2);
//		System.out.println("--------------------------------");
//		biblio.reemplazarColumnaConArray(matrizc, array, 1);
//		biblio.imprimir(matriz);
//		System.out.println("---------------");
		int determinante = biblio.determinantematriz(matriz);
		System.out.println(determinante);
//		for (int i = 0; i < matriz.length*matriz[0].length; i++) {			
//			System.out.print(matriz[i/matriz.length][i%matriz[0].length]+ " ");
//		}
		sc.close();
	}
}
