package models;

public class CuentaCorriente {

		private int numeroCuenta;
		public double saldo;
		private String titular;
		
		/**
		 * @param numeroCuenta
		 * @param saldo
		 * @param titular
		 */
		public CuentaCorriente(int numeroCuenta, double saldo, String titular) {
			super();
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldo;
			this.titular = titular;
		}

		/**
		 * @return the numeroCuenta
		 */
		public int getNumeroCuenta() {
			return numeroCuenta;
		}

		/**
		 * @return the saldo
		 */
		public double getSaldo() {
			return saldo;
		}

		/**
		 * @return the titular
		 */
		public String getTitular() {
			return titular;
		}

		/**
		 * @param titular the titular to set
		 */
		public void setTitular(String titular) {
			this.titular = titular;
		}

		@Override
		public String toString() {
			return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
		}
		
		public void sumarCantidad(double cantidad) {
			this.saldo = this.saldo+cantidad;
		}
		
		public void restarCantidad(double cantidad) {
			this.saldo = this.saldo-cantidad;
		}

}
