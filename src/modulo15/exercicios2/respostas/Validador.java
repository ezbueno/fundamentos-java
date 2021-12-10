package modulo15.exercicios2.respostas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Classe que possui m�todos de valida��o
public class Validador {

	// Valida um CPF
	public static boolean validarCPF(String cpf) {
		String regex = "\\d\\d\\d([\\.\\s])?\\d\\d\\d([\\.\\s])?\\d\\d\\d([-\\s])?\\d\\d";
		return validarRegex(cpf, regex);
	}
	
	// Valida um telefone
	public static boolean validarTelefone(String telefone) {
		String regex = "(\\(\\d\\d\\))?\\s*\\d\\d\\d\\d([-\\s])?\\d\\d\\d\\d";
		return validarRegex(telefone, regex);
	}

	// Este m�todo � gen�rico, recebe uma string e uma express�o regular para executar
	// a valida��o
	private static boolean validarRegex(String str, String regex) {
		// Se a string for nula, considera que a valida��o falhou
		if (str == null) {
			return false;
		}
		
		// Cria o objeto Pattern
		Pattern p = Pattern.compile(regex);
		
		// Cria o objeto Matcher
		Matcher m = p.matcher(str);
		
		// O m�todo matches() verifica se o texto est� no padr�o especificado pela
		// express�o regular
		return m.matches();
	}
}
