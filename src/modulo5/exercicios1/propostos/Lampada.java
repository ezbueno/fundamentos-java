package modulo5.exercicios1.propostos;

public class Lampada {
	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}

	public void imprimir() {
		if (this.ligada) {
			System.out.println("L�mpada ligada");
		} else {
			System.out.println("L�mpada desligada");
		}
	}
}
