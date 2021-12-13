package modulo17.jogodavelha;

public class Jogada {

	private int i;
	private int j;

	public Jogada(String jogada) throws JogadaInvalidaException {
		parseString(jogada);
	}

	private void parseString(String jogada) throws JogadaInvalidaException {
		try {
			String[] tokens = jogada.split(",");

			this.i = Integer.parseInt(tokens[0].trim());
			this.j = Integer.parseInt(tokens[1].trim());
		} catch (Exception e) {
			throw new JogadaInvalidaException("A jogada é inválida!");
		}
	}

	public int getI() {
		return this.i;
	}

	public int getJ() {
		return this.j;
	}
}
