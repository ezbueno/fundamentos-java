package modulo12.exercicios1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ezandro Bueno
 * Crie uma aplicação que simula jogadas feitas em um tabuleiro de jogo da velha. O primeiro 
 * passo é construir o tabuleiro, que deve ser definido como um array de duas dimensões 
 * (matriz), onde cada elemento é do tipo char. Depois o tabuleiro deve ser limpo. Para isto, 
 * atribua espaços em branco às posições. 
 * Com o tabuleiro criado, é necessário definir as jogadas. As jogadas devem ser armazenadas 
 * numa coleção, de forma que a ordem de inserção das mesmas na coleção é a ordem que será 
 * utilizada para executá-las na sequência. Portanto escolha uma coleção que garanta esta regra. 
 * Cada item da coleção de jogadas é um array de três posições. A primeira indica em qual linha 
 * do tabuleiro deve ser efetuada a jogada, enquanto a segunda indica a coluna. Como o tabuleiro 
 * do jogo da velha possui tamanho 3x3, estes valores podem ir de 0 a 2. A terceira posição do 
 * array de jogadas é o elemento que deve ser inserido no tabuleiro, que pode ser ‘X’ ou ‘O’. 
 * Depois de montar a lista de jogadas, escreva um loop que itera sobre as jogadas e as realiza no 
 * tabuleiro, marcando cada elemento na posição especificada pela jogada. Por fim, escreva 
 * outro loop que imprime o tabuleiro com as jogadas realizadas.
 */
public class Aplicacao {

	private static char[][] tabuleiro = new char[3][3];
	
	public static void main(String[] args) {
		 limpar();
		
		 List<int[]> jogadas = new ArrayList<>();
		 jogadas.add(new int[] {1, 1, 'X'});
		 jogadas.add(new int[] {2, 2, 'X'});
		 jogadas.add(new int[] {2, 0, 'X'});
		 jogadas.add(new int[] {0, 2, 'O'});
		 jogadas.add(new int[] {1, 2, 'X'});
		 jogadas.add(new int[] {1, 2, 'X'});
		 jogadas.add(new int[] {1, 0, 'O'});
		 
		 for (int[] jogada : jogadas) {
			 int linha = jogada[0];
			 int coluna = jogada[1];
			 char simbolo = (char) jogada[2];
			 
			 tabuleiro[linha][coluna] = simbolo;
		 }
				
		for (int i = 0; i < tabuleiro.length; i++) {			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}		 		 
	}
	
	private static void limpar() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}
}