package modulo13.exercicios2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;

public class Autor implements Recordable {

	private String nome;
	private Date dataNascimento;

	public Autor() {
	}

	public Autor(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return this.nome;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		
	}
}
