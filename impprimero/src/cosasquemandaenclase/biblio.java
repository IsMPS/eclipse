package cosasquemandaenclase;

public class biblio {

	/**
	 * 
	 * @param m matriz a la que se extrae la diagonal.
	 * @return la diagonal de una array cuadrada.
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
	 * Valor de la diagonal invertida
	 * 
	 * @param m matriz cuadrada
	 * @return diagonal invertida
	 */
	private static int[] diagonalinvertida(int[][] m) {
		if (m.length == m[0].length) {
			int[] diagonal = new int[m.length];
			int o = m.length;
			for (int i = 0; i < m.length; i++) {
				o--;
				diagonal[i] = m[i][o];
			}
			return diagonal;
		} else {
			System.out.println("ERROR la matriz no es cuadrada.");
			return null;
		}
	}

	/**
	 * Devuelve la diagonal de matriz una cuadrada si invertida es true, devuelve la
	 * diagonal invertida
	 * 
	 * @param m         matriz a extraer la diagonal.
	 * @param invertida true - diagonal invertida, false - diagonal principal
	 * @return array con la diagonal m
	 */
	public static int[] diagonal(int[][] m, boolean invertida) throws Exception {
		if (m.length == m[0].length) {
			if (invertida) {
				return diagonalinvertida(m);
			} else {
				return diagonal(m);
			}
		} else {
			throw new Exception("Error: La matriz no es cuadrada");
		}
	}

