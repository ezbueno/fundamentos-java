package modulo5.exercicios1;

/**
 * @author Ezandro Bueno
 * Crie uma classe Lampada que possui um atributo ligada, o qual indica se a lâmpada está ligada 
 * ou desligada. 
 * Ao construir uma lâmpada, o estado dela (ligada ou desligada) deve ser fornecido. Para ligar e 
 * desligar a lâmpada, os métodos ligar() e desligar() devem ser chamados, 
 * respectivamente. Aliás, esta é a única forma de alterar o estado da lâmpada, já que o atributo 
 * ligada não deve ser visível fora da classe. 
 * A lâmpada também deve possuir um método imprimir(). Quando chamado, ele mostra as 
 * mensagens <Lâmpada ligada> ou <Lâmpada desligada>, dependendo do estado atual. 
 * Construa uma aplicação que cria uma lâmpada ligada, muda o estado dela e também imprime 
 * o estado atual após cada chamada aos métodos ligar() e desligar(). 
 */
public class Aplicacao {

	public static void main(String[] args) {
		Lampada l1 = new Lampada(true);	
		l1.imprimir();
		
		l1.desligar();
		l1.imprimir();
		
		l1.ligar();
		l1.imprimir();
	}
}
