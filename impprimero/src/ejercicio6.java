import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce la medida de los lados del triángulo");
		Scanner sc = new Scanner(System.in);
		int altura;
		int lado;
		altura = sc.nextInt();
		lado = sc.nextInt();
		System.out.println("El área del triángulo es " + ((altura*lado)/2));
		sc.close();
	}

}
