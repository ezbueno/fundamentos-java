package switch_expressions;

public class Main {
	
	public enum DiaDaSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	}

	public static void main(String[] args) {
		DiaDaSemana d = DiaDaSemana.QUARTA;
		
		// Switch tradicional
//		switch(d) {
//		case SEGUNDA: System.out.println(1);
//		break;
//		case TERCA: System.out.println(2);
//		break;
//		}
		
		// Switch Expressions para 1 instrução
		switch(d) {
		case SEGUNDA -> System.out.println(1);
		case TERCA -> System.out.println(2);
		default -> System.out.println("outro");
		}
		
		// Switch Expressions para instruções maiores
//		switch(d) {
//		case SEGUNDA -> {
//			System.out.println(1);
//			System.out.println(d);
//		} case TERCA -> {
//			System.out.println(2);
//			System.out.println(d);
//		}
//		}
		
		// Atribuir o resultado de uma Switch Expressions para um resultado
		int i = switch(d) {
			case SEGUNDA -> 1;
			case TERCA -> 2;
			default -> 0;
		};
		
		System.out.println(i);
	}
}
