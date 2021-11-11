package modulo9.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Implemente um m�todo processar(), que recebe uma String s como par�metro e retorna 
 * uma nova String. Ele deve funcionar da seguinte forma:
 * Se s for null, o m�todo retorna null.
 * A String s deve ser convertida para caracteres mai�sculos.
 * Se o tamanho de s for menor ou igual a 3, a String s convertida para mai�scula � 
 * retornada por inteiro.
 * Se s tiver tamanho maior que 3, al�m da convers�o para mai�sculo, os 3 primeiros 
 * caracteres devem ter sua ordem invertida antes da String ser retornada.
 * Para exemplificar o funcionamento do algoritmo, observe a tabela abaixo. Ela mostra diversas 
 * formas de chamar o m�todo e o retorno esperado em cada caso:
 * Invoca��o             Retorno   
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
