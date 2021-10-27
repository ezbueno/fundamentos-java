package modulo6.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Veiculo com um atributo ligado (privado), que indica se o carro est� ligado 
 * ou n�o. Esta classe deve ter tamb�m os m�todos ligar() e desligar(), que definem o valor 
 * para este atributo, e um m�todo getter (isLigado()). 
 * Depois crie tr�s subclasses de Veiculo: Automovel, Motocicleta e Onibus. Cada classe 
 * destas deve sobrescrever os m�todos ligar() e desligar() e deve imprimir mensagens 
 * como �Autom�vel ligado�, �Motocicleta desligada�, etc. Para manter a consist�ncia do modelo, 
 * descubra como fazer para que o atributo ligado de Veiculo tenha o valor correto quando os 
 * m�todos s�o chamados. 
 * Crie uma aplica��o que instancia tr�s ve�culos, um de cada tipo, e chama os m�todos ligar(), 
 * desligar() e isLigado(). O resultado obtido deve ser consistente com o que o modelo 
 * representa. Por exemplo, ao chamar o m�todo ligar() de um Automovel, � esperado que o 
 * m�todo isLigado() retorne true.
 */
public class Aplicacao {

	public static void main(String[] args) {
		Veiculo v1 = new Automovel();
		v1.ligar();
		System.out.println(v1.isLigado());
		v1.desligar();
		System.out.println(v1.isLigado());
		
		System.out.println("--------------");
		
		Veiculo v2 = new Motocicleta();
		v2.ligar();
		System.out.println(v2.isLigado());
		v2.desligar();
		System.out.println(v2.isLigado());
		
		System.out.println("--------------");
		
		Veiculo v3 = new Onibus();
		v3.ligar();
		System.out.println(v3.isLigado());
		v3.desligar();
		System.out.println(v3.isLigado());
	}
}
