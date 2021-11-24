package modulo6.exercicios1;

public class Ponto3D extends Ponto2D {

	private double coordenadaZ;

	public Ponto3D(double coordenadaX, double coordenadaY, double coordenadaZ) {
		super(coordenadaX, coordenadaY);
		this.coordenadaZ = coordenadaZ;
	}

	public double getCoordenadaZ() {
		return this.coordenadaZ;
	}

	@Override
	public String toString() {
		return super.toString() + ", coordenada Z = " + this.coordenadaZ;
	}
}
