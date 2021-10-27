package modulo6.exemplos3;

public class Aplicacao {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		
		if (a instanceof Cachorro c) {
			c.morder();
		}
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);
	}
	
	private static void falar(Animal a) {
		a.falar();
	}
}
