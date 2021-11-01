package modulo7.exemplos3;

public class Aplicacao {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();		
		Porsche p = new Porsche();
		
		f.derrapar();
		p.derrapar();
		
		System.out.println("Velocidade máxima: " + Automovel.getVelocidadeMaxima());
	}
}
