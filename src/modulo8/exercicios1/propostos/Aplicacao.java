package modulo8.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe ContaBancaria que possui um saldo como atributo e os m�todos 
 * sacar(double), depositar(double) e transferir(double, ContaBancaria). Crie tamb�m 
 * duas checked exceptions: ValorInvalidoException e SaldoInsuficienteException. 
 * A exce��o ValorInvalidoException deve ser lan�ada se o valor utilizado nas opera��es de 
 * dep�sito, saque ou transfer�ncia for igual ou inferior a 0. J� a exce��o 
 * SaldoInsuficienteException deve ser lan�ada se o valor de um saque ou transfer�ncia for 
 * superior ao saldo dispon�vel. No construtor de ValorInvalidoException � necess�rio 
 * fornecer uma mensagem de erro e o valor inv�lido utilizado. E no construtor de 
 * SaldoInsuficienteException � necess�rio fornecer uma mensagem de erro e tamb�m o 
 * saldo dispon�vel. 
 * Crie uma classe que instancia duas contas e tenta realizar opera��es de dep�sito, saque e 
 * transfer�ncia. Fa�a transa��es corretas e tamb�m transa��es que geram exce��es. Quando a 
 * transa��o gerar exce��o, fa�a um catch da mesma, imprima a mensagem de erro e o valor 
 * inv�lido utilizado (para ValorInvalidoException) ou o saldo dispon�vel (para 
 * SaldoInsuficienteException).
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
				
		try {
			c1.depositar(100);
			System.out.println("Dep�sito de 100 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		}
		
		try {
			c1.depositar(-10);
			System.out.println("Dep�sito de -10 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		}
		
		try {
			c1.sacar(30);
			System.out.println("Saque de 30 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(90);
			System.out.println("Saque de 90 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(-5);
			System.out.println("Saque de -5 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transfer�ncia de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transfer�ncia de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inv�lido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo dispon�vel: " + e.getSaldoDisponivel());
		}
	}
}
