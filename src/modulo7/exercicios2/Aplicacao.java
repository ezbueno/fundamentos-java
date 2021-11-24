package modulo7.exercicios2;

/**
 * @author Ezandro Bueno
 * Crie uma classe ContaBancaria, que representa uma conta bancária genérica e não pode ser 
 * instanciada. Esta classe deve ter um atributo saldo (visível apenas para ela e para as suas 
 * subclasses) e os métodos depositar(double), sacar(double) e transferir(double, 
 * ContaBancaria). Estes métodos devem depositar um valor na conta, sacar um valor da conta 
 * e transferir um valor da conta de origem para uma conta de destino, respectivamente. 
 * Além destes, ContaBancaria deve ter um método calcularSaldo(). Este método possui a 
 * regra do cálculo do saldo final (que pode ser diferente do saldo armazenado no atributo 
 * saldo) e deve ser obrigatoriamente implementado pelas subclasses de ContaBancaria, pois 
 * cada classe possui suas próprias regras de cálculo.
 * Crie duas subclasses de ContaBancaria: ContaCorrente e ContaInvestimento. Cada uma 
 * deverá implementar suas regras para calcular o saldo (método calcularSaldo()). No caso 
 * de ContaCorrente, o saldo final é o saldo atual subtraído de 10%, referente a impostos que 
 * devem ser pagos. Já para a ContaInvestimento, o saldo final é o saldo atual acrescido de 5%, 
 * referente aos rendimentos do dinheiro investido. 
 * Crie uma aplicação que instancia uma conta corrente e uma conta investimento e executa as 
 * operações de depósito, saque, transferência e cálculo de saldo. Verifique se os resultados 
 * obtidos são consistentes com a proposta do modelo e com as regras de cálculo estabelecidas. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		contaCorrente.sacar(200);
		double saldo = contaCorrente.calcularSaldo();
		System.out.println("Saldo da conta 1: " + saldo);
		
		ContaBancaria contaInvestimento = new ContaInvestimento();
		contaInvestimento.depositar(1000);
		contaInvestimento.sacar(200);
		saldo = contaInvestimento.calcularSaldo();
		System.out.println("Saldo da conta 2: " + saldo);
		
		contaCorrente.transferir(100, contaInvestimento);
		saldo = contaCorrente.calcularSaldo();
		System.out.println("Saldo da conta 1: " + saldo);
		saldo = contaInvestimento.calcularSaldo();
		System.out.println("Saldo da conta 2: " + saldo);		
	}
}
