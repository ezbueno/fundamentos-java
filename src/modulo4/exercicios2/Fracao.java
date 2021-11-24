package modulo4.exercicios2;

public class Fracao {
	double numerador;
	double denominador;
	
	void armazenarValores(double numerador, double denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	double calcularValor() {
		if (this.denominador == 0) {
			return 0;
		}
		return this.numerador / this.denominador;
	}
	
	Fracao multiplicar(Fracao f) {
		Fracao fracao = new Fracao();
		fracao.numerador = this.numerador * f.numerador;
		fracao.denominador = this.denominador * f.denominador;
		return fracao;
	}
	
	String obterFracao() {
		return this.numerador + "/" + this.denominador;
	}
}
