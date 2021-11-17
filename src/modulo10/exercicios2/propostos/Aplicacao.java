package modulo10.exercicios2.propostos;

public class Aplicacao {

	public static void main(String[] args) {
		
		double soma = Operacao.SOMA.calcular(7.0, 8.0);
		System.out.println(Operacao.SOMA + " -> " + soma);
		
		double subtracao = Operacao.SUBTRACAO.calcular(40.0, 20.0);
		System.out.println(Operacao.SUBTRACAO + " -> " + subtracao);
		
		double multiplicacao = Operacao.MULTIPLICACAO.calcular(9.0, 8.0);
		System.out.println(Operacao.MULTIPLICACAO + " -> " + multiplicacao);
		
		double divisao = Operacao.DIVISAO.calcular(14.0, 4.0);
		System.out.println(Operacao.DIVISAO + " -> " + divisao);
	}
}
