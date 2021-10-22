package modulo5.exemplos4;

public class Contador {
	private static int valor;
	
	static {
		valor = 1;
	}
	
	private Contador() {		
	}
	
	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}
}
