package modulo7.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma interface AreaCalculavel com um m�todo calcularArea() e crie classes de 
 * figuras geom�tricas que implementam este m�todo (como quadrado, circunfer�ncia e 
 * ret�ngulo). Depois crie uma classe com um m�todo main() para exercitar as chamadas aos 
 * m�todos que calculam a �rea. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		double area;
		
		AreaCalculavel quadrado = new Quadrado(2);
		area = quadrado.calcularArea();
		System.out.println("�rea do quadrado de lado 2: " + area);
		
		AreaCalculavel circunferencia = new Circunferencia(3);
		area = circunferencia.calcularArea();
		System.out.println("�rea da circunfer�ncia de raio 3: " + area);
		
		AreaCalculavel retangulo = new Retangulo(3, 2);
		area = retangulo.calcularArea();
		System.out.println("�rea de um ret�ngulo de lados 3 e 2: " + area);
	}
}
