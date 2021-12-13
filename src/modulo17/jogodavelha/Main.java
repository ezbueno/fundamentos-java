package modulo17.jogodavelha;

import modulo17.jogodavelha.pontuacao.PontuacaoException;

public class Main {

	public static void main(String[] args) throws JogoDaVelhaException, PontuacaoException {
		Jogo jogo = new Jogo();
		jogo.jogar();
	}
}
