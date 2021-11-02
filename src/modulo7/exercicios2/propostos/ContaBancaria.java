package modulo7.exercicios2.propostos;

public abstract class ContaBancaria {

	protected double saldo;
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	void sacar(double valor) {
		this.saldo -= valor;
	}
	
	void transferir(double valor, ContaBancaria contaBancaria) {
		this.sacar(valor);
		contaBancaria.depositar(valor);
	}
	
	abstract double calcularSaldo();
}
