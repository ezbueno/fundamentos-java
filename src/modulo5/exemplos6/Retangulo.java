package modulo5.exemplos6;

public record Retangulo(double largura, double altura) {
	
	public Retangulo() {
		this(4D, 3D);
	}
	
	public double calcularArea() {
		return this.largura * this.altura;
	}
	
	public static Retangulo criar(double lado) {
		return new Retangulo(lado, lado);
	}
}
