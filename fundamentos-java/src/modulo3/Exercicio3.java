package modulo3;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		Escreva uma aplicação que efetua o cálculo do fatorial utilizando a forma iterativa (usando
		estruturas de repetição) e outra que efetua o mesmo cálculo, mas de forma recursiva (o
		método de cálculo do fatorial chama ele mesmo)
		 */
		
		// Cálculo do fatorial utilizando a forma iterativa
		
		int n = 6, fat = 1;
		
		for (int i = n; i > 0; i--) {
			fat *= i;
		}
		System.out.println("6! = " + fat);
		
		// Cálculo do fatorial utilizando a forma recursiva
		int num = 6, fatorial;
		fatorial = calcularFatorial(num);
		
		System.out.println("6! = " + fatorial);
	}
	
	public static int calcularFatorial(int numero) {
		if (numero == 0) {
			return 1;
		}
		return numero * calcularFatorial(numero - 1);
	}
}
