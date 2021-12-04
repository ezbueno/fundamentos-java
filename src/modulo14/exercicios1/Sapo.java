package modulo14.exercicios1;

public class Sapo extends Thread {

	private static final int MAXIMO_DESCANSO = 500;
	private static final int MAXIMO_PULO = 50;
	private static Object monitor = new Object();
	private static int colocacao;

	private String nome;
	private int distanciaTotal;
	private int distanciaPercorrida;
	private int ultimoPulo;

	public Sapo(String nome, int distanciaTotal) {
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
	}

	@Override
	public void run() {
		while (this.distanciaPercorrida < this.distanciaTotal) {
			this.pular();
			this.avisarSituacao();
			this.descansar();
		}
		this.cruzarLinhaDeChegada();
	}

	private void pular() {
		this.ultimoPulo = (int) (Math.random() * MAXIMO_PULO);
		this.distanciaPercorrida += this.ultimoPulo;

		if (this.distanciaPercorrida > this.distanciaTotal) {
			this.distanciaPercorrida = this.distanciaTotal;
		}
	}

	private void descansar() {
		int tempo = (int) (Math.random() * MAXIMO_DESCANSO);

		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void avisarSituacao() {
		System.out.println(this.nome + " pulou " + this.ultimoPulo + "cm. A distância percorrida foi de "
				+ this.distanciaPercorrida + "cm.");
	}
	
	private void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println("==> " + this.nome + " cruzou a linha de chegada em " + colocacao + "o. lugar!");
		}
	}
}
