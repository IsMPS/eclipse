package models;

public class Banco {
	private String dniPropietario;
	private int iban;
	private int pin;
	private double saldo;
	private boolean block;
	private boolean dentro;
	private int intentos;
	private String nombre;
	
	
	
	/**
	 * @return the dniPropietario
	 */
	public String getDniPropietario() {
		return dniPropietario;
	}

	/**
	 * @return the iban
	 */
	public int getIban() {
		return iban;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return the block
	 */
	public boolean isBlock() {
		return block;
	}

	/**
	 * @return the dentro
	 */
	public boolean isDentro() {
		return dentro;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param dniPropietario
	 * @param iBAN
	 * @param pIN
	 * @param block
	 */
	public Banco(String nombre, String dniPropietario, int iban, int pin) {
		super();
		this.nombre = nombre;
		this.dniPropietario = dniPropietario;
		this.iban = iban;
		this.pin = pin;
		this.block = false;
		this.saldo=0;
		this.dentro=false;
		this.intentos=1;
	}
	
	public void entrar(int pinIntroducido) {
		if(this.pin==pinIntroducido) {
			this.dentro=true;
			this.intentos=0;
			System.out.println("¡Bienvenido " + this.nombre + "!\n");
		} else if(!this.dentro) {
			System.out.println("PIN incorrecto\n");
			this.intentos=this.intentos +1;
			if(this.intentos>3) {
				this.block=true;
				this.intentos=0;
				System.out.println("Tu cuenta " + this.iban + " ha sido bloqueada\n");
			}
		} else {
			System.out.println("Estas logueado\n");
		}
	}
	
	public void salircuenta() {
			this.dentro=false;
			System.out.println("Ha salido con exito.\n¡Hasta luego!\n");
	}
	
	/**
	 * 
	 * @param dinero
	 */
	public void meter(double dinero) {
		if (!this.block && this.dentro) {
			this.saldo = this.saldo + dinero;
			System.out.println("Has ingresado: " + dinero + "\nTu saldo actual es de " + this.saldo + "\n");
		} else {
			System.out.println("Ha ocurrido un error, puede que tu cuenta esté bloqueada o no estas logueado.\n");
		}
	}
	
	/**
	 * Saca dinero
	 * Puede fallar si la cuenta está bloqueada o el saldo indicado es menor del de la cuenta
	 * @param dinero
	 */
	public void sacar(double dinero) {
		if (!this.block && this.dentro && dinero<=this.saldo ) {
			this.saldo = this.saldo - dinero;
			System.out.println("Has sacado: " + dinero + "\nTu saldo actual es de " + this.saldo+ "\n");
		} else {
			System.out.println("Ha ocurrido un error, puede que tu cuenta esté bloqueada o no tengas saldo suficiente.\n");
		}
	}
	
	/**
	 * Se supone que hace una trasnferencia pero no se como seleccionar cuentas, si que puedo ponerlas predefinidas pero ta feo 
	 * @param cuenta1
	 * @param cuenta2
	 * @param dinero
	 */
	public void transferencia(int cuenta1, int cuenta2, double dinero) {
		if (!this.block && dinero>this.saldo && this.dentro) {
			this.saldo = this.saldo - dinero;
			
		} else {
			System.out.println("Ha ocurrido un error, puede que una cuenta esté bloqueada o no tengas saldo suficiente.\n");
		}
	}

	@Override
	public String toString() {
		return "\n" + this.nombre + " [DNI=" + dniPropietario + ", IBAN=" + iban + ", Saldo=" + saldo + ", Bloqueada=" + block
				+ ", Estas dentro=" + dentro + "]\n";
	}
	
}
