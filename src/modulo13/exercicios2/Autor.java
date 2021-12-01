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
		this.nome = in.readUTF();
		
		if (this.nome == null) {
			this.nome = null;
		}
		
		long time = in.readLong();
		
		if (time == -1) {
			this.dataNascimento = null;
		} else {
			this.dataNascimento = new Date(time);
		}
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		if (this.nome != null) {
			out.writeUTF(this.nome);
		} else {
			out.writeUTF(null);
		}

		if (this.dataNascimento != null) {
			out.writeLong(this.dataNascimento.getTime());
		} else {
			out.writeLong(-1);
		}
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
}
