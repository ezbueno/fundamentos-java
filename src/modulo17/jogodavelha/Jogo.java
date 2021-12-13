package modulo17.jogodavelha;

import java.util.ArrayList;
import java.util.List;

import modulo17.jogodavelha.io.Console;
import modulo17.jogodavelha.pontuacao.GerenciadorPontuacao;
import modulo17.jogodavelha.pontuacao.GerenciadorPontuacaoArquivo;
import modulo17.jogodavelha.pontuacao.PontuacaoException;

public class Jogo {

	private Tabuleiro tabuleiro = new Tabuleiro();
	private List<Jogador> jogadores = new ArrayList<>();
	private GerenciadorPontuacao gerenciadorPontuacao;

	public void jogar() throws PontuacaoException {

		System.out.println("=================");
		System.out.println("| JOGO DA VELHA |");
		System.out.println("=================");
		System.out.println();

		this.gerenciadorPontuacao = new GerenciadorPontuacaoArquivo();

		System.out.print("Nome do Jogador 1: ");
		String nome = Console.readString();
		this.jogadores.add(new Jogador(nome, 'X'));

		Integer pontuacao = this.gerenciadorPontuacao.getPontuacao(nome);

		String msg = "O jogador %s já possui %d %s!\n";

		if (pontuacao != null) {
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "vitória" : "vitórias");
		}

		System.out.print("Nome do Jogador 2: ");
		nome = Console.readString();
		this.jogadores.add(new Jogador(nome, 'O'));

		pontuacao = this.gerenciadorPontuacao.getPontuacao(nome);
		if (pontuacao != null) {
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "vitória" : "vitórias");
		}

		boolean finalizado = false;
		int indexJogadorAtual = 0;
		Jogador vencedor = null;

		while (!finalizado) {
			this.tabuleiro.imprimir();

			Jogador jogador = this.jogadores.get(indexJogadorAtual);

			System.out.print("Jogador '" + jogador.getNome() + "' => ");

			boolean sequenciaEncontrada;
			try {
				Jogada jogada = jogador.obterJogada();
				sequenciaEncontrada = this.tabuleiro.efetuarJogada(jogada, jogador.getSimbolo());
			} catch (JogadaInvalidaException e) {
				System.out.println("Erro: " + e.getMessage());
				continue;
			}

			if (sequenciaEncontrada) {
				vencedor = jogador;
				finalizado = true;

			} else if (tabuleiro.isCompleto()) {
				finalizado = true;
			}

			indexJogadorAtual = (indexJogadorAtual + 1) % this.jogadores.size();
		}

		System.out.println();

		if (vencedor == null) {
			System.out.println("O jogo terminou empatado!");
		} else {
			System.out.println("O jogador '" + vencedor.getNome() + "' venceu o jogo!");
			this.gerenciadorPontuacao.gravarPontuacao(vencedor.getNome());
		}
		this.tabuleiro.imprimir();
	}
}
