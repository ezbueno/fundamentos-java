package modulo13.exemplos8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		String inputFile = "entrada2.txt";
		String outputFile = "saida2.txt";

		try (InputStream in = new FileInputStream(inputFile); OutputStream out = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];

			int bytesLidos;

			while ((bytesLidos = in.read(buffer)) > -1) {
				out.write(buffer, 0, bytesLidos);
			}
		}
	}
}
