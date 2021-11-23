package models;

public class Moto {
	private String matricula;
	private String color;
	private String marca;
	private String modelo;
	private int cv;
	private String tipocombustible;
	private double deposito;
	private boolean arrancado;
	private double velocidad;
	
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
	
	/**
	 * @param matricula
	 * @param color
	 * @param marca
	 * @param modelo
	 * @param cv
	 * @param tipocombustible
	 * @param deposito
	 * @param arrancado
	 * @param velocidad
	 */
	public Moto(String matricula, String color, String marca, String modelo, int cv, String tipocombustible) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.tipocombustible = tipocombustible;
		this.deposito = 5;
		this.arrancado = false;
		this.velocidad = 0;
	}
	
	public void arrancar( ) {
		this.arrancado=true;
	}
	
	public void apagar( ) {
		this.arrancado=false;
	}
	
	/**
	 * Si la moto está arrancada y minimo tiene más de 1 de combustible acelera
	 * @param velocidad 
	 * @throws Exception
	 */
	public void acelerar(int velocidad) throws Exception {
		if (this.arrancado && this.deposito>1) {
			this.velocidad = this.velocidad + velocidad;
			this.deposito = this.deposito - 1;
		}
		else 
			throw new Exception("La moto no está arrancada o le falta gasolina");
	}
	
	public void frenar(int velocidad) {
		if(velocidad > this.velocidad)
			this.velocidad = 0;
		else
			this.velocidad = this.velocidad - velocidad;
		
	}
	
	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", cv="
				+ cv + ", tipocombustible=" + tipocombustible + ", deposito=" + deposito + ", arrancado=" + arrancado
				+ ", velocidad=" + velocidad + "]";
	}
	
	
}
