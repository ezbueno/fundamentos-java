package modulo13.exercicios2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Livro implements Recordable {

	private String titulo;
	private int numPaginas;
	private Autor autor;

	public Livro() {
	}

	public Livro(String titulo, int numPaginas, Autor autor) {
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.autor = autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return this.numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		
	}
}
