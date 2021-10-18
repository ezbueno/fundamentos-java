package modulo3.exercicios5.propostos;

/**
 * @author Ezandro Bueno
 * Escreva um programa que imprime na sa�da os valores assumidos por x. Esta vari�vel x deve 
 * iniciar com algum valor escolhido por voc�. Se x for par, x deve receber o valor dele mesmo 
 * somado com 5. J� se x for �mpar, x deve receber o valor dele multiplicado por 2. O programa 
 * termina assim que x for maior que 1000. 
 * Por exemplo, para x = 10, a sa�da deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635, 
 * 1270. 
 * Crie este programa usando a estrutura de controle switch.
 */

public class Exercicio5_2 {

	public static void main(String[] args) {
		int x = 10;
		
		while (x <= 1000) {
			switch (x % 2) {
			case 0:
				x += 5;
				break;
			default:
				x *= 2;
			}
			System.out.println(x);
		}
	}
}
