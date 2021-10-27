package modulo6.exercicios2.propostos;

public class Veiculo {

	private boolean ligado;

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
	}

	public boolean isLigado() {
		return this.ligado;
	}
}
