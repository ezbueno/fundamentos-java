package modulo3.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * 3. Come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j� 
 * impressos for menor que 100.
 */

public class Exercicio2_3 {

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 0; i < 100; i++) {			
			soma += i;
			
			if (soma < 100) {
				System.out.println(i);
			}
		}
	}
}
