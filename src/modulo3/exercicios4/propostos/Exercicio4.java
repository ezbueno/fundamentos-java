package modulo3.exercicios4.propostos;

/**
 * @author Ezandro Bueno
 * Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci tem os 
 * seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo 
 * elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado 
 * ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
 */
public class Exercicio4 {
	
	public static void main(String[] args) {
		int cont = 1;
		int i = 0;
		int j = 1;
		
		while(cont <= 15) {
			System.out.print(i + " ");
			i += j;
			j = i - j;
			cont++;
		}
	}
}
