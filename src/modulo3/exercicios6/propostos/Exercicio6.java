package modulo3.exercicios6.propostos;

/**
 * @author Ezandro Bueno
 * Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou 
 * inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês 
 * e outra para o ano. Considere que fevereiro pode ter somente 28 dias.
 */
public class Exercicio6 {
	
	private static final String DATA_VALIDA = "Data válida!";
	private static final String DATA_INVALIDA = "Data inválida!";
	
	public static void main(String[] args) {
		int dia = 30;
		int mes = 7;
		int ano = 1983;
		
		if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900 || ano > 2999) {
			System.out.println(DATA_INVALIDA);
		} else if ((dia <= 31) && (mes <= 12)) {
			if (((dia > 28) && (mes == 2)) 
					|| ((dia == 31) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)))) {					
				System.out.println(DATA_INVALIDA);
			} else {				
				System.out.println(DATA_VALIDA);
			} 
		} else {
			System.out.println(DATA_INVALIDA);
		}
	}
}
