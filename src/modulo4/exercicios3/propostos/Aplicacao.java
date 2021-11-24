package modulo4.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * Crie classes que representam as figuras geométricas: Triangulo, Quadrado, Circunferencia
 * e Trapezio. Cada uma destas classes deve ter um método para calcular a sua área, com a 
 * seguinte assinatura: double calcularArea(). 
 * Note que o método calcularArea() não recebe parâmetros. Portanto, todos os dados 
 * necessários devem ser armazenados no objeto da classe em forma de atributos para depois 
 * serem utilizados pelo método.
 */
public class Aplicacao {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		triangulo.base = 2.5;
		triangulo.altura = 4;
		
		System.out.println("Área do triângulo: " + triangulo.calcularArea());
		
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 3.2;
		
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.raio = 5;
		
		System.out.println("Área da circunferência: " + circunferencia.calcularArea());
		
		Trapezio trapezio = new Trapezio();
		trapezio.baseMaior = 7.1;
		trapezio.baseMenor = 3.6;
		trapezio.altura = 2;
		
		System.out.println("Área do trapézio: " + trapezio.calcularArea());
	}
}
