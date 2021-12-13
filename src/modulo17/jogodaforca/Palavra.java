package modulo17.jogodaforca;

import java.util.HashSet;
import java.util.Set;

public class Palavra {

	private static final char CARACTERE_SECRETO = '_';
	private String palavraOriginal;
	private Set<Character> caracteresEncontrados = new HashSet<Character>();

	public Palavra(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal.toUpperCase();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		char[] letrasArray = this.palavraOriginal.toCharArray();

		for (int i = 0; i < letrasArray.length; i++) {
			char c = letrasArray[i];

			if (this.caracteresEncontrados.contains(c)) {
				sb.append(c);
			} else {
				sb.append(CARACTERE_SECRETO);
			}

			sb.append(" ");
		}

		return sb.toString().trim();
	}

	public int tamanho() {
		return this.palavraOriginal.length();
	}

	public boolean possuiLetra(char letra) {
		if (this.palavraOriginal.indexOf(letra) > -1) {
			this.caracteresEncontrados.add(letra);
			return true;
		}

		return false;
	}

	public boolean acertouPalavra() {
		char[] letrasArray = this.palavraOriginal.toCharArray();

		Set<Character> letras = new HashSet<>();

		for (int i = 0; i < letrasArray.length; i++) {
			letras.add(letrasArray[i]);
		}

		return letras.equals(this.caracteresEncontrados);
	}

	public String getPalavraOriginal() {
		return this.palavraOriginal;
	}
}
