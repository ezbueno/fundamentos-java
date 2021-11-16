package modulo10.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Matematica com m�todos est�ticos que executam algumas opera��es 
 * matem�ticas. Todos os par�metros e tipos de retorno destes m�todos devem ser declarados 
 * utilizando classes wrappers correspondentes aos tipos primitivos associados (e n�o os tipos 
 * primitivos diretamente). Al�m disso, o c�digo destes m�todos deve tirar proveito do 
 * autoboxing sempre que poss�vel, de forma que o Java fique respons�vel por �embrulhar� e 
 * �desembrulhar� os valores nos tipos correspondentes. Os m�todos que devem ser criados s�o 
 * os seguintes:
 * Double converterAngulo(Double angulo, TipoAngulo tipo)
 * Este m�todo converte um �ngulo de radianos para graus ou vice-versa. Ele recebe como 
 * par�metro o valor do �ngulo e o seu tipo, que pode ser GRAUS ou RADIANOS. Se o tipo do 
 * �ngulo for GRAUS, o m�todo deve retornar o �ngulo em radianos. J� se o tipo do �ngulo for 
 * RADIANOS, o m�todo deve retornar o �ngulo em graus.
 * Dica: Consulte na documenta��o do Java os m�todos Math.toDegrees() e 
 * Math.toRadians(), que j� realizam estes processos de convers�o.
 * public static Integer somar(Integer n1, Integer n2, Integer n3)
 * Este m�todo recebe uma sequ�ncia de 3 n�meros, soma todos eles e retorna o resultado. 
 * public static Integer converterBinarioParaDecimal(String numBinario)
 * Este m�todo recebe um n�mero no formato bin�rio e retorna este mesmo n�mero no formato 
 * decimal. 
 * Crie tamb�m uma aplica��o que chame estes m�todos de diversas formas para verificar se 
 * est�o funcionando adequadamente. Para exercitar o autoboxing, voc� deve chamar os 
 * m�todos acima passando tipos primitivos como par�metro e atribuir o retorno dos m�todos 
 * tamb�m a tipos primitivos. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		double anguloConvertido = Matematica.converterAngulo(90.0, Matematica.TipoAngulo.GRAUS);
		System.out.println(anguloConvertido);
		
		anguloConvertido = Matematica.converterAngulo(1.57, Matematica.TipoAngulo.RADIANOS);
		System.out.println(anguloConvertido);
		
		int soma = Matematica.somar(10, 2, 4);
		System.out.println(soma);
		
		int valorDecimal = Matematica.converterBinarioParaDecimal("1011");
		System.out.println(valorDecimal);
	}
}
