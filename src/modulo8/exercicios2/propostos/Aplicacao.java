package modulo8.exercicios2.propostos;

public class Aplicacao {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Object o = null;

		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("O m�todo est� sendo chamado em um objeto nulo");
		} finally {
			System.out.println("Fim do m�todo");
		}
	}
}
