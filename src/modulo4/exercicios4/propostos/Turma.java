package modulo4.exercicios4.propostos;

public class Turma {
	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	Aluno aluno3 = new Aluno();
	
	double calcularMedia() {
		return (this.aluno1.calcularMedia() + this.aluno2.calcularMedia() + this.aluno3.calcularMedia()) / 3;
	}
}
