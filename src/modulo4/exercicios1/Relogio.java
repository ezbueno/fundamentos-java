package modulo4.exercicios1;

public class Relogio {
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	void acertarRelogio(int hora, int minuto, int segundo) {		
		this.ponteiroHora.posicao = hora % 12;
		this.ponteiroMinuto.posicao = minuto / 5;
		this.ponteiroSegundo.posicao = segundo / 5;
	}
	
	int lerHora() {
		return this.ponteiroHora.posicao;
	}
	
	int lerMinuto() {
		return this.ponteiroMinuto.posicao * 5;
	}
	
	int lerSegundo() {
		return this.ponteiroSegundo.posicao * 5;
	}
}
