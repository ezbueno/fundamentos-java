package modulo12.exercicios3;

/*
 * Coleção de dados do tipo pilha. Na pilha, o último elemento a ser adicionado é o primeiro a ser removido.
 */
public class Pilha extends Colecao {
	
	/* Posição do elemento que está no topo da pilha */
	protected int posAtual;
	
	public Pilha() {
		super();
	}

	public Pilha(int tamanho) {
		super(tamanho);
	}
	
	/* Insere um item na coleção */
	@Override
	public void inserirItem(Object item) {
		this.itens[this.posAtual] = item;
		this.posAtual++;
	}

	/* Remove o último elemento adicionado na coleção */
	@Override
	public Object removerItem() {
		this.posAtual--;
		Object item = this.itens[this.posAtual];
		this.itens[this.posAtual] = null;
		return item;
	}
}
