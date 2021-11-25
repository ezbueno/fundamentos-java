package modulo12.exemplos9;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

	private int id;
	private String descricao;
	private double preco;

	public Produto(int id, String descricao, double preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return this.id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public double getPreco() {
		return this.preco;
	}

	@Override
	public String toString() {
		return this.id + ", " + this.descricao + ", " + this.preco;
	}

	@Override
	public int compareTo(Produto p) {
		if (this.preco == p.preco) {
			return 0;
		}

		if (this.preco > p.preco) {
			return 1;
		}
		
		return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id;
	}
}
