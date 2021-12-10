package modulo15.exercicios1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {

	private List<Foto> fotos = new ArrayList<>();

	void adicionar(int id, Date data, String local) {
		this.fotos.add(new Foto(id, data, local));
	}

	void listarFotos() {
		for (Foto foto : this.fotos) {
			String local = foto.getLocal() == null ? "Nenhum" : foto.getLocal();
			String s = String.format("%1$d, %2$s, %3$td/%3$tm/%3$ty", foto.getId(), local, foto.getData());
			
			System.out.println(s);
		}
	}

	public List<Foto> getFotos() {
		return this.fotos;
	}
}
