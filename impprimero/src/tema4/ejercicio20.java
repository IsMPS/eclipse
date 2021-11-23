package tema4;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		//Realiza un programa que diga si un número entero positivo introducido por  11 /10 1 11-1 10  %10 0
		//teclado es capicúa. Se permiten números de hasta 5 cifras. 323 3 323-3 320 300 20/10 % 0 capicua
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número y el programa dirá si es capicúa o no ");
		int num = sc.nextInt();
		if (num<100 && num>9) {
			int calculo = num/10;
			int calculo2 = calculo*10;
			int awa = num-calculo-calculo2;
			if (awa==0) {
				System.out.println("Es capicúa");
			}
			else {
				System.out.println("No es capicúa");
			}
		}
		if (num<1000 && num>99 ) {
			int calculo = num/100;
			int calculo2 = calculo*100;
			int calculo3 = num-calculo-calculo2;
			int calculo4 = calculo3%10;
			if (calculo4==0) {
				System.out.println("Es capicúa");
			}
			else {
				System.out.println("No es capicúa");
			}
		}
		if (num<10000 && num>999) { 
			// 3223 3 3220 3000 220 /10 22 
			int calculo = num/1000;
			int calculo2 = calculo*1000;
			int calculo3 = (num-calculo-calculo2)/10; 
			calculo = calculo3/10; 
			calculo2 = calculo3-calculo;
			int calculo4 = calculo2%10;
			if (calculo4==0) {
				System.out.println("Es capicúa");
			}
			else {
				System.out.println("No es capicúa");
			}
		}
		if (num<100000 && num>9999) {
			// 56765 5 5000  676  
			int calculo = num/10000; // 56765/10000 5-calculo
		//	System.out.println(calculo);
			int calculo2 = calculo*10000; //50000 calculo2
		//	System.out.println(calculo2);
			int awa = ((num-(calculo+calculo2))/10);  // 676 awa
		//	System.out.println(awa);
			calculo = awa/100; //6 calculo
		//	System.out.println(calculo);
			calculo2 = awa-calculo; // 670 calculo2
		//	System.out.println(calculo2);
			awa = calculo*100; //600 awa
		//	System.out.println(awa);
			calculo = calculo2-awa;
		//	System.out.println(calculo);
			int owo = calculo%10;
		//	System.out.println(owo);
			if (owo==0) {
				System.out.println("Es capicúa");
			}
			else {
				System.out.println("No es capicúa");
			}
		}
		sc.close();
	}

}
