package modulo6.exercicios2;

public class Onibus extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Ônibus ligado");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Ônibus desligado");
	}
}
