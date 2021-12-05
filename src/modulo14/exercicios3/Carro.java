package modulo14.exercicios3;

import java.util.Random;

public class Carro extends Thread {

	private static Random random = new Random();
	private int id;
	private Semaforo semaforo;

	public Carro(int id, Semaforo semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(random.nextInt(3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.mostrarMensagem("Chegou ao semáforo");
			this.semaforo.atravessar(this);
			this.mostrarMensagem("Passou pelo semáforo");
		}
	}

	public void mostrarMensagem(String mensagem) {
		System.out.println(String.format("[Carro %02d] %s", this.id, mensagem));
	}
}
