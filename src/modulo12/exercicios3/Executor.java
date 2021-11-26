package modulo12.exercicios3;

/**
 * @author Ezandro Bueno
 * Implemente a classe Colecao e duas subclasses: Pilha e Fila. Uma coleção tem um array de 
 * dados que fazem parte da coleção. 
 * Tanto a pilha como a fila são coleções. A diferença entre elas está na disciplina de acesso. Na 
 * pilha, o último elemento inserido é o primeiro a ser removido (como numa pilha de pratos). Na 
 * fila, o primeiro elemento inserido é o primeiro a ser removido (como numa fila de banco). 
 * Os métodos da classe Colecao responsáveis por estas operações são:
 * void inserirItem(Object item) 
 * Object removerItem() 
 */
public class Executor {

	public static void main(String[] args) {
		/* Manipula dados em uma pilha */
		Colecao c1 = new Pilha();
		manipularDados(c1);

		/* Manipula dados em uma fila */
		Colecao c2 = new Fila();
		manipularDados(c2);
	}

	/*
	 * Insere três itens na coleção e retira os três itens da coleção. Perceba a
	 * presença forte do polimorfismo: dependendo do tipo de parâmetro passado para
	 * este método, o resultado final muda.
	 */
	private static void manipularDados(Colecao c) {
		/* Insere três itens */
		c.inserirItem("A");
		c.inserirItem("B");
		c.inserirItem("C");

		/* Remove os três itens */
		String i1 = (String) c.removerItem();
		String i2 = (String) c.removerItem();
		String i3 = (String) c.removerItem();

		/* Imprime o resultado */
		System.out.print(i1 + ", " + i2 + ", " + i3);
		System.out.println();
	}
}
