package modulo3.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * O c�lculo do fatorial de um n�mero (!) segue a seguinte regra: 
 * 0! = 1
 * 1! = 0! x 1
 * 2! = 1! x 2
 * ... 
 * n! = (n - 1)! x n
 * Escreva uma aplica��o que efetua o c�lculo do fatorial utilizando a forma iterativa (usando 
 * estruturas de repeti��o).
 */
public class Exercicio_3_1 {
	
	public static void main(String[] args) {
		int num = 0;
		int fatorial = 1;
		
		for (int i = num; i > 1; i--) {
			fatorial *= i;
		}		
		System.out.println(num + "! = " + fatorial);
	}
}
