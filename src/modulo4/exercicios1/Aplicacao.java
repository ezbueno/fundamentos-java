package modulo4.exercicios1;

/**
 * @author Ezandro Bueno
 * Crie as classes Relogio e Ponteiro e escreva um método main() para treinar a chamada aos 
 * métodos e atributos. 
 * Atributos da classe Relogio: 
 * - ponteiroHora (tipo Ponteiro) 
 * - ponteiroMinuto (tipo Ponteiro) 
 * - ponteiroSegundo (tipo Ponteiro) 
 * Métodos da classe Relogio: 
 * - acertarRelogio(int, int, int): Acerta o relógio, posicionando adequadamente 
 * cada ponteiro do relógio. Os parâmetros passados são hora, minuto e segundo. 
 * - lerHora(): retorna a hora atual do relógio. 
 * - lerMinuto(): retorna o minuto atual do relógio. 
 * - lerSegundo(): retorna o segundo atual do relógio. 
 * Atributos da classe Ponteiro: 
 * - posicao(int): indica em qual posição está o ponteiro (1, 2, 3, 4, etc.)
 * Dica 1: Os ponteiros podem assumir as posições 1, 2, 3, 4 e assim por diante. Se um ponteiro 
 * dos minutos está na posição 3, significa que o método lerMinuto() deve retornar 15, que é o 
 * minuto correspondente a esta posição. O mesmo vale para o ponteiro dos segundos. 
 * Dica 2: No método acertarRelogio(), você deve passar a hora, minuto e segundo. Suponha 
 * que o horário fornecido seja 3 horas, 25 minutos e 50 segundos. O ponteiro das horas deve ser 
 * posicionado no 3; o dos minutos no 5; e o dos segundos no 10.
 */
public class Aplicacao {
	
	public static void main(String[] args) {		
		Relogio relogio = new Relogio();	
		relogio.acertarRelogio(3, 30, 50);
						
		System.out.println("Posição da hora: " + relogio.ponteiroHora.posicao);
		System.out.println("Posição do minuto: " + relogio.ponteiroMinuto.posicao);
		System.out.println("Posição do segundo: " + relogio.ponteiroSegundo.posicao);
		
		int hora = relogio.lerHora();
		int minuto = relogio.lerMinuto();
		int segundo = relogio.lerSegundo();
				
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		relogio.acertarRelogio(22, 0, 0);
		System.out.println("Hora do segundo relógio: " + relogio.lerHora());
	}
}
