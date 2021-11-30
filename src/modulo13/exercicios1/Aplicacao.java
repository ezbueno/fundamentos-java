package modulo13.exercicios1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Escreva uma aplicação para gerenciar itens de uma lista de compras. Ela deve funcionar da 
 * seguinte forma. 
 * Quando executada, a aplicação deve solicitar que o usuário escreva o nome de um item e 
 * pressione ENTER. Quando fizer isto, este item deve ser armazenado num arquivo lista.txt. A 
 * aplicação fica em loop solicitando um item após o outro, até o momento que o usuário digitar o 
 * item “0”. Quando ele fizer isto, a aplicação termina. Outro detalhe é que não deve ser permitido 
 * que o usuário insira itens vazios (como, por exemplo, só espaços em branco ou apenas um 
 * ENTER). Nestes casos, a aplicação deve desconsiderar o item e solicitar o próximo. 
 * Mais um requisito da aplicação é que, quando aberta, ela deve verificar se o arquivo lista.txt
 * existe e se possui itens cadastrados. Caso isto seja verdadeiro, antes de solicitar a entrada de 
 * novos itens, os itens já cadastrados devem ser mostrados na tela. Quando o usuário adicionar 
 * novos itens, os itens já cadastrados não devem ser apagados (os novos devem ser adicionados 
 * no fim do arquivo). 
 * Dica: Para ler os dados do teclado, experimente utilizar o Scanner (lembre-se de que o 
 * System.in é a input stream padrão que lê os dados do teclado). Para ler e escrever em 
 * arquivos, FileReader e FileWriter podem facilitar o processo. A classe PrintWriter pode 
 * ser utilizada em conjunto com o FileWriter para facilitar ainda mais a escrita de strings 
 * diretamente no arquivo com quebras de linha no final. 
 */
public class Aplicacao {

	public static void main(String[] args) throws IOException {

		String item = "";
		String line = "";
		
		try (FileReader fr = new FileReader("lista.txt")) {
			BufferedReader br = new BufferedReader(fr);
			
			if ((line = br.readLine()) == null) {
				System.out.println("Não há itens cadastrados na lista!");
			} else {
				System.out.println("Itens cadastrados na lista:");
				while (line != null) {
					System.out.println("=> " + line);
					line = br.readLine();
				}
			}
		}
		
		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("lista.txt", true);
				PrintWriter pr = new PrintWriter(fw)) {
			
			while (true) {
				System.out.println("Informe o nome do item:");
				item = sc.nextLine();

				if (!item.isBlank() && !item.equals("0")) {
					pr.println(item.trim());
				}

				if (item.equals("0")) {
					System.out.println("Fim do programa!");
					break;
				}
			}
		}
	}
}
 