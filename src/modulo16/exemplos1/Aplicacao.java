package modulo16.exemplos1;

public class Aplicacao {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(1000);
		
		try {
			c1.sacar(200);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println(c1.getSaldo());
	}
}
