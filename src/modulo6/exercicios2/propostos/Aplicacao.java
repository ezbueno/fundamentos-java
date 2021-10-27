package modulo6.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Veiculo com um atributo ligado (privado), que indica se o carro está ligado 
 * ou não. Esta classe deve ter também os métodos ligar() e desligar(), que definem o valor 
 * para este atributo, e um método getter (isLigado()). 
 * Depois crie três subclasses de Veiculo: Automovel, Motocicleta e Onibus. Cada classe 
 * destas deve sobrescrever os métodos ligar() e desligar() e deve imprimir mensagens 
 * como “Automóvel ligado”, “Motocicleta desligada”, etc. Para manter a consistência do modelo, 
 * descubra como fazer para que o atributo ligado de Veiculo tenha o valor correto quando os 
 * métodos são chamados. 
 * Crie uma aplicação que instancia três veículos, um de cada tipo, e chama os métodos ligar(), 
 * desligar() e isLigado(). O resultado obtido deve ser consistente com o que o modelo 
 * representa. Por exemplo, ao chamar o método ligar() de um Automovel, é esperado que o 
 * método isLigado() retorne true.
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
