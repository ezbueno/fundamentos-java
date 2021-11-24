package modulo11.exemplos2;

public class Aplicacao {

	public static void main(String[] args) {
		
		Contato c = new Contato("José", "a@a.com");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + c.getNome() + " ");
		sb.append("E-mail: " + c.getEmail());
		
		System.out.println(sb.toString());
	}
}
