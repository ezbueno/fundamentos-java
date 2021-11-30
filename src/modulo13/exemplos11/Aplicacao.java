package modulo13.exemplos11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fin = new FileInputStream("entrada4.txt")) {
			OutputStream cout = System.out;
			transfer(fin, cout);
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
