package models;

public class Carta {
	private int numero;
	private int palo;
	private int id;
	private String nombrePalo;
	private String nombreNumero;
	private String nombreCarta;
	private int valorTute;
	private int valorMus;
	private double valor7ymedia;

	/**
	 * @param numero
	 * @param palo
	 */
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	/**
	 * @param id
	 */
	public Carta(int id) {
		super();
		if(id<41 && id>0) {
		this.numero = id % 10;
		this.palo = (id - 1) / 10;
		} else if (id<81 && id>40) {
			this.numero = (id/2) % 10;
			this.palo = ((id)/2 - 1) / 10;
		}
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the palo
	 */
	public int getPalo() {
		return palo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nombrePalo
	 */
	public String getNombrePalo(int palo) {
		switch (palo) {
		case 1:
			nombrePalo = "oros";
			break;
		case 2:
			nombrePalo = "copas";
			break;
		case 3:
			nombrePalo = "espadas";
			break;
		case 4:
			nombrePalo = "bastos";
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		return nombrePalo;
	}

	/**
	 * @return the nombreNumero
	 */
	public String getNombreNumero(int numero) {
		switch (palo) {
		case 1:
			nombreNumero = "as";
			break;
		case 8:
			nombreNumero = "sota";
			break;
		case 9:
			nombreNumero = "caballo";
			break;
		case 10:
			nombreNumero = "rey";
			break;
		default:
			if (numero > 0 && numero < 8) {

			}
			break;
		}
		return nombreNumero;
	}

	/**
	 * @return the nombreCarta
	 */
	public String getNombreCarta() {
		return nombreCarta;
	}

	/**
	 * @return the valorTute
	 */
	public int getValorTute() {
		return valorTute;
	}

	/**
	 * @return the valorMus
	 */
	public int getValorMus() {
		return valorMus;
	}

	/**
	 * @return the valor7ymedia
	 */
	public double getValor7ymedia() {
		return valor7ymedia;
	}

}
