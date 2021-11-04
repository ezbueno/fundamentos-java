package modulo8.exemplos6;

public abstract class Contato {

	private String nome;
	private Endereco endereco;
	
	protected Contato() {
		this.endereco = new Endereco();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
