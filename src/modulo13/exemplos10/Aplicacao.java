package modulo13.exemplos10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fin = new FileInputStream("entrada3.txt");
				FileOutputStream fout = new FileOutputStream("saida3.txt")) {
			transfer(fin, fout);
		}
	}

	private static void transfer(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];

		int bytesLidos;

		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
