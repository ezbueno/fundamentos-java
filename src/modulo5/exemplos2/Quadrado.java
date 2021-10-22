package modulo5.exemplos2;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return this.lado * this.lado;
	}
}
