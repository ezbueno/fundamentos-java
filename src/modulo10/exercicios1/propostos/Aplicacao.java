package modulo10.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Matematica com métodos estáticos que executam algumas operações 
 * matemáticas. Todos os parâmetros e tipos de retorno destes métodos devem ser declarados 
 * utilizando classes wrappers correspondentes aos tipos primitivos associados (e não os tipos 
 * primitivos diretamente). Além disso, o código destes métodos deve tirar proveito do 
 * autoboxing sempre que possível, de forma que o Java fique responsável por <embrulhar> e 
 * <desembrulhar> os valores nos tipos correspondentes. Os métodos que devem ser criados são 
 * os seguintes:
 * Double converterAngulo(Double angulo, TipoAngulo tipo)
 * Este método converte um ângulo de radianos para graus ou vice-versa. Ele recebe como 
 * parâmetro o valor do ângulo e o seu tipo, que pode ser GRAUS ou RADIANOS. Se o tipo do 
 * ângulo for GRAUS, o método deve retornar o ângulo em radianos. Já se o tipo do ângulo for 
 * RADIANOS, o método deve retornar o ângulo em graus.
 * Dica: Consulte na documentação do Java os métodos Math.toDegrees() e 
 * Math.toRadians(), que já realizam estes processos de conversão.
 * public static Integer somar(Integer n1, Integer n2, Integer n3)
 * Este método recebe uma sequência de 3 números, soma todos eles e retorna o resultado. 
 * public static Integer converterBinarioParaDecimal(String numBinario)
 * Este método recebe um número no formato binário e retorna este mesmo número no formato 
 * decimal. 
 * Crie também uma aplicação que chame estes métodos de diversas formas para verificar se 
 * estão funcionando adequadamente. Para exercitar o autoboxing, você deve chamar os 
 * métodos acima passando tipos primitivos como parâmetro e atribuir o retorno dos métodos 
 * também a tipos primitivos. 
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
