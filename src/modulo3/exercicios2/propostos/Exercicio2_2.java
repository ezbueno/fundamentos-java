package modulo3.exercicios2.propostos;

/**
 * @author Ezandro Bueno 
 * 2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
 */

public class Exercicio2_2 {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 1; i <= 100; i += 2) {
			soma += i;
		}
		System.out.println(soma);
	}
}
