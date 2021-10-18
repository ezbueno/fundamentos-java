package modulo3.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * O cálculo do fatorial de um número (!) segue a seguinte regra: 
 * 0! = 1
 * 1! = 0! x 1
 * 2! = 1! x 2
 * ... 
 * n! = (n - 1)! x n
 * Escreva uma aplicação que efetua o cálculo do fatorial utilizando a forma recursiva (o 
 * método de cálculo do fatorial chama ele mesmo). 
 */

public class Exercicio_3_2 {
	
	public static void main(String[] args) {
		System.out.println(calcularFatorial(6));
	}
	
	private static int calcularFatorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * calcularFatorial(num - 1);
	}
}
