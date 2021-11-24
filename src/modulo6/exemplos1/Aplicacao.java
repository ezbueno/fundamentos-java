package modulo6.exemplos1;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("Carro");
		Carro carro = new Carro();
		carro.setMarca("XYZ");
		carro.setModelo("ABC");
		carro.setAno(2000);
		carro.setQuatroPortas(true);
		carro.imprimirDados();
		
		System.out.println("Motocicleta");
		Motocicleta motocicleta = new Motocicleta();
		motocicleta.setMarca("QQQ");
		motocicleta.setModelo("ZZZ");
		motocicleta.setAno(2010);
		motocicleta.imprimirDados();		
	}
}
