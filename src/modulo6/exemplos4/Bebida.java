package modulo6.exemplos4;

public class Bebida {

	private String nome;
	private boolean aquecer;

	public Bebida(String nome, boolean aquecer) {
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() {
	}

	public String getNome() {
		return this.nome;
	}

	public boolean isAquecer() {
		return this.aquecer;
	}
}
