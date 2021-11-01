package modulo7.exercicios1.propostos;

public class Quadrado implements AreaCalculavel {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
}
