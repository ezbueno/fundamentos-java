package modulo6.exercicios2.propostos;

public class Onibus extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("�nibus ligado");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("�nibus desligado");
	}
}
