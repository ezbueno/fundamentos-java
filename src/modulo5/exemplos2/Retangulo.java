package modulo5.exemplos2;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo() {
		this(4D, 3D);
	}
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return this.largura * this.altura;
	}
}
