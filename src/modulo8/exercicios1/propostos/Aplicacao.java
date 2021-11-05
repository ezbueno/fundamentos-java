package modulo8.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe ContaBancaria que possui um saldo como atributo e os métodos 
 * sacar(double), depositar(double) e transferir(double, ContaBancaria). Crie também 
 * duas checked exceptions: ValorInvalidoException e SaldoInsuficienteException. 
 * A exceção ValorInvalidoException deve ser lançada se o valor utilizado nas operações de 
 * depósito, saque ou transferência for igual ou inferior a 0. Já a exceção 
 * SaldoInsuficienteException deve ser lançada se o valor de um saque ou transferência for 
 * superior ao saldo disponível. No construtor de ValorInvalidoException é necessário 
 * fornecer uma mensagem de erro e o valor inválido utilizado. E no construtor de 
 * SaldoInsuficienteException é necessário fornecer uma mensagem de erro e também o 
 * saldo disponível. 
 * Crie uma classe que instancia duas contas e tenta realizar operações de depósito, saque e 
 * transferência. Faça transações corretas e também transações que geram exceções. Quando a 
 * transação gerar exceção, faça um catch da mesma, imprima a mensagem de erro e o valor 
 * inválido utilizado (para ValorInvalidoException) ou o saldo disponível (para 
 * SaldoInsuficienteException).
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
				
		try {
			c1.depositar(100);
			System.out.println("Depósito de 100 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		}
		
		try {
			c1.depositar(-10);
			System.out.println("Depósito de -10 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		}
		
		try {
			c1.sacar(30);
			System.out.println("Saque de 30 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(90);
			System.out.println("Saque de 90 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.sacar(-5);
			System.out.println("Saque de -5 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transferência de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			c1.transferir(50, c2);
			System.out.println("Transferência de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
	}
}
