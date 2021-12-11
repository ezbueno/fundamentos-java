package modulo16.exemplos1;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.getSaldo() - valor < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}
		this.setSaldo(this.getSaldo() - valor);
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
}
