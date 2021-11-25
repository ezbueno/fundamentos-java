package modulo12.exercicios3;

/*
 * Coleção de dados do tipo fila. Na fila, o primeiro elemento a ser adicionado é o primeiro a ser removido.
 */
public class Fila extends Colecao {

	/* Posição onde o próximo elemento deve ser inserido */
	protected int posInserir;
	
	/* Posição onde o próximo elemento deve ser removido */
	protected int posRemover;
	
	public Fila() {
		super();
	}

	public Fila(int tamanho) {
		super(tamanho);
	}
	
	/* Insere um item na próxima posição de inserção */
	@Override
	public void inserirItem(Object item) {
		this.itens[this.posInserir] = item;
		this.posInserir++;
	}

	/* Remove o item da posição de remoção */
	@Override
	public Object removerItem() {
		Object item = this.itens[this.posRemover];
		this.itens[this.posRemover] = null;
		this.posRemover++;
		return item;
	}
}
