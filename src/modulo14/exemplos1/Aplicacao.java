package modulo14.exemplos1;

public class Aplicacao {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		c.start();
		
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