	/**
	 * Pasa sacar el mínimo, el máximo, la media, desviacionTipica y varianza.
	 * 
	 * @param m La matriz que se le quiera sacar los valores indicados.
	 * @return El mínimo, el máximo, la media, desviacionTipica y varianza en un
	 *         array de 5 de longitud.
	 */
	public static int[] extraerEstadisticas(int[][] m) {
		int[] estadistica = new int[5];
		int num = m[0][0];

		for (int i = 0; i < estadistica.length; i++) {
			estadistica[i] = 0;
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (num > m[i][j]) {
					num = m[i][j];
				}
			}
		}
		estadistica[0] = num;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (num < m[i][j]) {
					num = m[i][j];
				}
			}
		}
		estadistica[1] = num;

		num = 0;
		int total = 1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				num = num + m[i][j];
			}
			total = m.length * m[0].length;
		}
		if (total != 0) {
			estadistica[2] = num / total;
		}

		return estadistica;
	}

	/**
	 * Sirve para devolver la array inversa.
	 * 
	 * @param array Una array cualquiera.
	 * @return los números en orden inverso
	 */
	public static int[] invertir(int[] array) {
		int invertida[] = new int[array.length];
		int i = 0;
		for (int j = array.length - 1; j >= 0; j--) {
			invertida[i] = array[j];
			i++;
		}
		return invertida;
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
			fila[i] = m[indice - 1][i];
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

	/**
	 * Devuelve los datos de una submatriz.
	 * 
	 * @param m                       La matriz elegida.
	 * @param numerosFilasElegidas    Las filas elegidas.
	 * @param numerosColumnasElegidas Las columnas elegidas.
	 * @return Una submatriz
	 */
	public static int[][] submatriz(int[][] m, int[] numerosFilasElegidas, int[] numerosColumnasElegidas)
			throws Exception {
		int submatriz[][] = new int[numerosFilasElegidas.length][numerosColumnasElegidas.length];
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
	}

	/**
	 * Multiplica dos matrices.
	 * 
	 * @param m1 Primera matriz.
	 * @param m2 Segunda matriz.
	 * @return Matriz multiplicada.
	 */
	public static int[][] multiplica(int[][] m1, int[][] m2) {
		int multiplicada[][] = new int[m1.length][m2[0].length];
		if (m1.length == m2[0].length && m1[0].length == m2.length) {
			int resultado = 0;
			for (int i = 0; i < m1.length; i++) {
				for (int a = 0; a < m2[0].length; a++) {
					for (int o = 0; o < m2.length; o++) {
						resultado = resultado + m1[i][o] * m2[o][a];
					}
					multiplicada[i][a] = resultado;
					resultado = 0;
				}
			}
			return multiplicada;
		} else {
			System.out.println("ERROR: Las matrices no se pueden multiplicar");
			return null;
		}
	}

	/**
	 * Remplaza una fila.
	 * 
	 * @param m      Matriz principal.
	 * @param a      Array para remplazar la fila.
	 * @param indice Número de la fila.
	 */
	public static void reemplazarFilaConArray(int m[][], int[] a, int indice) {
		// Puedo poner a.length<m[0].lenght && a.lenght>0 para que recorra la parte del
		// array que si entra y cambiar el else
		if (indice > 0 && indice <= m.length && a.length == m[0].length) {
			for (int i = 0; i < a.length; i++) {
				m[indice - 1][i] = a[i];
			}
			imprimir(m);
		} else {
			System.out.println("La longitud de las filas de la matriz no es igual a la longitud del array");
		}
	}

	/**
	 * Remplaza una columna.
	 * 
	 * @param m      Matriz principal.
	 * @param a      Array que sustituye.
	 * @param indice Número de la columna.
	 */
	public static void reemplazarColumnaConArray(int m[][], int[] a, int indice) {
		// Puedo poner a.length<m.lenght && a.lenght>0 para que recorra la parte del
		// array que si entra y cambiar el else
		if (indice > 0 && indice <= m[0].length && a.length == m.length) {
			for (int i = 0; i < a.length; i++) {
				m[i][indice - 1] = a[i];
			}
			imprimir(m);
		} else {
			System.out.println("La longitud de las columnas de la matriz no es igual a la longitud del array");
		}
	}

	public static int[] moverarray(int a[], int posicion) {
		int array[] = new int[a.length];
		array = a;
		int cambio[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			cambio[i + 1] = array[i];
			cambio[0] = array[a.length - 1];
		}
		for (int i = 0; i < a.length; i++) {
			array[i] = cambio[i];

		}
		return array;
	}

	public static int determinantematriz(int m[][]) throws Exception {
		int array[] = new int[m.length];
		int arrayn[] = new int[m.length];
//		int num1 = m[0][0];
//		int num2 = m[0][1];
//		int num3 = m[0][2];
//		int resultado = 0;
//		int dig = 1;
//		int dog = 1;
//		int det[] = new int[3];
//		int diag[] = new int[2];
//		int diaginv[] = new int[2];
//		int numCT[][] = { { 1, 2 }, { 0, 2 }, { 0, 1 } };
//		int numF[] = { 1, 2 };
//		int numC[] = { 0, 0 };
//		for (int i = 0; i < m.length; i++) {
//			numC = numCT[i];
//			int submat[][] = submatriz(m, numF, numC);
//			diag = diagonal(submat);
//			diaginv = diagonalinvertida(submat);
//			dig = 1;
//			dog = 1;
//			for (int j = 0; j < diag.length; j++) {
//				dig = dig * diag[j];
//				dog = dog * diaginv[j];
//			}
//			det[i] = dig - dog;
//		}
//		resultado = num1 * ((int) Math.pow(-1, 2)) * det[0] + num2 * ((int) Math.pow(-1, 3)) * det[1]
//				+ num3 * ((int) Math.pow(-1, 4)) * det[2];
//		return resultado;
//	}
//	int num[] = new int[m.length];
//	int posicion=0;
//	for (int i = 0; i < m.length; i++) {
//		num[i] = 1;
//	}
//	for (int i = 0; i <= m.length * m[0].length; i++) {
//		for (int j = 0; j < m[0].length - 1; j++) {
//			if (((i / m.length) + (i % m[0].length)) % m.length == j) {
//				if (i % m[0].length - 1 <0) {
//					posicion = 0;
//				} else {
//					posicion =i % m[0].length - 1;
//				}
//				num[j] = num[j] * m[i / m.length][posicion];
//			}
//		}
//	}
//	return 0;
//
		int j = m.length - 1;
		for (int i = 0; i < m.length; i++) {
			array[i] = i;
			arrayn[i] = j;
			j--;
		}

		int parte = 0;
		int num = 1;
//		int signo=-1;
		if (m.length == m[0].length) {
			int[] diagonal = new int[m.length];
			for (int a = 0; a < m.length; a++) {
				num = 1;
				for (int i = 0; i < m.length; i++) {
//	   RECORRER UN ARRAY Y LUEGO MOVERLO TOD 1 PARA LA DERECHA
					diagonal[i] = m[i][array[i]];
//					if((i+array[i])%2!=0) {
//						signo =-1;
//					}
					num = num * diagonal[i];
//					signo=1;
				}
				moverarray(array, 1);
				parte = parte + num;
			}
			System.out.println(parte);
			// AHORA LA PARTE NEGATIVA
			int[] diagonalinv = new int[m.length];
			for (int a = 0; a < m.length; a++) {
				num = 1;
				for (int i = 0; i < m.length; i++) {
					diagonalinv[i] = m[i][arrayn[i]];
//					if((i+arrayn[i])%2!=0) {
//						signo =-1;
//					}
					num = num * diagonalinv[i];
//					signo=1;
				}
				parte = parte - num;
				moverarray(arrayn, 1);
			}
			return parte;
////si le sumo el m.lenght+1 a la posicion da la diagonal
		} else {
			System.out.println("ERROR la matriz no es cuadrada.");
			return 0;
		}
	}
}
