package modulo4.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie as classes Relogio e Ponteiro e escreva um m�todo main() para treinar a chamada aos 
 * m�todos e atributos. 
 * Atributos da classe Relogio: 
 * - ponteiroHora (tipo Ponteiro) 
 * - ponteiroMinuto (tipo Ponteiro) 
 * - ponteiroSegundo (tipo Ponteiro) 
 *	M�todos da classe Relogio: 
 * - acertarRelogio(int, int, int): Acerta o rel�gio, posicionando adequadamente 
 * cada ponteiro do rel�gio. Os par�metros passados s�o hora, minuto e segundo. 
 * - lerHora(): retorna a hora atual do rel�gio. 
 * - lerMinuto(): retorna o minuto atual do rel�gio. 
 * - lerSegundo(): retorna o segundo atual do rel�gio. 
 * Atributos da classe Ponteiro: 
 * - posicao(int): indica em qual posi��o est� o ponteiro (1, 2, 3, 4, etc.)
 * Dica 1: Os ponteiros podem assumir as posi��es 1, 2, 3, 4 e assim por diante. Se um ponteiro 
 * dos minutos est� na posi��o 3, significa que o m�todo lerMinuto() deve retornar 15, que � o 
 * minuto correspondente a esta posi��o. O mesmo vale para o ponteiro dos segundos. 
 * Dica 2: No m�todo acertarRelogio(), voc� deve passar a hora, minuto e segundo. Suponha 
 * que o hor�rio fornecido seja 3 horas, 25 minutos e 50 segundos. O ponteiro das horas deve ser 
 * posicionado no 3; o dos minutos no 5; e o dos segundos no 10.
 */
public class Aplicacao {
	
	public static void main(String[] args) {		
		Relogio relogio = new Relogio();	
		relogio.acertarRelogio(3, 30, 50);
						
		System.out.println("Posi��o da hora: " + relogio.ponteiroHora.posicao);
		System.out.println("Posi��o do minuto: " + relogio.ponteiroMinuto.posicao);
		System.out.println("Posi��o do segundo: " + relogio.ponteiroSegundo.posicao);
		
		int hora = relogio.lerHora();
		int minuto = relogio.lerMinuto();
		int segundo = relogio.lerSegundo();
				
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		relogio.acertarRelogio(22, 0, 0);
		System.out.println("Hora do segundo rel�gio: " + relogio.lerHora());
	}
}
