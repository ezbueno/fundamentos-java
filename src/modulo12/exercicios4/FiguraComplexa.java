package modulo12.exercicios4;

public class FiguraComplexa extends Figura {

	private Figura[] figuras;

	public FiguraComplexa(Figura[] figuras) {
		this.figuras = figuras;
	}

	@Override
	public double calcularArea() {
		double areaTotal = 0.0;

		for (Figura figura : this.figuras) {
			areaTotal += figura.calcularArea();
		}
		return areaTotal;
	}
}
