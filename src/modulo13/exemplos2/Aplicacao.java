package modulo13.exemplos2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		try (InputStream is = new FileInputStream("entrada.txt")) {
			byte[] buffer = new byte[4];

			String s = "";
			int bytesLidos;
			
			StringBuilder sb = new StringBuilder();
			
			while ((bytesLidos = is.read(buffer)) > -1) {
				s = sb.append(new String(buffer, 0 , bytesLidos)).toString();
			}
			System.out.println(s);		
			System.out.println(s.length());
		}
	}
}
