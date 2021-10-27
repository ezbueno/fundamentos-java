package modulo6.exemplos4;

public class Aplicacao {

	public static void main(String[] args) {
		Preparador preparador = new Preparador();

		LeiteQuente leite = new LeiteQuente();
		preparador.prepararBebida(leite);
		
		System.out.println("--------------");
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}
}
