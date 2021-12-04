package modulo14.exemplos4;

public class ContaBancaria {

	private final Object monitor = new Object();

	private double saldo = 1000;

	public void sacar(double valor) {
		synchronized (monitor) {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		synchronized (monitor) {
			this.saldo += valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}
