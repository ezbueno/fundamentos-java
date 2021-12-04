package modulo14.exemplos6;

public class ContaBancaria {

	private double saldo = 1000;

	public synchronized void sacar(double valor) {
		this.saldo -= valor;
	}

	public synchronized void depositar(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
