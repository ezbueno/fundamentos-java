package modulo17.jogodaforca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo17.jogodaforca.utils.RandomUtils;

public class Dicionario {

	private static final String ARQUIVO_DICIONARIO = "dicionario.txt";
	private static Dicionario instance;
	private List<String> palavras = new ArrayList<>();

	private Dicionario() {
		this.carregarPalavras();
	}

	public static Dicionario getInstance() {
		if (instance == null) {
			instance = new Dicionario();
		}
		return instance;
	}

	private void carregarPalavras() {
		try (Scanner scanner = new Scanner(new File(ARQUIVO_DICIONARIO))) {

			while (scanner.hasNextLine()) {
				this.palavras.add(scanner.nextLine().trim());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Palavra proximaPalavra() throws JogoDaForcaException {
		if (this.palavras.isEmpty()) {
			throw new JogoDaForcaException("Nenhuma palavra foi encontrada");
		}

		int pos = RandomUtils.gerarNumeroRandomico(0, this.palavras.size());

		return new Palavra(this.palavras.get(pos));
	}
}
