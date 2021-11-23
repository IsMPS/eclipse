import java.util.Scanner;

public class MayePiulestanIsabel_PROG_UD2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido a la Calculadora");
		int num1 = 0;
		int num2 = 0;
		int result=0;
		// Es para volver a iniciar todo el proceso/la calculadora de nuevo. Por eso est� el do-while.
		boolean uso = false;
		boolean esletra = false;
		String operacion;
		do {
			do {
				esletra=false;
			try { 
				System.out.print("Introduce el primer n�mero entero: ");
			num1 =Integer.parseInt(sc.nextLine());
			System.out.print("Introduce el segundo n�mero entero: ");
			num2 =Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Solo se pueden introducir n�meros enteros.");
				esletra=true;
			}
			}while(esletra);
			System.out.print("�Qu� operaci�n quiere realizar?\na.Suma\nb.Resta\nc.Divisi�n\nd.Multiplicaci�n\n");
			operacion = sc.next();
			// He puesto todos los casos posibles de las operaciones para evitar confusiones.
			switch (operacion) {
			case "a":
			case "Suma":
			case "suma":
				result = num1+num2;
				break;
			case "b":
			case "Resta":
			case "resta":
				result = num1-num2;
				break;
			case "c":
			case "Divisi�n":
			case "Division":
			case "divisi�n":
			case "division":
				for(int i = num2;i>0;i--) {
					result = num1+num2;
				}
				break;
			case "d":
			case "Multiplicaci�n":
			case "Multiplicacion":
			case "multiplicaci�n":
			case "multiplicacion":
				for(int i = num2; i>0;i--) {
				result = result+num1;
				}
				break;
			}
			System.out.println("El resultado es " + result);
			boolean error = false;
			do {
				error=false;
			System.out.print("�Quiere volver a usar la calculadora? (si|no): ");
			String usar = sc.next();
			if (usar.equals("si")) {
				uso=true;
			}  else if(usar.equals("no")) {
				uso=false;
			} else {
				error = true;
			}
			}while(error);

		}while(uso);
		sc.close();
	}

}
