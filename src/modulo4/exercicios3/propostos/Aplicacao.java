package modulo4.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * Crie classes que representam as figuras geom�tricas: Triangulo, Quadrado, Circunferencia
 * e Trapezio. Cada uma destas classes deve ter um m�todo para calcular a sua �rea, com a 
 * seguinte assinatura: double calcularArea(). 
 * Note que o m�todo calcularArea() n�o recebe par�metros. Portanto, todos os dados 
 * necess�rios devem ser armazenados no objeto da classe em forma de atributos para depois 
 * serem utilizados pelo m�todo.
 */
public class Aplicacao {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		triangulo.base = 2.5;
		triangulo.altura = 4;
		
		System.out.println("�rea do tri�ngulo: " + triangulo.calcularArea());
		
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 3.2;
		
		System.out.println("�rea do quadrado: " + quadrado.calcularArea());
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.raio = 5;
		
		System.out.println("�rea da circunfer�ncia: " + circunferencia.calcularArea());
		
		Trapezio trapezio = new Trapezio();
		trapezio.baseMaior = 7.1;
		trapezio.baseMenor = 3.6;
		trapezio.altura = 2;
		
		System.out.println("�rea do trap�zio: " + trapezio.calcularArea());
	}
}
