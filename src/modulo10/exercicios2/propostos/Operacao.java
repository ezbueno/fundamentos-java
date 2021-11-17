package modulo10.exercicios2.propostos;

public enum Operacao {

	SOMA('+'), 
	SUBTRACAO('-'), 
	MULTIPLICACAO('X'), 
	DIVISAO('/');

	private char simbolo;

	Operacao(char simbolo) {
		this.simbolo = simbolo;
	}

	public double calcular(double n1, double n2) {
		if (this == SOMA) {
			return n1 + n2;
		} else if (this == SUBTRACAO) {
			return n1 - n2;
		} else if (this == MULTIPLICACAO) {
			return n1 * n2;
		} else if (this == DIVISAO) {
			return n1 / n2;
		}
		throw new UnsupportedOperationException("N�o foi poss�vel realizar o c�lculo!");
	}

	@Override
	public String toString() {
		return String.valueOf(simbolo);
	}
}
