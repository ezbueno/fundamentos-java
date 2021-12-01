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
		this.titulo = in.readUTF();
		
		if (this.titulo == null) {
			this.titulo = null;
		}
		
		this.numPaginas = in.readInt();
		
		if (this.autor == null) {
			this.autor = new Autor();
		}
		
		this.autor.read(in);
	}

	@Override
	public void write(DataOutputStream out) throws IOException {		
		if (this.titulo == null) {
			out.writeUTF(null);
		} else {
			out.writeUTF(this.titulo);
		}
		
		out.writeInt(this.numPaginas);
		
		if (this.autor != null) {
			this.autor.write(out);
		}
	}

	@Override
	public String toString() {
		return "Livro [Título=" + this.titulo + ", Número de Páginas=" + this.numPaginas + ", Autor=" + this.autor + "]";
	}	
}
