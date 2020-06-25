package modulo3;

public class Exercicio2_2 {

	public static void main(String[] args) {
		
		/*
		Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.)
		*/
		
		int soma = 0;
		
		System.out.println("Números impressos:");
		
		for (int i = 1; i <= 100; i+=2) {
			soma += i;
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Total da soma dos números impressos: " + soma);
	}
}
