package modulo12.exercicios3;

public class Colecao {

	protected Object[] itens;
	
	public Colecao(int tamanho) {
		this.itens = new Object[tamanho];
	}
	
	public Colecao() {
		this(10);
	}
	
	public void inserirItem(Object item) {
	}
	
	public Object removerItem() {
		return null;
	}
}
