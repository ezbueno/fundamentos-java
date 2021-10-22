package modulo5.exemplos1;

public class ContaBancaria {
	private int numConta;
	private boolean ativa;
	private double saldo;
	
	public void sacar(double valor) {
		if (valor < 0) {
			return;
		}		
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		if (valor < 0) {
			return;
		}
		this.saldo += valor;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		if (this.numConta > 0) {
			this.numConta = numConta;			
		}		
	}

	public boolean isAtiva() {
		return this.ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
