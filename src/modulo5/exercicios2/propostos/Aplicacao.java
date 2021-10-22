package modulo5.exercicios2.propostos;

/**
 * @author Ezandro Bueno
 * Crie uma classe Data que possui dois construtores. O primeiro recebe um dia, mês e ano. O 
 * segundo, além destas informações, recebe também uma hora, minuto e segundo (a hora 
 * fornecida deve estar entre 0 e 23). É importante que este segundo construtor invoque o 
 * primeiro para evitar a duplicação de código. 
 * Os construtores devem armazenar os dados fornecidos como parâmetros em atributos 
 * privados. Estes atributos devem ter métodos getters associados, que irão expor os valores 
 * para códigos externos à classe. 
 * A classe Data deve ter também um método imprimir() utilizado para imprimir a data e a hora 
 * representados pelo objeto. Este método recebe como parâmetro o formato de hora que deve 
 * ser utilizado para imprimir as horas (12 ou 24h). Se o objeto foi construído sem informação de 
 * horário, este parâmetro não afeta a impressão. 
 * Os formatos da hora são do tipo int, mas devem ser representados por duas constantes na 
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
