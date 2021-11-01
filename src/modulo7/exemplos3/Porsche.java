package modulo7.exemplos3;

public class Porsche implements Automovel {

	@Override
	public void acelerar() {
		System.out.println("Porsche acelerou");
	}

	@Override
	public void frear() {
		System.out.println("Porsche freou");
	}
}
