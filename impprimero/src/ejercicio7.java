import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
//		Escribe un programa que calcule el total de una factura a partir de la base
//		imponible.
		System.out.println("Introduzca la base imponible ");
	Scanner sc = new Scanner(System.in);
	double baseImponible ;
	baseImponible = sc.nextDouble();
	System.out.println(baseImponible*1.21);
	sc.close();
  } 
}