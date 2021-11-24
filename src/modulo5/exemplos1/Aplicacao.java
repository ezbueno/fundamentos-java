package modulo5.exemplos1;

public class Aplicacao {

	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		c.setNumConta(54334);
		c.setAtiva(true);
		
		c.depositar(1000D);
		c.sacar(200D);
		
		System.out.println("Número da conta: " + c.getNumConta());
		System.out.println("Ativa: " + c.isAtiva());
		System.out.println("Saldo: " + c.getSaldo());
	}
}
