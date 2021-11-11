package modulo9.exercicios1.propostos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {

	private String nome;
	private double peso;
	private LocalDate dataValidade;

	public Produto() {}

	public Produto(String nome, double peso, LocalDate dataValidade) {
		this.nome = nome;
		this.peso = peso;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public LocalDate getDataValidade() {
		return this.dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public String getDataFormatada() {
		return this.dataValidade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
