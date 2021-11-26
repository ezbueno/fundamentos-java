package modulo12.exercicios4;

public class Quadrado extends Figura {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
}
