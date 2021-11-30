package modulo13.exemplos1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		try (InputStream is = new FileInputStream("entrada.txt")) {
			byte[] buffer = new byte[1024];

			int bytesLidos = is.read(buffer);

			String s = new String(buffer, 0, bytesLidos);
			System.out.println(s);
			System.out.println(s.length());
			
		}
	}
}
