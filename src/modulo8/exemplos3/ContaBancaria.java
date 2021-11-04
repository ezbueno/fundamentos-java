package modulo8.exemplos3;

public class ContaBancaria {

	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new ValorNegativoException(valor);
		}
		
		if (this.saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, this.saldo);
		}
		
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
