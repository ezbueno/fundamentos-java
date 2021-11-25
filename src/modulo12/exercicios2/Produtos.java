package modulo12.exercicios2;

import java.util.Collection;

public class Produtos {

	private Collection<Produto> produtos;

	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionar(Produto produto) {
		this.produtos.add(produto);
	}

	public void imprimir() {
		System.out.println("Produtos armazenados em: " + this.produtos.getClass().getName());
		
		for (Produto produto : this.produtos) {
			System.out.println(produto);
		}
		
		System.out.println("---------------------------------------------------");
	}
	
	public void mudarColecao(Collection<Produto> produtos) {
		Collection<Produto> tipoColecao = this.produtos;
		this.produtos = produtos;
		
		this.produtos.addAll(tipoColecao);
	}
}
