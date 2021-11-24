package modulo6.exercicios2.propostos;

public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Automóvel ligado");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Automóvel desligado");
	}
}
