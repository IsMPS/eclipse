package tema4;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
//		Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
//		est� siendo infiel. El programa ir� haciendo preguntas que el usuario contestar�
//		con verdadero o falso. Cada pregunta contestada como verdadero sumar� 3
//		puntos. Las preguntas contestadas con falso no suman puntos. A continuaci�n
//		se listan las preguntas del test.
//		1. Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo
//		aparente.
//		2. Ha aumentado sus gastos de vestuario
//		3. Ha perdido el inter�s que mostraba anteriormente por ti
//		4. Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se
//		arregla el pelo y se asea con m�s frecuencia (si es mujer)
//		5. No te deja que mires la agenda de su tel�fono m�vil
//		6. A veces tiene llamadas que dice no querer contestar cuando est�s t�
//		delante
//		7. �ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a
//		8. Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho
//		m�s trabajo
//		9. Has notado que �ltimamente se perfuma m�s
//		10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
//		A continuaci�n se muestran los mensajes que deber� dar el programa seg�n
//		la puntuaci�n obtenida.
//		� Puntuaci�n entre 0 y 10: �Enhorabuena! tu pareja parece ser totalmente
//		fiel.
//		� Puntuaci�n entre 11 y 22: Quiz�s exista el peligro de otra persona en su
//		vida o en su mente, aunque seguramente ser� algo sin importancia. No
//		bajes la guardia.
//		� Puntuaci�n entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
//		viviendo un romance con otra persona. Te aconsejamos que indagues un
//		poco m�s y averig�es que es lo que est� pasando por su cabeza.
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido al test para saber si la probabilidad de que tu pareja de este enga�ando");
		System.out.println("Conteste 'true' de verdadero/si o 'false' de falso/no");
		System.out.print("Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.");
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
		System.out.print("Ha perdido el inter�s que mostraba anteriormente por ti");
		Boolean respuesta3 = sc.nextBoolean();
		if (respuesta3) {
			resultado++;
		}
		System.out.print("Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer)");
		Boolean respuesta4 = sc.nextBoolean();
		if (respuesta4) {
			resultado++;
		}
		System.out.print("No te deja que mires la agenda de su tel�fono m�vil");
		Boolean respuesta5 = sc.nextBoolean();
		if (respuesta5) {
			resultado++;
		}
		System.out.print("A veces tiene llamadas que dice no querer contestar cuando est�s t� delante");
		Boolean respuesta6 = sc.nextBoolean();
		if (respuesta6) {
				resultado++;
		}
		System.out.print("�ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a");
		Boolean respuesta7 = sc.nextBoolean();
		if (respuesta7) {
			resultado++;
		}
		System.out.print("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo");
		Boolean respuesta8 = sc.nextBoolean();
		if (respuesta8) {
			resultado++;
		}
		System.out.print("Has notado que �ltimamente se perfuma m�s");
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
			System.out.println("Puntuaci�n entre 0 y 10: �Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		if (resultado>=11 && resultado<=22) {
			System.out.println("Puntuaci�n entre 11 y 22: Quiz�s exista el peligro de otra persona en\nsu vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");
		}
		if (resultado>22 && resultado <=30) {
			System.out.println("Puntuaci�n entre 22 y 30: Tu pareja tiene todos los ingredientes para estar\nviviendo un romance con otra persona. Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza.");
		}
		sc.close();	
	}
}