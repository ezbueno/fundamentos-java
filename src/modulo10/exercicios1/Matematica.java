package modulo10.exercicios1;

public class Matematica {

	enum TipoAngulo {
		GRAUS,
		RADIANOS
	}
	
	public static Double converterAngulo(Double angulo, TipoAngulo tipo) {
		if (tipo.equals(TipoAngulo.GRAUS)) {
			return Math.toRadians(angulo);
		}		
		return Math.toDegrees(angulo);
	}
	
	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		return n1 + n2 + n3;
	}
	
	public static Integer converterBinarioParaDecimal(String numBinario) {
		return Integer.parseInt(numBinario, 2);
	}
}
