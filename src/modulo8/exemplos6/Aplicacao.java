package modulo8.exemplos6;

public class Aplicacao {

	public static void main(String[] args) {

		ContatoPJ c1 = new ContatoPJ();
		c1.setNome("José");
		c1.setCnpj("05.006.456/0001-45");

		c1.getEndereco().setRua("Rua dos Limões");
		c1.getEndereco().setNumero("100");
		c1.getEndereco().setCidade("Ribeirão Distante");
		c1.getEndereco().setEstado("Passarinho");

		Agenda a = new Agenda();
		a.setContato1(c1);

		imprimirNomes(a);
		imprimirCNPJ(a);

		System.out.println("Contato definido");
	}

	private static void imprimirNomes(Agenda agenda) {
		if (agenda.getContato1() != null) {
			System.out.println(agenda.getContato1().getNome());
		}

		if (agenda.getContato2() != null) {
			System.out.println(agenda.getContato2().getNome());
		}

		if (agenda.getContato3() != null) {
			System.out.println(agenda.getContato3().getNome());
		}
	}
	
	private static void imprimirCNPJ(Agenda agenda) {
		if (agenda.getContato1() != null && agenda.getContato1() instanceof ContatoPJ c) {
			c = (ContatoPJ) agenda.getContato1();			
			System.out.println(c.getCnpj());
		}

		if (agenda.getContato2() != null) {
			ContatoPJ c = (ContatoPJ) agenda.getContato2();			
			System.out.println(c.getCnpj());
		}

		if (agenda.getContato3() != null) {
			ContatoPJ c = (ContatoPJ) agenda.getContato3();			
			System.out.println(c.getCnpj());
		}
	}
}
