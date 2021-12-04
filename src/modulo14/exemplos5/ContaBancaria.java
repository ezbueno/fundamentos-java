package modulo14.exemplos5;

public class ContaBancaria {

	private double saldo = 1000;

	public void sacar(double valor) {
		synchronized (this) {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		synchronized (this) {
			this.saldo += valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}
