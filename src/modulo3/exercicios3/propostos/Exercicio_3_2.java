package modulo3.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * O c�lculo do fatorial de um n�mero (!) segue a seguinte regra: 
 * 0! = 1
 * 1! = 0! x 1
 * 2! = 1! x 2
 * ... 
 * n! = (n - 1)! x n
 * Escreva uma aplica��o que efetua o c�lculo do fatorial utilizando a forma recursiva (o 
 * m�todo de c�lculo do fatorial chama ele mesmo). 
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
