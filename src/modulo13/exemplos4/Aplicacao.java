package modulo13.exemplos4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		String s = "";
		StringBuilder sb = new StringBuilder();
		
		try (Scanner sc = new Scanner(new File("entrada.txt"))) {
			while (sc.hasNextLine()) {
				s = sb.append(sc.nextLine() + "\n").toString();
			}
		}
		System.out.println(s);
	}
}
