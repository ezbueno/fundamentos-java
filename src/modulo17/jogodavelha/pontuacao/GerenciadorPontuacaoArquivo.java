package modulo17.jogodavelha.pontuacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorPontuacaoArquivo implements GerenciadorPontuacao {

	private static final String ARQUIVO_PONTUACAO = "pontuacao.txt";
	private Map<String, Integer> pontuacaoMap = new HashMap<>();

	public GerenciadorPontuacaoArquivo() throws PontuacaoException {
		this.inicializar();
	}

	private void inicializar() throws PontuacaoException {
		File arquivo = new File(ARQUIVO_PONTUACAO);

		if (!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				throw new PontuacaoException(e.getMessage());
			}
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
			String line;

			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split("\\|");
				this.pontuacaoMap.put(tokens[0].toUpperCase(), Integer.parseInt(tokens[1]));
			}
		} catch (IOException e) {
			throw new PontuacaoException(e.getMessage());
		}
	}

	@Override
	public Integer getPontuacao(String nome) {
		return this.pontuacaoMap.get(nome.toUpperCase());
	}

	@Override
	public void gravarPontuacao(String nome) throws PontuacaoException {
		Integer pontuacao = this.getPontuacao(nome);

		if (pontuacao == null) {
			pontuacao = 0;
		}

		this.pontuacaoMap.put(nome.toUpperCase(), pontuacao + 1);

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_PONTUACAO))) {
			for (Map.Entry<String, Integer> entry : this.pontuacaoMap.entrySet()) {
				writer.write(entry.getKey() + "|" + entry.getValue());
				writer.newLine();
			}
		} catch (IOException e) {
			throw new PontuacaoException(e.getMessage());
		}
	}
}
