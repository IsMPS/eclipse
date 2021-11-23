package tema4;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
//		Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
//		que se imparten en el curso. Cada pregunta acertada sumará un punto. El
//		programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
//		tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
//		en las diferentes asignaturas del curso.
		Scanner sc = new Scanner (System.in);
		double nota = 0;
		System.out.println("Pregunta1 y respuestas");
		String respuesta = sc.next();
		switch (respuesta) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta2 y respuestas");
		String respuesta2 = sc.next();
		switch (respuesta2) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta3 y respuestas");
		String respuesta3 = sc.next();
		switch (respuesta3) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta4 y respuestas");
		String respuesta4 = sc.next();
		switch (respuesta4) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
					System.out.println("Incorrecto");
			break;
				}
		System.out.println("Pregunta5 y respuestas");
		String respuesta5 = sc.next();
		switch (respuesta5) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta6 y respuestas");
		String respuesta6 = sc.next();
		switch (respuesta6) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta7 y respuestas");
		String respuesta7 = sc.next();
		switch (respuesta7) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta8 y respuestas");
		String respuesta8 = sc.next();
		switch (respuesta8) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
				break;
			}
		System.out.println("Pregunta9 y respuestas");
		String respuesta9 = sc.next();
		switch (respuesta9) {
			case "correcta" :
				System.out.println("Muy bien");
				nota = nota + 1;
			break;
			case "incorrecta" :
				System.out.println("Incorrecto");
			break;
			}
		System.out.println("Pregunta10 y respuestas");
		String respuesta10 = sc.next();
		if (respuesta10=="correcta") {
			System.out.println("Correcto");
			nota = nota + 1;
		}
		System.out.println("Tu nota es " + nota);
		sc.close();
	}

}
