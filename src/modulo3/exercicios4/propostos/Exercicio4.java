package modulo3.exercicios4.propostos;

/**
 * @author Ezandro Bueno
 * Imprima os 15 primeiros n�meros da s�rie de Fibonacci. A s�rie de Fibonacci tem os 
 * seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calcul�-la, o primeiro e segundo 
 * elementos valem 1, e da� por diante, o n-�simo elemento vale o (n-1)-�simo elemento somado 
 * ao (n-2)-�simo elemento (ex: 8 = 5 + 3).
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
