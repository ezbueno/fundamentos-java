package modulo17.agenda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contato {

	private String nome;
	private String telefone;

	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void validarDados() throws AgendaException {
		this.validarNome();
		this.validarTelefone();
	}

	private void validarNome() throws AgendaException {
		if (this.nome == null || this.nome.trim().length() == 0) {
			throw new AgendaException("O nome do contato não pode ser vazio");
		}
	}

	private void validarTelefone() throws AgendaException {
		String regex = "\\d\\d\\d\\d-\\d\\d\\d\\d";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(this.telefone);

		if (!m.matches()) {
			throw new AgendaException("O telefone " + this.telefone + " não é válido");
		}
	}

	public String toString() {
		return this.nome + " -> " + this.telefone;
	}
}
