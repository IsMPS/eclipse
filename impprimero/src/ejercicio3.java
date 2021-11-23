import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce la cantidad de pesetas para pasar a euros ");
		Scanner sc = new Scanner(System.in);
		double pesetas;
		pesetas = sc.nextDouble();
		double difeuros = 0.006;
		
		System.out.println(pesetas + " pesetas son " + (pesetas*difeuros) + " euros");
		sc.close();
	}

}
