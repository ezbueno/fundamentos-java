package modulo3;

import java.text.DecimalFormat;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		Crie uma aplicação que possibilita a entrada via console de um conjunto de notas de um aluno.
		Assim que -1 for informado como nota, calcule a média das notas informadas anteriormente e
		mostre na tela. Caso a nota do aluno seja inválida, mostre uma mensagem na tela solicitando
		uma nova nota.
		A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os
		códigos-fonte deste exercício. Copie o arquivo Console.java para dentro do seu projeto e você
		poderá utilizá-la.
		Para ler uma nota do teclado, utilize o seguinte código:
		double nota = Console.readDouble();
		Após a digitação da nota seguida de ENTER, o valor digitado será armazenado na variável nota. 
		*/
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		int i = 1, qtde = 0;
		double nota = 0.0, media = 0.0, somaNotas = 0;
		
		while(true) {
			System.out.println("Digite a nota " + i + ":");
			nota = Console.readDouble();
			
			if (nota < -1 ||nota > 10) {
				System.out.println("Nota inválida!");
			} else if (nota >= 0 && nota <= 10) {
				somaNotas += nota;
				qtde++;
			} else if (nota == -1) {
				break;
			}
			i++;
		}		
		media = somaNotas / qtde;
		System.out.println("Média = " + df.format(media));
	}

}
