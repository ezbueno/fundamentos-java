package modulo12.exemplos7;

public class Produto {

	private int id;
	private String descricao;

	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return this.id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return this.id + ", " + this.descricao;
	}
}
