package modulo3;

public class Exercicio6 {

	public static void main(String[] args) {
		
		/*
		 Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou
		 inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês
		 e outra para o ano. Considere que fevereiro pode ter somente 28 dias. 
		 */
		
		int dia = 30, mes = 7, ano = 1983;
		
		if (dia > 0 && dia <=31 && mes > 0 && mes <= 12 && ano > 1900 && ano <= 2999) {
			if (dia >= 31 && mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				System.out.println("A data é inválida!");
			} else if (dia > 28 && mes == 2) {
				System.out.println("A data é inválida!");
			} else {
				System.out.println("A data é válida!");
			}
		} else {
			System.out.println("A data é inválida!");
		}
	}
}
