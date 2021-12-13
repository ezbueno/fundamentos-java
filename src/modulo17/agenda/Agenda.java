package modulo17.agenda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Agenda {

	private Map<String, Contato> contatosMap = new TreeMap<String, Contato>();
	private Map<Character, List<Contato>> contatosPorLetrasMap = new TreeMap<Character, List<Contato>>();
	private ArquivoAgenda arquivo = new ArquivoAgenda();

	public Agenda() throws IOException {
		List<Contato> contatos = this.arquivo.ler();

		for (Contato contato : contatos) {
			try {
				this.inserir(contato);
			} catch (AgendaException e) {
				e.printStackTrace();
			}
		}
	}

	public void inserir(Contato contato) throws AgendaException, IOException {
		contato.validarDados();

		String nome = contato.getNome();
		if (this.contatosMap.containsKey(nome)) {
			throw new AgendaException("O contato " + " nome já existe");
		}

		this.contatosMap.put(nome, contato);

		char letraInicial = Character.toUpperCase(nome.charAt(0));
		List<Contato> contatosLetra = this.contatosPorLetrasMap.get(letraInicial);
		if (contatosLetra == null) {
			contatosLetra = new ArrayList<>();
			this.contatosPorLetrasMap.put(letraInicial, contatosLetra);
		}
		contatosLetra.add(contato);

		this.arquivo.gravar(this.contatosMap.values());
	}

	public void excluir(String nome) throws AgendaException, IOException {
		this.verificarExistenciaContato(nome);

		Contato contato = this.obterContato(nome);

		this.contatosMap.remove(nome);

		List<Contato> contatos = this.contatosPorLetrasMap.get(nome.toUpperCase().charAt(0));
		contatos.remove(contato);

		if (contatos.isEmpty()) {
			this.contatosPorLetrasMap.remove(nome.toUpperCase().charAt(0));
		}

		this.arquivo.gravar(this.contatosMap.values());
	}

	public void alterar(Contato contato) throws AgendaException, IOException {
		contato.validarDados();

		this.verificarExistenciaContato(contato.getNome());

		this.arquivo.gravar(this.contatosMap.values());
	}

	private void verificarExistenciaContato(String nome) throws AgendaException {
		if (!this.contatosMap.containsKey(nome)) {
			throw new AgendaException("Contato " + nome + " não encontrado");
		}
	}

	public List<Contato> listarContatosPorLetra(char letra) {
		List<Contato> contatos = this.contatosPorLetrasMap.get(Character.toUpperCase(letra));
		if (contatos == null) {
			return new ArrayList<Contato>();
		}
		return contatos;
	}

	public List<Contato> listarContatosPorParteNome(String parteNome) {
		String regex = "\\w*" + parteNome + "\\w*";

		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		List<Contato> contatosEncontrados = new ArrayList<Contato>();

		Collection<Contato> contatosCadastrados = this.contatosMap.values();

		for (Contato contato : contatosCadastrados) {
			Matcher m = p.matcher(contato.getNome());
			if (m.matches()) {
				contatosEncontrados.add(contato);
			}
		}

		return contatosEncontrados;
	}

	public Contato obterContato(String nome) {
		return this.contatosMap.get(nome);
	}
}
