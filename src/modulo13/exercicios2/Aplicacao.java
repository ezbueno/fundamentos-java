package modulo13.exercicios2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aplicacao {

	private static final String FILE = "livros.txt";

	public static void main(String[] args) throws ParseException, IOException {

		int opcao;

		System.out.println("|-------------|");
		System.out.println("| 1 - Gravar  |");
		System.out.println("| 2 - Ler     |");
		System.out.println("|-------------|");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Escolha a opção desejada: \n=> ");
			opcao = sc.nextInt();

			while (opcao <= 0 || opcao > 2) {
				System.out.println("Opção inválida!");
				System.out.print("Escolha a opção desejada: \n=> ");
				opcao = sc.nextInt();
			}

			if (opcao == 1) {
				gravarDados();

			} else {
				lerDados();
			}
		}
	}

	private static void gravarDados() throws ParseException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String d1 = "30/07/1983";
		Date dataNascimento = sdf.parse(d1);

		String d2 = "18/10/1993";
		Date dataNascimento2 = sdf.parse(d2);

		Autor autor = new Autor("Ezandro", dataNascimento);
		Livro l1 = new Livro("Java Programmer", 254, autor);

		Autor autor2 = new Autor("Nayara", dataNascimento2);
		Livro l2 = new Livro("C# Programmer", 240, autor2);

		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE))) {
			l1.write(out);
			l2.write(out);
		}
	}

	private static void lerDados() throws IOException {
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		try (DataInputStream d = new DataInputStream(new FileInputStream(FILE))) {
			l1.read(d);
			l2.read(d);

			System.out.println(l1);
			System.out.println(l2);
		}
	}
}
