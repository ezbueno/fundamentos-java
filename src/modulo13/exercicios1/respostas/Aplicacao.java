package modulo13.exercicios1.respostas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	// Constante para o arquivo da lista
	private static final String LIST_FILE = "lista.txt";

	public static void main(String[] args) throws IOException {

		// L� os registros j� cadastrados na lista (caso existam)
		List<String> lista = readFile();

		// Se a vari�vel lista tiver itens, significa que itens j� haviam sido cadastrados
		if (lista != null && lista.size() > 0) {
			System.out.println("Estes s�o os itens j� cadastrados: ");

			for (String item : lista) {
				System.out.println("=> " + item);
			}
		}

		// Cria um scanner, capaz de ler informa��es via teclado
		Scanner keyboard = new Scanner(System.in);

		PrintWriter writer = null;
		try {
			// Cria um PrintWriter, usado para escrever no arquivo de sa�da (lista.txt)
			writer = new PrintWriter(new FileWriter(LIST_FILE, true));
			
			// Loop
			while (true) {
				// Solicita um novo item pelo teclado
				System.out.print("Insira um novo item: ");
				String item = keyboard.nextLine();
				
				// Se um item vazio foi inserido, volta para o in�cio do loop (desconsidera o que 
				// foi digitado)
				if (item.trim().length() == 0) {
					continue;
				}
				
				// Se o item digitado foi 0, termina o programa (sai do loop)
				if (item.equals("0")) {
					System.out.println("Fim da execu��o");
					break;
				}
				
				// Grava o item digitado no arquivo de sa�da, com uma quebra de linha no fim
				writer.println(item);
			}
		} finally {
			// Fecha o PrintWriter
			if (writer != null) {
				writer.close();
			}
			
			// Fecha o Scanner
			keyboard.close();
		}
	}

	// Este m�todo l� os itens cadastrados no arquivo para uma lista
	private static List<String> readFile() throws IOException {
		File file = new File(LIST_FILE);
		
		// Verifica se o arquivo existe. Se n�o existe, retorna null
		if (!file.exists()) {
			return null;
		}

		// Cria a lista onde ser�o adicionados os itens
		List<String> lista = new ArrayList<String>();
		
		BufferedReader reader = null;
		try {
			// BufferedReader para ler os dados do arquivo
			reader = new BufferedReader(new FileReader(file));

			String line;
			
			// Fica em loop enquanto houver linhas no arquivo para ler
			while ((line = reader.readLine()) != null) {
				// Adiciona a linha na lista. Remove os espa�os em branco da linha (caso haja)
				lista.add(line.trim());
			}

			// Retorna a lista
			return lista;
		} finally {
			// Fecha o BufferedReader
			if (reader != null) {
				reader.close();
			}
		}
	}
}
