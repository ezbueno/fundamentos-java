package modulo13.exemplos9;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {			
		try (FileInputStream fin = new FileInputStream("entrada5.txt")) {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			transfer(fin, bout);
			
			byte[] bytes = bout.toByteArray();
			String s = new String(bytes);
			System.out.println(s);
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
