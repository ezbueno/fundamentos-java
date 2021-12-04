package modulo14.exemplos5;

public class Aplicacao {

	public static void main(String[] args) throws InterruptedException {

		ContaBancaria contaBancaria = new ContaBancaria();

		Pessoa p1 = new Pessoa(contaBancaria);
		Pessoa p2 = new Pessoa(contaBancaria);

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println("Saldo = " + contaBancaria.getSaldo());
	}
}
