package modulo8.exemplos1;

@SuppressWarnings("serial")
public class ValorNegativoException extends Exception {
	
	private double valor;
	
	public ValorNegativoException(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
}
