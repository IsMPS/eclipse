package models;

public class Perro {
	private boolean vivo;
	private int vida;
	private int energia;
	private double velocidad;
	private String nombre;
	private String raza;
	private String color;
	private boolean cagar;
	private double peso;
	private int felicidad;
	private int dia;
	private boolean dormir;

	public boolean isVivo() {
		return vivo;
	}

	public int getVida() {
		return vida;
	}

	public int getEnergia() {
		return energia;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}

	public boolean isCagar() {
		return cagar;
	}

	public double getPeso() {
		return peso;
	}

	/**
	 * @param nombre
	 * @param raza
	 * @param color
	 */
	public Perro(String nombre, String raza, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.vivo = nace();
		this.vida = dureza();
		this.energia = 10;
		this.velocidad = 0;
		this.peso = 25;
	}

	// Constructor

	private boolean nace() {
		return true;
	}

	private void muerto() {
		if (this.vida == 0 || this.peso == 0 || this.energia == 0) {
			this.vivo = false;
			this.felicidad=0;
			this.velocidad=0;
			this.energia=0;
			this.vida=0;
			System.out.println( this.nombre + " ha muerto...\n");
		}
	}

	/**
	 * Le das de comer x chuleta
	 * Sube: Peso y energía
	 * Baja: la vida si le pones obeso
	 */
	public void comer(int comida) {
		if (this.vivo && !this.dormir) {
			if (peso < 50) {
				this.energia = this.energia + comida;
			} else if (peso >= 53) {
				this.vida = this.vida - (10 * comida);
				System.out.println("Ha perdido 10 puntos de vida. Vida actual: " + this.vida);
				System.out.println("Illo que no se puede ni moveh como le de mah comida va a morir");
			}
			this.peso = this.peso + comida;
		} else {
			System.out.println("\nPor si no te has dado cuenta... " + this.nombre + " está muerto.\n");
		}
	}

	/** 
	 * Le haces correr, si está muerto, cansado o durmiendo no puede correr.
	 * Le sube: velocidad, felicidad
	 * Le baja: peso, energia
	 * @param velocidad
	 */
	public void corre(int velocidad) {
		if (this.energia > 0 && this.vivo && !this.dormir) {
			this.velocidad = this.velocidad + velocidad;
			this.energia = this.energia - 1;
			this.peso = this.peso - 1;
			this.felicidad = this.felicidad + 5;
		} else if (this.vivo) {
			muerto();
		} else {
			System.out.println("\nPor si no te has dado cuenta... " + this.nombre + " está muerto.");
		}
	}

	/**
	 * Le tiras una pelota, no te dejará si está muerto, dormido o sin energia.
	 * Sube: felicidad
	 * Baja: energia
	 */
	public void tirarpelota() {
		if (this.energia > 0 && this.vivo && !this.dormir) {
			this.energia = this.energia - 1;
			this.felicidad = this.felicidad + 10;
		}
	}

	// Para elegir la raza, podría poner un menú con switch para ponerlas predeterminadas pero pereza
	private int dureza() {
		if (raza.equals("Caniche")) {
			return 100;
		}
		if (raza.equals("Bodeguero")) {
			return 75;
		} else {
			return 150;
		}
	}

	/**
	 * Se duerme el perro
	 * Sube: energia
	 * Felicidad va a 0
	 */
	public void dormir() {
		this.felicidad = 0;
		this.energia = this.energia + 10;
		this.dormir = true;
	}

	/**
	 * Se despierta
	 * Pasa un día
	 */
	public void despertar() {
		this.dia = this.dia + 1;
		this.dormir = false;
	}

	/**
	 * Se pone a cagar el bicho
	 * Como se para la velocidad es 0
	 * Sube la energia
	 * Baja el peso
	 * @param tiempo
	 */
	public void cagar(int tiempo) {
		if (this.vivo && !this.dormir) {
			this.velocidad = 0;
			this.cagar = true;
			System.out.println(this.nombre + " está cagando");
			for (int i = 1; i <= tiempo; i++) {
				System.out.println(i);
			}
			dejarcagar();
		} else {
			System.out.println("Por si no te has dado cuenta... " + this.nombre + " está muerto.");
		}
	}

	private void dejarcagar() {
		if (this.cagar) {
			this.cagar = false;
			this.energia = this.energia + 1;
			this.peso = this.peso - 1;
			System.out.println("Ahora el perro va más ligero\n");
		}
	}

	@Override
	public String toString() {
		if(this.vivo) {
		return this.nombre + " [vivo=" + vivo + ", vida=" + vida + ", energia=" + energia + ", velocidad=" + velocidad
				+ ", raza=" + raza + ", color=" + color + ", cagar=" + cagar + ", peso=" + peso
				+ ", felicidad=" + felicidad + ", dormir=" + dormir + "]\n";
		} else {
			return this.nombre + " [vivo=" + vivo + ", raza=" + raza + ", color=" + color + ", peso=" + peso + "]\n";
		}
	}
	
}
