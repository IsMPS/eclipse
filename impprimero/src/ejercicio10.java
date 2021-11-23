import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// Realiza un conversor de Mb a Kb.
		System.out.println("Introduzca Mb");
		Scanner sc = new Scanner(System.in);
		double mb;
		mb = sc.nextDouble();
		System.out.println( mb + " Mb son " + mb * 1000 + " Kb");
		sc.close();

	}

}
