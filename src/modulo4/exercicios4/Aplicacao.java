package modulo4.exercicios4;

/**
 * @author Ezandro Bueno
 * Desenvolva um sistema escolar para cálculos de médias. Ele é composto pelas seguintes 
 * classes: Turma, Aluno, Prova.
 * Crie uma aplicação que instancia uma turma, três alunos na turma e as duas provas para cada 
 * aluno. Defina também notas para as provas. A aplicação deve mostrar mensagens informando 
 * a média de cada aluno e a média geral da turma. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		Turma turma = new Turma();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
			
		aluno1.prova1.notaParte1 = 4.0;
		aluno1.prova1.notaParte2 = 2.5;
		aluno1.prova2.notaParte1 = 1.0;
		aluno1.prova2.notaParte2 = 7.0;
		
		System.out.println("Média do aluno 1: " + aluno1.calcularMedia());
			
		aluno2.prova1.notaParte1 = 6.5;
		aluno2.prova1.notaParte2 = 3.5;
		aluno2.prova2.notaParte1 = 0.0;
		aluno2.prova2.notaParte2 = 3.0;
		
		System.out.println("Média do aluno 2: " + aluno2.calcularMedia());
		
		aluno3.prova1.notaParte1 = 5.0;
		aluno3.prova1.notaParte2 = 4.0;
		aluno3.prova2.notaParte1 = 6.0;
		aluno3.prova2.notaParte2 = 1.5;
		
		System.out.println("Média do aluno 3: " + aluno3.calcularMedia());
		
		turma.aluno1.prova1.notaParte1 = aluno1.prova1.notaParte1;
		turma.aluno1.prova1.notaParte2 = aluno1.prova1.notaParte2;
		turma.aluno1.prova2.notaParte1 = aluno1.prova2.notaParte1;
		turma.aluno1.prova2.notaParte2 = aluno1.prova2.notaParte2;
		
		turma.aluno2.prova1.notaParte1 = aluno2.prova1.notaParte1;
		turma.aluno2.prova1.notaParte2 = aluno2.prova1.notaParte2;
		turma.aluno2.prova2.notaParte1 = aluno2.prova2.notaParte1;
		turma.aluno2.prova2.notaParte2 = aluno2.prova2.notaParte2;
		
		turma.aluno3.prova1.notaParte1 = aluno3.prova1.notaParte1;
		turma.aluno3.prova1.notaParte2 = aluno3.prova1.notaParte2;
		turma.aluno3.prova2.notaParte1 = aluno3.prova2.notaParte1;
		turma.aluno3.prova2.notaParte2 = aluno3.prova2.notaParte2;
		
		System.out.println("Média da turma: " + turma.calcularMedia());		
	}
}
