import java.util.Scanner;

public class ejercicioextra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		boolean esletra = false;
		do {
			try {
				esletra = false;
				System.out.println("Introduce dimensiones");
				x = Integer.parseInt(sc.nextLine());
				y = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				esletra = true;
				System.out.println("No se permiten letras");
			}
		} while (x < 3 || y < 3 || esletra);
		int altura = x;
		int lon = y;
		boolean ganar[][] = new boolean[x][y];
		int tabla[][] = new int[x][y];
		int visual[][] = new int[x][y];
		boolean juego = true;
		System.out.println("------------------------------------------");
		for (int i = 0; i < visual.length; i++) {
			for (int a = 0; a < visual[i].length; a++) {
				ganar[i][a] = false;
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int a = 0; a < tabla[i].length; a++) {
				tabla[i][a] = 0;
			}
			for (int bombas = 0; bombas < 5; bombas++) {
				x = ((int) (Math.random() * tabla.length));
				y = ((int) (Math.random() * tabla[i].length));

				while (tabla[x][y] == 8) {
					x = ((int) (Math.random() * tabla.length));
					y = ((int) (Math.random() * tabla[i].length));
				}
				tabla[x][y] = 8;
				ganar[x][y] = true;
// las bombas son los 8
				if (x - 1 >= 0 && tabla[x - 1][y] != 8) {
					tabla[x - 1][y]++;
				}
				if (y - 1 >= 0 && tabla[x][y - 1] != 8) {
					tabla[x][y - 1]++;
				}
				if (y - 1 >= 0 && x - 1 >= 0 && tabla[x - 1][y - 1] != 8) {
					tabla[x - 1][y - 1]++;
				}
				if (y + 1 < tabla[x].length && tabla[x][y + 1] != 8) {
					tabla[x][y + 1]++;
				}
				if (x + 1 < tabla.length && tabla[x + 1][y] != 8) {
					tabla[x + 1][y]++;
				}
				if (x + 1 < tabla.length && y + 1 < tabla[x].length && tabla[x + 1][y + 1] != 8) {
					tabla[x + 1][y + 1]++;
				}
				if (x + 1 < tabla.length && y - 1 >= 0 && tabla[x + 1][y - 1] != 8) {
					tabla[x + 1][y - 1]++;
				}
				if (x - 1 >= 0 && y + 1 < tabla[x].length && tabla[x - 1][y + 1] != 8) {
					tabla[x - 1][y + 1]++;
				}
			}
// tabla mostrar (QUITAR PARA JUGAR)
//			for (i = 0; i < tabla.length; i++) {
//				for (int a = 0; a < tabla[i].length; a++) {
//					System.out.print(tabla[i][a] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("------------------------------------------");
// HASTA AQUÍ
			for (i = 0; i < visual.length; i++) {
				for (int a = 0; a < visual[i].length; a++) {
					visual[i][a] = 9;
					System.out.print(visual[i][a] + " ");
					if (a == (visual[i].length - 1)) {
						System.out.print("\n");
					}
				}
			}
			do {
//				casillas para mostrar como el busca minas cuando no hay nada y te muestra todos los números. Sin terminar por pereza ¯\_(ツ)_/¯
//				 if (tabla[x][y]==0) {
//					for(i = 0;i>0;i++) {
//				if (tabla[x-i][y]!=8) {
//					visual[x-i][y]=tabla[x-i][y];

//				}
//					visual[x][y-i]=tabla[x][y-i];
//					visual[x-i][y-i]=tabla[x-i][y-i];
//					visual[x+i][y]=tabla[x+i][y];
//					visual[x][y+i]=tabla[x][y+i];
//					visual[x+i][y+i]=tabla[x+i][y+i];
//					visual[x-i][y+i]=tabla[x-i][y+i];
//					visual[x+i][y-i]=tabla[x+i][y-i];
//					}
//				}
				System.out.println("------------------------------------------");
				do {
					esletra = false;
					try {
						esletra = false;
						System.out.println(
								"Los '9' son casillas sin descubrir, los '8' bombas y los demas números son cuantas bombas toca cada casilla.");
						System.out.println("Introduzca la posicion deseada (primero columnas y luego filas)");
						x = Integer.parseInt(sc.nextLine());
						y = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						esletra = true;
						System.out.println("No se permiten letras");
					}
				} while (x < 0 || x > altura || y < 0 || y > lon || esletra);
				System.out.println("------------------------------------------");
				if (tabla[y - 1][x - 1] == 8) {
					System.out.println("Has perdido.");
					System.out.println("------------------------------------------");
					juego = false;
					for (i = 0; i < tabla.length; i++) {
						for (int a = 0; a < tabla[i].length; a++) {
							System.out.print(tabla[i][a] + " ");
						}
						System.out.println();
					}
				} else if (tabla[y - 1][x - 1] >= 0 && tabla[y - 1][x - 1] != 8) {
					visual[y - 1][x - 1] = tabla[y - 1][x - 1];
					for (i = 0; i < visual.length; i++) {
						for (int a = 0; a < visual[i].length; a++) {
							System.out.print(visual[i][a] + " ");
						}
						System.out.print("\n");
					}
				}
				int gana = 0;
				for (i = 0; i < visual.length; i++) {
					for (int a = 0; a < visual[i].length; a++) {
						if (tabla[i][a] == visual[i][a]) {
							ganar[i][a] = true;
						}
						if (ganar[i][a]) {
							
							gana++;
							if (gana == altura * lon) {
								System.out.println("Has ganado.");
								juego = false;
							}
						}

					}
				}
			} while (juego);
			sc.close();
		}
	}
}