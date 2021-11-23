
public class MayeIsabel_PROG_UD4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int mat3[][] = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		int mat[][] = { { 1, 5, 2, 3 }, { 2, 1, 6, 4 }, { 3, 4, 7, 1 }, { 2, 1, 6, 5 }, { 2, 1, 6, 5 } };

		int arrayasc[] = { 1, 2, 3, 4, 5 };
		boolean orden = isSorted(arrayasc);
		System.out.println(orden);

		int arrayno[] = { 1, 2, 3, 4, 0 };
		orden = isSorted(arrayno);
		System.out.println(orden);

		int arraydesc[] = { 5, 4, 3, 2, 1 };
		orden = isSorted(arraydesc);
		System.out.println(orden);

		System.out.println();

		int[][] submat = relleno(mat);
		imprimir(submat);

		boolean simetria = isSimetricaPerfecta(mat3);
		System.out.println(simetria);

	}

	/**
	 * Para saber si esta ordenada el array de manera ascendente o descendente
	 * 
	 * @param array Array principal
	 * @return TRUE si es ascendente o descendente y FALSE si no lo es
	 */
	public static boolean isSorted(int[] array) {
		int asc[] = new int[array.length];
		int desc[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			desc[i] = array[0];
			asc[i] = array[0];
		}
		int a = 0;
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= desc[j]) {
				desc[j] = array[i];
				j--;
			}
			if (array[i] >= asc[a]) {
				asc[a] = array[i];
				a++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (asc[i] != array[i]) {
				for (j = 0; j < array.length; j++) {
					if (desc[j] != array[j]) {
						return false;
					}
				}
			}
		}
		return true;

	}

	/**
	 * Devuelve la diagonal
	 * 
	 * @param m matriz a la que se extrae la diagonal
	 * @return la diagonal de una array cuadrada
	 */
	public static int[] diagonal(int[][] m) {
		if (m.length == m[0].length) {
			int[] diagonal = new int[m.length];
			for (int i = 0; i < m.length; i++) {
				diagonal[i] = m[i][i];
			}
			return diagonal;
		} else {
			System.out.println("ERROR la matriz no es cuadrada.");
			return null;
		}
	}

	/**
	 * Para saber si la matriz es cuadrada, la diagonal son todos los números
	 * iguales y su traspuesta es exacta a la matriz
	 * 
	 * @param matriz Matriz principal
	 * @return TRUE si cumple los requisitos FALSE si no los cumple
	 */
	public static boolean isSimetricaPerfecta(int[][] matriz) {
		int diagonal[] = new int[matriz.length];
		int fila[] = new int[matriz.length];
		int col[] = new int[matriz[0].length];
		diagonal = diagonal(matriz);
		for (int i = 0; i < matriz.length; i++) {
			// DA AQUI ERROR NO ME HA DADO TIEMPO A MIRARLO
			col = getColumna(matriz, i);
			fila = getFila(matriz, i);
			for (int j = 0; j < col.length; j++) {
				if (col[j] != fila[j]) {
					return false;
				}
			}

		}
		if (matriz.length == matriz[0].length) {
			for (int i = 0; i < diagonal.length; i++) {
				if (diagonal[i] != diagonal[0]) {
					return false;
				}
			}

		}
		return true;
	}

	/**
	 * Devuelve una submatriz sin las columnas/filas de fuera
	 * 
	 * @param m Matriz principal
	 * @return el relleno
	 * @throws Exception Si se sale del rango
	 */
	public static int[][] relleno(int[][] m) throws Exception {
		if (m.length >= 3 && m[0].length >= 3) {
			int a = 1;
			int[] numerosFilasElegidas = new int[m[0].length - 2];
			int[] numerosColumnasElegidas = new int[m.length - 2];
			for (int i = 0; i < numerosFilasElegidas.length; i++) {
				numerosFilasElegidas[i] = a;
				a++;
			}
			a = 1;
			for (int i = 0; i < numerosColumnasElegidas.length; i++) {
				numerosColumnasElegidas[i] = a;
				a++;
			}
			int submatriz[][] = new int[numerosColumnasElegidas.length][numerosFilasElegidas.length];
			for (int i = 0; i < numerosColumnasElegidas.length; i++) {
				for (int j = 0; j < numerosFilasElegidas.length; j++) {
					if (numerosColumnasElegidas[i] < m.length && numerosColumnasElegidas[i] > 0
							|| numerosFilasElegidas[j] < m[0].length && numerosFilasElegidas[j] > 0) {
						submatriz[i][j] = m[numerosColumnasElegidas[i]][numerosFilasElegidas[j]];
					} else {
						throw new Exception("ERROR: las columnas/filas estan fuera del rango de la matriz");
					}
				}
			}
			return submatriz;
		} else {
			System.out.println("No es mayor de 3 por lo tanto no se puede sacar");
			return null;
		}
	}

	/**
	 * Para imprimir array
	 * 
	 * @param a array que se desea imprimir
	 */
	public static void imprimir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	/**
	 * Para imprimir una matriz
	 * 
	 * @param m Matriz
	 */
	public static void imprimir(int[][] m) {
		if (m.length == m[0].length) {
			for (int i = 0; i < m[0].length; i++) {
				imprimir(m[i]);
				System.out.println();
			}
		} else {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					System.out.print(m[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

	/**
	 * Saca toda la fila pedida.
	 * 
	 * @param m      MATRIZ dada
	 * @param indice número de la fila
	 * @return todos los valores de la fila(array)
	 */
	public static int[] getFila(int[][] m, int indice) {
		int fila[] = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			fila[i] = m[indice][i];
		}
		return fila;
	}

	/**
	 * Saca la columna.
	 * 
	 * @param m      matriz dada.
	 * @param indice número de la columna.
	 * @return todos los valores de la columna (array).
	 */
	public static int[] getColumna(int[][] m, int indice) {
		int columna[] = new int[m.length];
		for (int i = 0; i < m[0].length; i++) {
			columna[i] = m[i][indice];
		}
		return columna;
	}

}
