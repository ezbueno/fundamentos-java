package modulo13.exercicios2;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		int opcao;
		
		System.out.println("|-------------|");
		System.out.println("| 1 - Gravar  |");
		System.out.println("| 2 - Ler     |");
		System.out.println("|-------------|");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Escolha a opção desejada:");
			opcao = sc.nextInt();
			
			while (opcao <= 0 || opcao > 2) {
				System.out.println("Opção inválida!");
				System.out.println("Escolha a opção desejada:");
				opcao = sc.nextInt();
			}
		}
	}
}
