package modulo5.exemplos4;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println(Contador.getValor());
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		System.out.println(Contador.getValor());
	}
}
