package modulo3.exercicios2;

/**
 * @author Ezandro Bueno
 * 3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já 
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
