package modulo15.exemplos3;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		int[][] elementos = new int[4][4];

		try (Scanner s = new Scanner(new File("dados.txt"))) {

			Pattern p = Pattern.compile("\\d");

			int j = 0;
			while (s.hasNextLine()) {
				String line = s.nextLine();

				Matcher m = p.matcher(line);

				int i = 0;
				while (m.find()) {
					elementos[j][i] = Integer.parseInt(m.group());
					i++;
				}
				j++;
			}
		}

		for (int a = 0; a < elementos.length; a++) {
			for (int b = 0; b < elementos[a].length; b++) {
				System.out.print(elementos[a][b] + "\t");
			}
			System.out.println();
		}
	}
}
