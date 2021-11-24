package modulo9.exercicios1.propostos;

import java.time.LocalDate;

/**
 * @author Ezandro Bueno
 * Crie uma classe que representa produtos. Para cada objeto desta classe, deve ser fornecido 
 * um nome (String), peso (double) e data de validade (LocalDate). 
 * Depois disso, implemente uma aplicação que cria três produtos, cujos dados são os seguintes:
 * Nome        Peso   Data de Validade
 * Feijão      2,5    04/10/2020
 * Café        1,0    01/01/2022
 * Beterraba   0,9    12/11/2017
 * Com os produtos criados, escreva um código que exibe os dados de cada produto de uma 
 * forma tabulada e de acordo com as seguintes regras:
 * A primeira informação é um número sequencial, iniciado em 1.
 * A segunda informação é o nome do produto. Ele deve ocupar 12 caracteres. Caso seu 
 * nome tenha menos que isso, ele deve ficar alinhado à direita e os caracteres que 
 * faltam devem ser preenchidos com espaços em branco.
 * A terceira informação é o peso. Ele deve ter duas casas decimais (separadas com o 
 * uso de vírgula) e ocupar uma área de 9 caracteres. Se o número tiver menos de 9 
 * caracteres, ele deve ser preenchido com 0's à esquerda.
 */
public class Aplicacao {

	public static void main(String[] args) {
				
		LocalDate d1 = LocalDate.of(2020, 10, 4);		
		Produto p1 = new Produto("Feijão", 2.5, d1);
	
		LocalDate d2 = LocalDate.of(2022, 1, 1);			
		Produto p2 = new Produto("Café", 1.0, d2);
		
		LocalDate d3 = LocalDate.of(2017, 11, 12);		
		Produto p3 = new Produto("Beterraba", 0.9, d3);
		
		System.out.println(String.format("%d) %12s %09.2f %s", 1, p1.getNome(), p1.getPeso(), p1.getDataFormatada()));									     
		System.out.println(String.format("%d) %12s %09.2f %s", 2, p2.getNome(), p2.getPeso(), p2.getDataFormatada()));
		System.out.println(String.format("%d) %12s %09.2f %s", 3, p3.getNome(), p3.getPeso(), p3.getDataFormatada()));
	}
}
