package main;

import models.coche;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coche miCoche = new coche("1234ZZZ", "Gris", "Seat", "Ibiza", 105, "Diesel");
		coche tuCoche = new coche("1234AZZ", "Azul", "Seat", "Leon", 105, "Diesel");
		coche suCoche = new coche("1234BZZ", "Rojo", "Seat", "Ibiza", 190, "Gasolina");
		coche nuestroCoche = new coche("1234CZZ", "Amarillo", "Seat", "Ateca", 105, "Gasolina");
		
		System.out.println(miCoche);
		
		miCoche.arracar();
		try {
			miCoche.acelerar(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(miCoche);
	}

}
