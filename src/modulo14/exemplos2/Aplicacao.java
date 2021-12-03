package modulo14.exemplos2;

public class Aplicacao {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		Thread t = new Thread(c);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
