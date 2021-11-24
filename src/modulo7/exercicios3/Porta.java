package modulo7.exercicios3;

public class Porta implements Cloneable {

	private double altura;
	private double largura;
	private boolean aberta;

	public Porta(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public void abrir() {
		this.aberta = true;
	}

	public void fechar() {
		this.aberta = false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public double getAltura() {
		return this.altura;
	}

	public double getLargura() {
		return this.largura;
	}

	public boolean isAberta() {
		return this.aberta;
	}
}
