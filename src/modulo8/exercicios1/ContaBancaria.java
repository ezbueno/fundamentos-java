package modulo8.exercicios1;

public class ContaBancaria {

	private double saldo;
		
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para saque", valor);
		}
		
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Não há saldo suficiente disponível", this.saldo);
		}
		
		this.saldo -= valor;
	}
	
	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para depósito", valor);
		}
				
		this.saldo += valor;
	}
	
	public void transferir(double valor, ContaBancaria contaBancaria) throws ValorInvalidoException, SaldoInsuficienteException {
		this.sacar(valor);
		contaBancaria.depositar(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
