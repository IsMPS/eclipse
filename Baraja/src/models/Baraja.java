package models;

public class Baraja {
	private int lista_cartas;

	/**
	 * @param lista_cartas
	 */
	public Baraja() {
		super();
		this.lista_cartas = 0;
	}

	/**
	 * @param lista_cartas
	 */
	public Baraja(int tipobaraja) {
		super();
		switch(tipobaraja) {
		case 1:
			this.lista_cartas = 40;
			break;
		case 2: 
			this.lista_cartas = 80;
			break;
		}
	}
	
	
	
}
