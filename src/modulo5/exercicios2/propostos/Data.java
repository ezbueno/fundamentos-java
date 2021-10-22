package modulo5.exercicios2.propostos;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;

	public static final int FORMATO_12H = 12;
	public static final int FORMATO_24H = 24;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void imprimir(int formato) {
//		if (this.getHora() == 0 && formato == Data.FORMATO_12H) {
//			System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " " + (this.getHora() + Data.FORMATO_12H) + ":" + this.getMinuto() + ":" + this.getSegundo() + " PM");
//		} else if (this.getHora() == 12 && formato == Data.FORMATO_24H) {
//			System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " " + (this.getHora() - Data.FORMATO_12H) + ":" + this.getMinuto() + ":" + this.getSegundo() + " AM");
//		}
//		
		if (formato == Data.FORMATO_12H) {			
			if (this.getHora() > Data.FORMATO_12H) {
				int horaFormato = this.getHora() - Data.FORMATO_12H;
				System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " " + horaFormato + ":" + this.getMinuto() + ":" + this.getSegundo() + " AM");
			} else {
				System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " " + this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo() + " AM");
			}			
		} else if (this.getHora() > Data.FORMATO_12H  && this.getHora() <= Data.FORMATO_24H) {
			System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " " + this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo() + " PM");
		} else {
			System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno() + " " + (this.getHora() + Data.FORMATO_12H)  + ":" + this.getMinuto() + ":" + this.getSegundo() + " PM");
		}
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return this.segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
}
