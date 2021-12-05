package modulo14.exercicios3;

public class Semaforo extends Thread {

	private static final int TEMPO_SEMAFORO = 3000;

	private enum Cor {
		VERDE, VERMELHA
	}

	private Cor cor = Cor.VERMELHA;

	@Override
	public void run() {
		while (true) {
			this.mudarCor();

			try {
				Thread.sleep(TEMPO_SEMAFORO);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void atravessar(Carro carro) {
		while (this.cor == Cor.VERMELHA) {
			carro.mostrarMensagem("Está aguardando no semáforo");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void mudarCor() {
		if (this.cor == Cor.VERDE) {
			this.cor = Cor.VERMELHA;
		} else {
			this.cor = Cor.VERDE;
			this.notifyAll();
		}
		System.out.println("Cor do semáforo: " + this.cor);
	}
}
