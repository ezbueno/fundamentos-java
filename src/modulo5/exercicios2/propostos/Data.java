package modulo5.exercicios2.propostos;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;

	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;

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
 		String data = this.dia + "/" + this.mes + "/" + this.ano;
 		
 		if (this.hora == -1) {
 			System.out.println(data);
 		} else {
 			String horario = ":" + this.minuto + ":" + this.segundo;
 			
 			if (formato == Data.FORMATO_24H) {
 				if (this.hora == 0) {
 					horario = this.hora + horario;
 				} else if (this.hora > 0 && this.hora < 12) {
 					horario = (this.hora + 12) + horario;
 				} else {
 					horario = this.hora + horario; 	
 				}
 			} else {
 				if (this.hora == 0) {
 					horario = 12 + horario;
 					horario += " AM";
 				} else if (this.hora >= 12) {
 					horario = (this.hora - 12) + horario;
 					horario += " PM";
 				} else {
 					horario = this.hora + horario;
 					horario += " AM";
 				}
 			}
 			System.out.println(data + " " + horario);
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
