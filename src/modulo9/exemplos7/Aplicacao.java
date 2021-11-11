package modulo9.exemplos7;

import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			int d = r.nextInt(100);
			System.out.println((i + 1) + " => " + d);
		}
	}
}
