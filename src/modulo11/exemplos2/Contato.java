package modulo11.exemplos2;

/**
 * Classe que representa um contato
 * @author Ezandro Bueno
 * @version 1.0 
 */
public class Contato {

	/**
	 * Nome do contato
	 */
	private String nome;
	
	/**
	 * E-mail do contato
	 */
	private String email;
	
	/**
	 * Endere�o do contato
	 */
	private Endereco endereco = new Endereco();

	
	/**
	 * Construtor
	 * @param nome Nome do contato
	 * @param email E-mail do contato
	 */
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;		
	}
	
	/**
	 * Define o endere�o do contato
	 * @param rua Rua do contato
	 * @param numero N�mero do contato
	 */
	public void definirEndereco(String rua, int numero) {
		this.endereco.setRua(rua);
		this.endereco.setNumero(numero);
	}

	/**
	 * Retorna o nome 
	 * @return Nome do contato
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Retorna o e-mail 
	 * @return E-mail do contato
	 */
	public String getEmail() {
		return this.email;
	}
}
