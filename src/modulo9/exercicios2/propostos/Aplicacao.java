package modulo9.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Implemente um método processar(), que recebe uma String s como parâmetro e retorna 
 * uma nova String. Ele deve funcionar da seguinte forma:
 * Se s for null, o método retorna null.
 * A String s deve ser convertida para caracteres maiúsculos.
 * Se o tamanho de s for menor ou igual a 3, a String s convertida para maiúscula é 
 * retornada por inteiro.
 * Se s tiver tamanho maior que 3, além da conversão para maiúsculo, os 3 primeiros 
 * caracteres devem ter sua ordem invertida antes da String ser retornada.
 * Para exemplificar o funcionamento do algoritmo, observe a tabela abaixo. Ela mostra diversas 
 * formas de chamar o método e o retorno esperado em cada caso:
 * Invocação             Retorno   
 * processar(null)       null
 * processar("abc")      AB
 * processar("abcdefg")  CBADEFG
 */
public class Aplicacao {

	public static void main(String[] args) {
		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefg"));
	}
	
	private static String processar(String s) {
		if (s == null) {
			return null;
		}
		
		s = s.toUpperCase();
		
		if (s.length() <= 3) {
			return s;
		}
		
		String s2 = s.substring(0, 3);
		
		StringBuilder sb = new StringBuilder(s2);		
		
		return sb.reverse() + s.substring(3);
	}
}
