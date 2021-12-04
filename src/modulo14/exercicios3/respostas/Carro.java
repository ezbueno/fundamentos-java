package modulo14.exercicios3.respostas;

import java.util.Random;


public class Carro extends Thread {
	// Gerador de n�meros rand�micos. � est�tico para ser compartilhado entre todos os carros.
	private static Random random = new Random();
	
	// ID do carro
	private int id;
	
	// Sem�foro por onde o carro vai passar
	private Semaforo semaforo;
	
	// Construtor.
	public Carro(int id, Semaforo semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		// Loop infinito
		while (true) {
			try {
				// Aguarda entre 0 e 2999 milissegundos
				Thread.sleep(random.nextInt(3000));
			} catch (InterruptedException e) {
			}
			
			// Avisa que chegou no sem�foro
			mostrarMensagem("Chegou ao sem�foro");
			
			// Tenta passar pelo sem�foro. Se n�o conseguir, ficar� bloqueado.
			semaforo.atravessar(this);
			
			// Avisa que passou pelo sem�foro
			mostrarMensagem("Passou pelo sem�foro");
		}
	}
	
	// Mostra uma mensagem para o carro
	public void mostrarMensagem(String mensagem) {
		// Identifica o carro com o seu ID
		System.out.println(String.format("[Carro %02d] %s", id, mensagem));
	}
}
