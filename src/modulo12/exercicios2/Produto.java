package modulo12.exercicios2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

	private static NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	
	private String nome;
	private double valor;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public int compareTo(Produto p) {
		Double valor1 = Double.valueOf(this.valor);
		Double valor2 = Double.valueOf(p.valor);
		
		return valor1.compareTo(valor2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(this.nome, other.nome);
	}

	@Override
	public String toString() {
		return String.format("%-10s %7s", this.nome, nf.format(this.valor));
	}
}
