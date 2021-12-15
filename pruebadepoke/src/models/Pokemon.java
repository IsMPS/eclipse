package models;

import java.util.ArrayList;

public class Pokemon {
	private ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
	private String nombre;
	private enum tipo {Acero, Agua, Bicho, Dragon, Electrico,Fantasma, Fuego, Hada, Hielo, Lucha, Normal, Planta, Psiquico, Roca, Siniestro, Tierra, Veneno, Volador};
	private int num;
	private double peso;
	private double altura;
	private enum sexo {Macho, Hembra};
	
	/**
	 * @param nombre
	 * @param num
	 * @param peso
	 * @param altura
	 */
	public Pokemon(String nombre, int num, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.num = num;
		this.peso = peso;
		this.altura = altura;
	};
	
}
