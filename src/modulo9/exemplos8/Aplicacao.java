package modulo9.exemplos8;

public class Aplicacao {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int d = gerarInt(50, 70);
			System.out.println((i + 1) + " => " + d);
		}
	}

	static int gerarInt(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}
}
