package modulo5.exemplos6;

public record Quadrado(double lado) {
	
	public double calcularArea() {
		return this.lado * this.lado;
	}
}
