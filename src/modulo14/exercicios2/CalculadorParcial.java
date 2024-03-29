package modulo14.exercicios2;

public class CalculadorParcial extends Thread {

	private int id;
	private double[] parciais;

	public CalculadorParcial(int id, double[] parciais) {
		this.id = id;
		this.parciais = parciais;
	}

	@Override
	public void run() {
		double soma = 0.0;

		for (int i = this.id; i < Calculador.NUM_ITERACOES; i += Calculador.NUM_THREADS) {
			int s;

			if (i % 2 == 0) {
				s = 1;
			} else {
				s = -1;
			}

			soma += (double) s / (2 * i + 1);
			this.parciais[this.id] = soma;
		}
	}
}
