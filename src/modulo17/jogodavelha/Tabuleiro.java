package modulo17.jogodavelha;

public class Tabuleiro {

	private char[][] matriz;

	public Tabuleiro() {
		this.matriz = new char[3][3];
		this.zerar();
	}

	public void zerar() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				this.matriz[i][j] = ' ';
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				System.out.print(this.matriz[i][j]);
				if (j < this.matriz[0].length - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();

			if (i < this.matriz.length - 1) {
				System.out.println("---------");
			}
		}
		System.out.println();
	}

	public boolean isCompleto() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz[0].length; j++) {
				if (this.matriz[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean efetuarJogada(Jogada jogada, char simbolo) throws JogadaInvalidaException {
		int i = jogada.getI();
		int j = jogada.getJ();

		if (i < 0 || j < 0 || i >= this.matriz.length || j >= this.matriz[0].length) {
			throw new JogadaInvalidaException("A jogada é inválida");
		}

		if (this.matriz[i][j] != ' ') {
			throw new JogadaInvalidaException("Esta jogada já foi realizada");
		}

		this.matriz[i][j] = simbolo;

		return this.isSequenciaEncontrada();
	}

	private boolean isSequenciaEncontrada() {
		if (this.matriz[0][0] == this.matriz[0][1] && this.matriz[0][1] == this.matriz[0][2]
				&& this.matriz[0][0] != ' ') {
			return true;
		}

		if (this.matriz[1][0] == this.matriz[1][1] && this.matriz[1][1] == this.matriz[1][2]
				&& this.matriz[1][0] != ' ') {
			return true;
		}

		if (this.matriz[2][0] == this.matriz[2][1] && this.matriz[2][1] == this.matriz[2][2]
				&& this.matriz[2][0] != ' ') {
			return true;
		}

		if (this.matriz[0][0] == this.matriz[1][0] && this.matriz[1][0] == this.matriz[2][0]
				&& this.matriz[0][0] != ' ') {
			return true;
		}

		if (this.matriz[0][1] == this.matriz[1][1] && this.matriz[1][1] == this.matriz[2][1]
				&& this.matriz[0][1] != ' ') {
			return true;
		}

		if (this.matriz[0][2] == this.matriz[1][2] && this.matriz[1][2] == this.matriz[2][2]
				&& this.matriz[0][2] != ' ') {
			return true;
		}

		if (this.matriz[0][0] == this.matriz[1][1] && this.matriz[1][1] == this.matriz[2][2]
				&& this.matriz[0][0] != ' ') {
			return true;
		}

		if (this.matriz[0][2] == this.matriz[1][1] && this.matriz[1][1] == this.matriz[2][0]
				&& this.matriz[0][2] != ' ') {
			return true;
		}

		return false;
	}
}
