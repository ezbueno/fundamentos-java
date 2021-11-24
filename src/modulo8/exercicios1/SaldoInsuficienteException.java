package modulo8.exercicios1;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	private final double saldoDisponivel;
	
	public SaldoInsuficienteException(String mensagem, double saldoDisponivel) {
		super(mensagem);
		this.saldoDisponivel = saldoDisponivel;
	}
	
	public double getSaldoDisponivel() {
		return this.saldoDisponivel;
	}
}
