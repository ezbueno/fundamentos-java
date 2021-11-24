package modulo12.exemplos3;

public class Aplicacao {

	public static void main(String[] args) {
		imprimir("a", "b", "c");		
	}
	
	private static void imprimir(String...str) {
		for (String s : str) {
			System.out.println(s);
		}
	}
}
