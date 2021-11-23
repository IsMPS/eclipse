package tema4;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
//		Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
//		está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
//		con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
//		puntos. Las preguntas contestadas con falso no suman puntos. A continuación
//		se listan las preguntas del test.
//		1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
//		aparente.
//		2. Ha aumentado sus gastos de vestuario
//		3. Ha perdido el interés que mostraba anteriormente por ti
//		4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
//		arregla el pelo y se asea con más frecuencia (si es mujer)
//		5. No te deja que mires la agenda de su teléfono móvil
//		6. A veces tiene llamadas que dice no querer contestar cuando estás tú
//		delante
//		7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
//		8. Muchos días viene tarde después de trabajar porque dice tener mucho
//		más trabajo
//		9. Has notado que últimamente se perfuma más
//		10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
//		A continuación se muestran los mensajes que deberá dar el programa según
//		la puntuación obtenida.
//		• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
//		fiel.
//		• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
//		vida o en su mente, aunque seguramente será algo sin importancia. No
//		bajes la guardia.
//		• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
//		viviendo un romance con otra persona. Te aconsejamos que indagues un
//		poco más y averigües que es lo que está pasando por su cabeza.
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido al test para saber si la probabilidad de que tu pareja de este engañando");
		System.out.println("Conteste 'true' de verdadero/si o 'false' de falso/no");
		System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		Boolean respuesta1 = sc.nextBoolean();
		int resultado = 0;
		if (respuesta1) {
			resultado++;
		}
		System.out.print("Ha aumentado sus gastos de vestuario");
		Boolean respuesta2 = sc.nextBoolean();
		if (respuesta2) {
			resultado++;
		}
		System.out.print("Ha perdido el interés que mostraba anteriormente por ti");
		Boolean respuesta3 = sc.nextBoolean();
		if (respuesta3) {
			resultado++;
		}
		System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		Boolean respuesta4 = sc.nextBoolean();
		if (respuesta4) {
			resultado++;
		}
		System.out.print("No te deja que mires la agenda de su teléfono móvil");
		Boolean respuesta5 = sc.nextBoolean();
		if (respuesta5) {
			resultado++;
		}
		System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		Boolean respuesta6 = sc.nextBoolean();
		if (respuesta6) {
				resultado++;
		}
		System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		Boolean respuesta7 = sc.nextBoolean();
		if (respuesta7) {
			resultado++;
		}
		System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		Boolean respuesta8 = sc.nextBoolean();
		if (respuesta8) {
			resultado++;
		}
		System.out.print("Has notado que últimamente se perfuma más");
		Boolean respuesta9 = sc.nextBoolean();
		if (respuesta9) {
			resultado++;
		}
		System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		Boolean respuesta10 = sc.nextBoolean();
		if (respuesta10) {
			resultado++;
		}
		resultado = resultado*3;
		if (resultado<=10) {
			System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		if (resultado>=11 && resultado<=22) {
			System.out.println("Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en\nsu vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}
		if (resultado>22 && resultado <=30) {
			System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar\nviviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
		sc.close();	
	}
}