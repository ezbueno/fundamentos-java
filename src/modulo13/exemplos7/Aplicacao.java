package modulo13.exemplos7;

import java.io.IOException;
import java.io.PrintWriter;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		String s = "Texto para ser gravado no arquivo";
		
		try (PrintWriter pw = new PrintWriter("saida.txt")) {
			pw.println(s);
		}
	}
}
