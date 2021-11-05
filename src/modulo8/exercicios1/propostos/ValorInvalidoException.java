package modulo8.exercicios1.propostos;

@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {
	
	private final double valorInvalido;

	public ValorInvalidoException(String mensagem, double valorInvalido) {
		super(mensagem);
		this.valorInvalido = valorInvalido;
	}
	
	public double getValorInvalido() {
		return this.valorInvalido;
	}
}
