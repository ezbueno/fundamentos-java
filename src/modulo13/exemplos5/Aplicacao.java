package modulo13.exemplos5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		
		try (OutputStream os = new FileOutputStream("saida.txt")) {
			String s = "Texto para ser gravado no arquivo";
			
			byte[] buffer = s.getBytes();
			
			os.write(buffer);
		}
	}
}
