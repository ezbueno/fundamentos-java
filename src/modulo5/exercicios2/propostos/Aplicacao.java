package modulo5.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Data que possui dois construtores. O primeiro recebe um dia, m�s e ano. O 
 * segundo, al�m destas informa��es, recebe tamb�m uma hora, minuto e segundo (a hora 
 * fornecida deve estar entre 0 e 23). � importante que este segundo construtor invoque o 
 * primeiro para evitar a duplica��o de c�digo. 
 * Os construtores devem armazenar os dados fornecidos como par�metros em atributos 
 * privados. Estes atributos devem ter m�todos getters associados, que ir�o expor os valores 
 * para c�digos externos � classe. 
 * A classe Data deve ter tamb�m um m�todo imprimir() utilizado para imprimir a data e a hora 
 * representados pelo objeto. Este m�todo recebe como par�metro o formato de hora que deve 
 * ser utilizado para imprimir as horas (12 ou 24h). Se o objeto foi constru�do sem informa��o de 
 * hor�rio, este par�metro n�o afeta a impress�o. 
 * Os formatos da hora s�o do tipo int, mas devem ser representados por duas constantes na 
 * classe Data: FORMATO_12H e FORMATO_24H.
 */
public class Aplicacao {

	public static void main(String[] args) {
		Data d1 = new Data(10, 03, 2000, 10, 30, 10);
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);
		
		Data d2 = new Data(10, 03, 2000, 23, 15, 20);
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
	}
}
