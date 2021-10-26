package modulo6.exemplos1;

public class Carro extends Veiculo {

	private boolean quatroPortas;
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Quatro portas: " + this.quatroPortas);
	}

	public boolean isQuatroPortas() {
		return this.quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
}
