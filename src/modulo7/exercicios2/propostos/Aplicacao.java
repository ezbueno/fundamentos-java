package modulo7.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe ContaBancaria, que representa uma conta banc�ria gen�rica e n�o pode ser 
 * instanciada. Esta classe deve ter um atributo saldo (vis�vel apenas para ela e para as suas 
 * subclasses) e os m�todos depositar(double), sacar(double) e transferir(double, 
 * ContaBancaria). Estes m�todos devem depositar um valor na conta, sacar um valor da conta 
 * e transferir um valor da conta de origem para uma conta de destino, respectivamente. 
 * Al�m destes, ContaBancaria deve ter um m�todo calcularSaldo(). Este m�todo possui a 
 * regra do c�lculo do saldo final (que pode ser diferente do saldo armazenado no atributo 
 * saldo) e deve ser obrigatoriamente implementado pelas subclasses de ContaBancaria, pois 
 * cada classe possui suas pr�prias regras de c�lculo.
 * Crie duas subclasses de ContaBancaria: ContaCorrente e ContaInvestimento. Cada uma 
 * dever� implementar suas regras para calcular o saldo (m�todo calcularSaldo()). No caso 
 * de ContaCorrente, o saldo final � o saldo atual subtra�do de 10%, referente a impostos que 
 * devem ser pagos. J� para a ContaInvestimento, o saldo final � o saldo atual acrescido de 5%, 
 * referente aos rendimentos do dinheiro investido. 
 * Crie uma aplica��o que instancia uma conta corrente e uma conta investimento e executa as 
 * opera��es de dep�sito, saque, transfer�ncia e c�lculo de saldo. Verifique se os resultados 
 * obtidos s�o consistentes com a proposta do modelo e com as regras de c�lculo estabelecidas. 
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
