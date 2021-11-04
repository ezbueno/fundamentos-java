package modulo8.exemplos3;

public class Aplicacao {

	public static void main(String[] args) {

		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(300);
			System.out.println("Saque foi realizado com sucesso");
		} catch (ValorNegativoException e) {
			System.out.println("Valor negativo");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente");
		} finally {
			System.out.println(c.getSaldo());
		}
	}
}
