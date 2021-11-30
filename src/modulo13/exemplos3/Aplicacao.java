package modulo13.exemplos3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String s = "";
			String line;
			StringBuilder sb = new StringBuilder();
			
			while ((line = reader.readLine()) != null) {
				s = sb.append(line + "\n").toString();
			}
			System.out.println(s);
		}
	}
}
