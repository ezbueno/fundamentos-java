package modulo13.exemplos6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		String s = "Texto para ser gravado no arquivo";
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))) {
			writer.write(s);
		}
	}
}
