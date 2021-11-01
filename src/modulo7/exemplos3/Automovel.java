package modulo7.exemplos3;

public interface Automovel {
	
	final int VELOCIDADE_MAXIMA = 300;

	void acelerar();

	void frear();
	
	default void derrapar() {
		this.acelerar();
		this.frear();
	}
	
	static int getVelocidadeMaxima() {
		return VELOCIDADE_MAXIMA;
	}
}
