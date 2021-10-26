package modulo6.exemplos1;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano;

	public void buzinar() {
		System.out.println("BI BI");
	}

	public void imprimirDados() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
