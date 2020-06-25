package modulo3;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente.
		Escreva um programa que imprima a média do aluno. 
		*/
		
		double nota1 = 8.5, nota2 = 7.5, nota3 = 6.0;
		int pesoNota1 = 3, pesoNota2 = 2, pesoNota3 = 5;
		
		double media = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / (pesoNota1 + pesoNota2 + pesoNota3);
		
		System.out.println("Média do aluno: " + media);

	}

}
