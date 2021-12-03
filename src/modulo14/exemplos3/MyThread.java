package modulo14.exemplos3;

public class MyThread extends Thread {

	private Contador contador;
	
	public MyThread(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			this.contador.incrementar();
		}
	}
}
