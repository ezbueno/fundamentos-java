package modulo14.exemplos3;

public class Contador {

	private int valor;

	public synchronized void incrementar() {
		this.valor++;
	}

	public int getValor() {
		return this.valor;
	}
}
