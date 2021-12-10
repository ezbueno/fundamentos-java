package modulo15.exercicios1;

import java.util.Date;

public class Foto {

	private int id;
	private Date data;
	private String local;

	public Foto(int id, Date data, String local) {
		this.id = id;
		this.data = data;
		this.local = local;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
