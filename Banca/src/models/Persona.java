package models;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private CuentaCorriente cuentacorriente;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param sueldo
	 */
	public Persona(String nombre, String apellidos, String dni, double sueldo, CuentaCorriente cuentacorriente) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuentacorriente = cuentacorriente;
	}

	/**
	 * @return the cuentacorriente
	 */
	public CuentaCorriente getCuentacorriente() {
		return cuentacorriente;
	}

	/**
	 * @param cuentacorriente the cuentacorriente to set
	 */
	public void setCuentacorriente(CuentaCorriente cuentacorriente) {
		this.cuentacorriente = cuentacorriente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Cuenta Bancaria [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sueldo=" + sueldo
				+ ", saldo=" + this.cuentacorriente.getSaldo() + "]";
	}

	public void cobrarSueldo() {
		this.cuentacorriente.saldo = this.cuentacorriente.saldo + this.sueldo;
	}

	public void sacarPasta(double cantidad) {
		this.cuentacorriente.saldo = this.cuentacorriente.saldo - cantidad;
	}

	public void subirSueldo(double nuevoSueldo) {
		this.sueldo = nuevoSueldo;
	}
}
