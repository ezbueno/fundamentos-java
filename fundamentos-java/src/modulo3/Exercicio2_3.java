package modulo3;

public class Exercicio2_3 {

	public static void main(String[] args) {
		
		/*
		Começando em 0, imprima os números seguintes, enquanto a soma dos números já
		impressos for menor que 100
		*/
		
		// Com o laço de repetição for
		int soma = 0;
		
		for (int i = 0; i < 100; i++) {			
			soma += i;
			if (soma > 100) {
				break;
			}
			System.out.println(i);
		}
		
		// Com o laço de repetição while
//		int num = 0, soma = 0;
//
//		while (num < 100) {
//			soma += num;
//			if (soma < 100) {
//				System.out.println(num);
//			}
//			num++;
//		}
		
	}
}
