package modulo3.exercicios7.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma aplica��o que possibilita a entrada via console de um conjunto de notas de um aluno. 
 * Assim que -1 for informado como nota, calcule a m�dia das notas informadas anteriormente e 
 * mostre na tela. Caso a nota do aluno seja inv�lida, mostre uma mensagem na tela solicitando 
 * uma nova nota. 
 * A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os 
 * c�digos-fonte deste exerc�cio. Copie o arquivo Console.java para dentro do seu projeto e voc� 
 * poder� utiliz�-la. 
 * Para ler uma nota do teclado, utilize o seguinte c�digo:
 * double nota = Console.readDouble();
 * Ap�s a digita��o da nota seguida de ENTER, o valor digitado ser� armazenado na vari�vel nota.
 */
public class Exercicio7 {
		
	public static void main(String[] args) {
		int i = 1;
		int cont = 0;
		double nota;
		double soma = 0.0;
		
		do {
			System.out.print("Nota " + i + ": ");
			nota = Console.readDouble();
			
			if (nota >= 0 && nota <= 10) {
				soma += nota;
				cont++;
			} else if (nota > 10) {
				System.out.println("Nota inv�lida!");
			}			
			i++;			
		} while (nota != -1);				
		
		if (cont != 0) {
			double media = soma / cont;
			System.out.println("M�dia: " + media);
		}		
		System.out.println("Fim do programa!");
	}
}
