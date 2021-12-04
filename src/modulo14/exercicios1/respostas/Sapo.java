package modulo14.exercicios1.respostas;

/**
 * A classe Sapo representa cada um dos sapos que ir� correr. Cada sapo � uma thread, j� que cada um 
 * executa de forma independente
 */
public class Sapo extends Thread {
	
	/**
	 * Tempo m�ximo (em milissegundos) que um sapo descansa antes de dar o pr�ximo pulo
	 */
	private static final int MAXIMO_DESCANSO = 500;
	
	/**
	 * Dist�ncia m�xima que o sapo pode alcan�ar com seu pulo
	 */
	private static final int MAXIMO_PULO = 50;
	
	/**
	 * Monitor usado para sincronizar o acesso ao atributo 'colocacao'
	 */
	private static Object monitor = new Object();
	
	/**
	 * Nome do sapo
	 */
	private String nome;
	
	/**
	 * Dist�ncia total a ser percorrida pelo sapo
	 */
	private int distanciaTotal;
	
	/**
	 * Dist�ncia j� percorrida pelo sapo
	 */
	private int distanciaPercorrida;
	
	/**
	 * Dist�ncia que o sapo pulou no �ltimo pulo
	 */
	private int ultimoPulo;
	
	/**
	 * Coloca��o final do sapo.
	 * Este atributo � est�tico porque ele � compartilhado entre todas as inst�ncias da classe
	 * (existe apenas um atributo 'colocacao' para todos os sapos correndo
	 */
	private static int colocacao;
	
	/**
	 * Construtor
	 * @param nome Nome do sapo
	 * @param distanciaTotal Dist�ncia total
	 */
	public Sapo(String nome, int distanciaTotal) {
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
	}

	/**
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		/* Este c�digo ser� executado pela thread. Cada sapo realiza tr�s a��es: pula, avisa sua situa��o
		 * (isto �, mostra uma mensagem no console a respeito do seu estado atual na corrida) e descansa.
		 * Este c�digo executa num loop, at� que a dist�ncia total tenha sido atingida.
		 */
		
		while(distanciaPercorrida < distanciaTotal) {
			pular();
			avisarSituacao();
			descansar();
		}
		
		//depois que o sapo atingiu a linha de chegada, a sua coloca��o deve ser gravada
		cruzarLinhaDeChegada();
	}
	
	/**
	 * Faz o sapo pular
	 */
	private void pular() {		
		//a dist�ncia do pulo � calculada randomicamente, entre 0 e MAXIMO_PULO
		ultimoPulo = (int)(Math.random() * MAXIMO_PULO);
		
		//incrementa a dist�ncia percorrida com a dist�ncia do pulo
		distanciaPercorrida += ultimoPulo;
		
		//faz o truncamento da dist�ncia percorrida caso ela ultrapasse a dist�ncia total
		if(distanciaPercorrida > distanciaTotal) {
			distanciaPercorrida = distanciaTotal;
		}
	}
	
	/**
	 * Faz o sapo descansar
	 */
	private void descansar() {
		//calcula o tempo de descanso de forma rand�mica, entre 0 e MAXIMO_DESCANSO ms
		int tempo = (int)(Math.random() * MAXIMO_DESCANSO);
		try {
			//faz a thread do sapo dormir por um determinado tempo (a thread para de executar)
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Mostra a situa��o atual do sapo na corrida
	 */
	private void avisarSituacao() {
		System.out.println(nome + " pulou " + ultimoPulo + "cm. A dist�ncia percorrida foi de " + distanciaPercorrida + "cm");
	}
	
	/**
	 * Marca a coloca��o do sapo.
	 * O acesso ao atributo 'colocacao' deve ser sincronizado porque pode have problema se dois sapos cruzarem
	 * a linha de chegada praticamente ao mesmo tempo.
	 * Foi criado um atributo 'monitor' para gerenciar a regi�o cr�tica, mas o pr�prio atributo 'colocacao'
	 * poderia ser usado com esta finalidade.
	 */
	private void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println("==> " + nome + " cruzou a linha de chegada em " + colocacao + "o. lugar!");
		}
	}
}
