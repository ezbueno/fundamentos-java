package modulo8.exemplos5;

public class Aplicacao {

	public static void main(String[] args) {
		
		Pista p = new Pista();
		
		try {
			p.iniciar();
		} catch (PistaException e) {
			e.printStackTrace();
		}
	}
}
