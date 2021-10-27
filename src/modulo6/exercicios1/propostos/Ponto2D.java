package modulo6.exercicios1.propostos;

public class Ponto2D {

	private double coordenadaX;
	private double coordenadaY;

	public Ponto2D(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public double getCoordenadaX() {
		return this.coordenadaX;
	}

	public double getCoordenadaY() {
		return this.coordenadaY;
	}
	
	@Override
	public String toString() {
		return "coordenada X = " + this.coordenadaX + ", coordenada Y = " + this.coordenadaY;
	}
}
