package modulo4.exemplos.sobrecarga;

public class Aplicacao {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		int soma = m.somar(10, 20);
		System.out.println(soma);
		
		double soma2 = m.somar(10.0, 20.0);
		System.out.println(soma2);
	}
}
