package modulo4.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Crie a classe Fracao, que representa uma fra��o matem�tica. Esta classe deve ser capaz de 
 * armazenar o numerador e o denominador da fra��o. Ela ainda deve ter m�todos que recebem 
 * uma fra��o como par�metro, multiplicam ambas as fra��es, e retornam uma nova fra��o 
 * como resultado. 
 * Crie um programa simples que instancia duas fra��es, define seus valores, calcula o valor da 
 * multiplica��o entre elas e mostra o resultado. 
 * Dica: a multiplica��o de 2 fra��es � feita atrav�s da multiplica��o dos numeradores e dos 
 * denominadores das fra��es, e o valor resultante � uma terceira fra��o.
 */
public class Aplicacao {

	public static void main(String[] args) {
		Fracao fracao1 = new Fracao();
		fracao1.armazenarValores(5, 2);
		
		Fracao fracao2 = new Fracao();
		fracao2.armazenarValores(1, 7);

		Fracao fracao3 = new Fracao();
		fracao3 = fracao1.multiplicar(fracao2);		
				
		System.out.println(fracao3.obterFracao());
		System.out.println(fracao3.calcularValor());

	}
}
