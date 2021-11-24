package modulo3.exercicios5.propostos;

/**
 * @author Ezandro Bueno
 * Escreva um programa que imprime na saída os valores assumidos por x. Esta variável x deve 
 * iniciar com algum valor escolhido por você. Se x for par, x deve receber o valor dele mesmo 
 * somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa 
 * termina assim que x for maior que 1000. 
 * Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635, 
 * 1270. 
 * Crie este programa primeiro usando a estrutura de controle if-else.
 */
public class Exercicio5_1 {

	public static void main(String[] args) {
		int x = 10;
		
		while (x <= 1000) {
			if (x % 2 == 0) {
				x += 5;
			} else {
				x *= 2;			
			}
			System.out.println(x);
		}
	}
}
