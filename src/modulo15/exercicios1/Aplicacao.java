package modulo15.exercicios1;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class Aplicacao {

	public static void main(String[] args) throws IOException, ParseException {
		Organizador o = new Organizador();

		Album a = o.carregarFotos(new File("./fotos"));

		a.listarFotos();
	}
}
