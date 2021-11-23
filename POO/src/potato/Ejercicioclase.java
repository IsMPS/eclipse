package potato;

public class Ejercicioclase {

	public static void main(String[] args) {
		Ejercicioclase x = new Ejercicioclase(1, 2);
		Ejercicioclase y = new Ejercicioclase(2, 3);
		System.out.println(x);
		System.out.println(y);
		x=y.clone();
		// x=y hace que apunten al mismo dato y los cambios se aplican a ambos y el clone solo clona
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		y.setA(7);
		y.setB(9);
		System.out.println();
		System.out.println(x);
		System.out.println(y);
	}
	private int a;
	private int b;
	
	
	
	/**
	 * @param a
	 * @param b
	 */
	public Ejercicioclase(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicioclase [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	public Ejercicioclase clone() {
		return new Ejercicioclase(this.a, this.b);
	}
	
}
