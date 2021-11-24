package modulo5.exercicios1;

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
			System.out.println("Lâmpada ligada");
		} else {
			System.out.println("Lâmpada desligada");
		}
	}
}
