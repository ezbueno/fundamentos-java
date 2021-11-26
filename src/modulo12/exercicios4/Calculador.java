package modulo12.exercicios4;

/**
 * @author Ezandro Bueno
 * Crie a classe Figura que representa figuras geométricas, representadas pelas classes 
 * Quadrado e Retangulo. Uma figura pode ter sua área calculada a partir do método 
 * calcularArea(), que retorna a área calculada da figura em forma de um double.
 * Crie também a classe FiguraComplexa. Uma figura complexa é também uma figura, mas a 
 * diferença é que ela é composta por várias figuras (quadrados, retângulos ou até outras figuras 
 * complexas). Para calcular a área de uma figura complexa, basta somar a área de todas as 
 * figuras que a compõem. 
 * Para executar a aplicação, crie a classe Calculador, que é responsável por criar uma figura 
 * complexa e calcular a sua área. Esta figura deve ser composta por:
 * 1 quadrado com 3 de lado
 * 1 quadrado com 10 de lado
 * 1 retângulo com lados 2 e 7
 * 1 retângulo com lados 5 e 3
 * Dica: Perceba a diferença entre uma classe ser uma figura e ter uma ou mais figuras. A 
 * primeira relação é de herança, enquanto a segunda implica em uma composição.
 */
public class Calculador {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		
		Figura[] figuras = new Figura[] {q1, q2, r1, r2};
		
		FiguraComplexa figuraComplexa = new FiguraComplexa(figuras);
		
		double area = figuraComplexa.calcularArea();
		
		System.out.println("Área da figura: " + area);
	}
}
