package modulo7.exercicios1;

public class Circunferencia implements AreaCalculavel {

	private double raio;

	public Circunferencia(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * this.raio * this.raio;
	}
}
