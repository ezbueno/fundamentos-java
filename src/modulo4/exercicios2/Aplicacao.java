package modulo4.exercicios2;

/**
 * @author Ezandro Bueno
 * Crie a classe Fracao, que representa uma fração matemática. Esta classe deve ser capaz de 
 * armazenar o numerador e o denominador da fração. Ela ainda deve ter métodos que recebem 
 * uma fração como parâmetro, multiplicam ambas as frações, e retornam uma nova fração 
 * como resultado. 
 * Crie um programa simples que instancia duas frações, define seus valores, calcula o valor da 
 * multiplicação entre elas e mostra o resultado. 
 * Dica: a multiplicação de 2 frações é feita através da multiplicação dos numeradores e dos 
 * denominadores das frações, e o valor resultante é uma terceira fração.
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
