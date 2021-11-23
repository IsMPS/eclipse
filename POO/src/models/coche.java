package models;

public class coche {
	// PROPIEDADES
	private String matricula;
	private String color;
	private String marca;
	private String modelo;
	private int cv;
	private String tipocombustible;
	private double deposito;
	private boolean arrancado;
	private double velocidad;
	
	// Getters y setters Source - Generate Setters and Getters
	
	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCv() {
		return cv;
	}

	public String getTipocombustible() {
		return tipocombustible;
	}

	public double getDeposito() {
		return deposito;
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public double getVelocidad() {
		return velocidad;
	}
	
//Constructores Source - Constructors using Fields
	
	/**
	 * @param matricula
	 * @param color
	 * @param marca
	 * @param modelo
	 * @param cv
	 * @param tipocombustible
	 */
	public coche(String matricula, String color, String marca, String modelo, int cv, String tipocombustible) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.tipocombustible = tipocombustible;
		this.arrancado = false;
		this.velocidad= 0;
		this.deposito = 5;
	}
	
	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param marca
	 * @param modelo
	 * @param cv
	 * @param tipocombustible
	 * @param deposito
	 */
	public coche(String matricula, String color, String marca, String modelo, int cv, String tipocombustible, double deposito) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.tipocombustible = tipocombustible;
		this.arrancado = false;
		this.velocidad= 0;
		this.deposito = deposito;
	}
	
	// METODOS
	
	/**
	 * Sirve para arrancar el coche
	 */
	public void arracar() {
		this.arrancado = true;
	}
	
	public void apagar() {
		this.arrancado = false;
	}
	
	/**
	 * Si el coche est� arrancado y minimo tiene m�s de 1 de combustible acelera
	 * @param velocidad 
	 * @throws Exception
	 */
	public void acelerar(int velocidad) throws Exception {
		if (this.arrancado && this.deposito>1) {
			this.velocidad = this.velocidad + velocidad;
			this.deposito = this.deposito - 1;
		}
		else 
			throw new Exception("El coche no est� arrancado o le falta gasolina");
	}
	
	/**
	 * Para frenar
	 * @param velocidad
	 */
	public void frenar(int velocidad) {
		if(velocidad > this.velocidad)
			this.velocidad = 0;
		else
			this.velocidad = this.velocidad - velocidad;
		
	}
	
	/** 
	 * 
	 * @param litros
	 */
	public void repostar(double litros) {
		this.deposito = this.deposito + litros;
	}

	// source - generate toStrign
	@Override
	public String toString() {
		return "coche [ deposito=" + deposito +", matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", cv=" + cv + ", tipocombustible=" + tipocombustible + ", arrancado="
				+ arrancado + ", velocidad=" + velocidad + "]";
	}
}
