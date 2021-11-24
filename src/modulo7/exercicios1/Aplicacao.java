package modulo7.exercicios1;

/**
 * @author Ezandro Bueno
 * Crie uma interface AreaCalculavel com um método calcularArea() e crie classes de 
 * figuras geométricas que implementam este método (como quadrado, circunferência e 
 * retângulo). Depois crie uma classe com um método main() para exercitar as chamadas aos 
 * métodos que calculam a área. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		double area;
		
		AreaCalculavel quadrado = new Quadrado(2);
		area = quadrado.calcularArea();
		System.out.println("Área do quadrado de lado 2: " + area);
		
		AreaCalculavel circunferencia = new Circunferencia(3);
		area = circunferencia.calcularArea();
		System.out.println("Área da circunferência de raio 3: " + area);
		
		AreaCalculavel retangulo = new Retangulo(3, 2);
		area = retangulo.calcularArea();
		System.out.println("Área de um retângulo de lados 3 e 2: " + area);
	}
}
