package modulo17.jogodaforca.utils;

public class RandomUtils {

	public static int gerarNumeroRandomico(int min, int max) {
		int intervalo = max - min;
		return (int) (Math.random() * intervalo) + min;
	}
}
