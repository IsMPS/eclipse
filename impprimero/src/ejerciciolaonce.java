import java.util.Scanner;

public class ejerciciolaonce {

	public static void main(String[] args) {
//		Crear un programa en Java que permita introducir un n�mero de 5 d�gitos y compruebe (simulando la loter�a de la ONCE) si ese n�mero es 
//		el n�mero premiado o no. El n�mero premiado se calcular� como un n�mero aleatorio entre 00000 y 99999 en el propio programa. 
//		Adicionalmente, deber� decir cu�nto dinero te ha tocado en funci�n de las coincidencias que haya entre tu n�mero y el n�mero premiado.
//
//		Si se acierta �nicamente la primera o la �ltima cifra se ganan 1.5�
//		Si se aciertan las 2 �ltimas cifras se ganan 6�
//		Si se aciertan las 3 �ltimas cifras se ganan 20�
//		Si se aciertan las 4 �ltimas cifras se ganan 200�
//		Si se aciertan las 5 �ltimas cifras se ganan 35000�
//
//		EXTRA DIFICULTAD PARA LOS QUE LO TERMINEN Y QUIERAN M�S:
//		- Contemplar que solo introduzca 5 cifras (control de errores)
//		- Permitir jugar varias veces en una misma ejecuci�n.
//		- Si te toca el reintegro (1.5), te dar� opci�n a comprar un nuevo boleto para otro sorteo.
//
//		---------
//		Ejemplo de salida del programa:
//		BIENVENIDO!
//		Introduce tu n�mero de loter�a: 12345
//		%%%%%%%%%% (pensando) -- Calcula un n�mero aleatorio para definir el n�mero ganador.
//		Has ganado un moj�n.
		Scanner sc = new Scanner (System.in);
		int n = 0;
		boolean reintegro = true;
		int num = 0;
		boolean juego = true;
		System.out.println("Bienvenido al programa");
		do {
			do {
				System.out.print("Introduce tu n�mero de loter�a (solo puede contener 5 cifras): ");
				num = sc.nextInt();
			} while (num>100000);
		int premio = (int) (Math.random() * 100000);
		if (premio<10000) {
			n = 1;
		}
		if (premio<1000) {
			n = 2;
		}		
		if (premio<100) {
			n = 3;
		}		
		if (premio<10) {
			n = 4;
		}
		if (num==premio) {
			System.out.println("�Has ganado el premio gordo! Son 35000� ");
		} else if (num%10==premio%10 || num/10000==premio/10000) {
			System.out.println("�Has ganado 1.5�!");
			reintegro = false;
		} else if (num%100==premio%100) {
			System.out.println("�Has ganado 6�!");
		} else if (num%1000==premio%1000) {
			System.out.println("�Has ganado 20�!");
		} else if (num%10000==premio%10000) {
			System.out.println("�Has ganado 200�!");
		} else {
			System.out.println("Has perdido pringui");
		}
		System.out.print("El n�mero premiado es ");
		for (int i = 0; i!=n; i++) {
		System.out.print("0");
		}
		System.out.println(premio);
			if (reintegro) {
				System.out.print("�Quieres seguir jugando?(si/no) ");
				String decision = sc.next();
				switch (decision){
				case "si" :
					juego = true;
					break;
				case "no" :
					juego = false;
					break;
				}
			}
			System.out.println("------------------------------------");
		} while (juego);
		System.out.println("�Hasta luego!");
		sc.close();
	}

}
