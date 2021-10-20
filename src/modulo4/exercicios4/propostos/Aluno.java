package modulo4.exercicios4.propostos;

public class Aluno {
	Prova prova1 = new Prova();
	Prova prova2 = new Prova();

	double calcularMedia() {
		return (this.prova1.calcularNotaTotal() + this.prova2.calcularNotaTotal()) / 2;		
	}
}
