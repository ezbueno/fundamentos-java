package modulo5.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Lampada que possui um atributo ligada, o qual indica se a l�mpada est� ligada 
 * ou desligada. 
 * Ao construir uma l�mpada, o estado dela (ligada ou desligada) deve ser fornecido. Para ligar e 
 * desligar a l�mpada, os m�todos ligar() e desligar() devem ser chamados, 
 * respectivamente. Ali�s, esta � a �nica forma de alterar o estado da l�mpada, j� que o atributo 
 * ligada n�o deve ser vis�vel fora da classe. 
 * A l�mpada tamb�m deve possuir um m�todo imprimir(). Quando chamado, ele mostra as 
 * mensagens �L�mpada ligada� ou �L�mpada desligada�, dependendo do estado atual. 
 * Construa uma aplica��o que cria uma l�mpada ligada, muda o estado dela e tamb�m imprime 
 * o estado atual ap�s cada chamada aos m�todos ligar() e desligar(). 
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
