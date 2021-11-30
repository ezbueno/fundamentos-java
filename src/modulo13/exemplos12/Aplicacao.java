package modulo13.exemplos12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		InputStream cin = System.in;
		FileOutputStream fout = new FileOutputStream("saida4.txt");
		transfer(cin, fout);
	}

	private static void transfer(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];

		int bytesLidos;

		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
