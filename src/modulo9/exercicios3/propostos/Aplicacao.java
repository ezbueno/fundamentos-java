package modulo9.exercicios3.propostos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author Ezandro Bueno
 * Crie uma aplica��o que faz dois c�lculos e imprime o resultado na tela:
 * 1. Calcula quantos anos, meses e dias se passaram desde a data de nascimento de James 
 * Gosling (criador do Java) at� a data de hoje. Ele nasceu em 19/05/1955.
 * 2. Calcula quantos segundos se passaram desde �s 3h da manh� do dia de hoje.
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		LocalDate dataNascimento = LocalDate.parse("1955-05-19");
		LocalDate dataAtual = LocalDate.now();
		
		Period p = Period.between(dataNascimento, dataAtual);
		
		System.out.println(String.format("%d anos, %d meses e %d dias", p.getYears(), p.getMonths(), p.getDays()));
		
		LocalTime horaAnterior = LocalTime.parse("03:00");
		LocalTime horaAtual = LocalTime.now();
		
		Duration d = Duration.between(horaAnterior, horaAtual);
		
		System.out.println(String.format("%d segundos", d.getSeconds()));		
	}
}
