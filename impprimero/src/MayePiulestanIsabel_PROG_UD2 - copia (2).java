import java.util.Scanner;

public class MayePiulestanIsabel_PROG_UD2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a la Calculadora");
		int num1 = 0;
		int num2 = 0;
		// Es para volver a iniciar todo el proceso/la calculadora de nuevo. Por eso
		// está el do-while.
		boolean uso = true;
		boolean esletra = false;
		boolean divcero = true;
		String operacion;
		do {
			divcero = true;
			int result = 0;
			// Bucle para verificar que lo introducido no son letras.
			do {
				esletra = false;
				try {
					System.out.print("\nIntroduce el primer número entero: ");
					num1 = Integer.parseInt(sc.nextLine());
					System.out.print("Introduce el segundo número entero:");
					num2 = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Solo se pueden introducir números enteros.\n");
					esletra = true;
				}
			} while (esletra);

			System.out.print("\n¿Qué operación quiere realizar?\na.Suma\nb.Resta\nc.División\nd.Multiplicación\n");
			operacion = sc.nextLine();
			// He puesto todos los casos posibles de las operaciones para evitar
			// confusiones.
			switch (operacion) {
			case "a":
			case "Suma":
			case "suma":
				result = num1 + num2;
				break;
			case "b":
			case "Resta":
			case "resta":
				result = num1 - num2;
				break;
			case "c":
			case "División":
			case "Division":
			case "división":
			case "division":
				// He pensado en buscar el resultado directamente y luego comprobar, pero no
				// recuerdo como poner el valor mínimo y no puedo usar números negativos.
				if (num2 != 0) {
					for (int i = 0; i >= 0; i++) {
						result = 0;
						for (int a = i; a > 0; a--) {
							result = result + num2;
						}
						if (result == num1 && result != 0) {
							result = i;
							i = -10;
						}
					}
				} else {
					System.out.println("\nNo es posible dividir entre 0.\n");
					divcero = false;
				}
				break;
			case "d":
			case "Multiplicación":
			case "Multiplicacion":
			case "multiplicación":
			case "multiplicacion":
				for (int i = num2; i > 0; i--) {
					result = result + num1;
				}
				break;
			}
			if (divcero) {
				System.out.println("\nEl resultado es " + result);
				boolean error = true;
				do {
					error = true;
					System.out.print("\n¿Quiere volver a usar la calculadora? (si|no): ");
					String usar = sc.nextLine();
					if (usar.equals("si")) {
						uso = true;
						error = false;
					} else if (usar.equals("no")) {
						uso = false;
						error = false;
					} else {
						error = true;
					}
				} while (error);
			}
		} while (uso);
		sc.close();
	}

}
