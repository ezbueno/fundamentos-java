package modulo14.exercicios2.respostas;

/**
 * Esta classe faz o c�lculo de cada parcial da s�rie de Gregory. O c�lculo de cada parcial � feito
 * em uma thread separada.
 */
public class CalculadorParcial extends Thread {
	/**
	 * ID da thread
	 */
	private int id;
	
	/**
	 * Array com as parciais.
	 * Cada thread acessa apenas um �ndice de array que corresponde ao seu ID. Logo, o acesso ao array n�o 
	 * precisa ser sincronizado, uma vez que cada thread coloca o seu resultado parcial em uma �rea diferente
	 * da mem�ria.
	 */
	private double[] parciais;

	/**
	 * Construtor
	 * @param id ID da thread
	 * @param parciais Array de resultados parciais
	 */
	public CalculadorParcial(int id, double[] parciais) {
		this.id = id;
		this.parciais = parciais;
	}

	/**
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		/*
		 * Este � o c�digo executado quando a thread come�a a sua execu��o. Este m�todo basicamente faz o
		 * c�lculo da parcial da thread usando a f�rmula da s�rie de Gregory
		 */
		double soma = 0;

		for (int i = id; i < Calculador.NUM_ITERACOES; i += Calculador.NUM_THREADS) {
			int s;
			if (i % 2 == 0) {
				s = 1;
			} else {
				s = -1;
			}

			soma += (double) s / (2 * i + 1);
		}
		
		/*
		 * Depois da parcial calculada, a thread coloca o resultado parcial no array de resultados parciais
		 * e termina
		 */
		parciais[id] = soma;
	}
}
