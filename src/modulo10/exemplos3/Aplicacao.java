package modulo10.exemplos3;

public class Aplicacao {

	public static void main(String[] args) {
		
		Handler h = new Handler();
		
		int i = 10;		
		h.setObject(i);
		
		int i2 = (int) h.getObject();
		System.out.println(i2);
		
		double d = somar(4.0, 5.0);
		System.out.println(d);
		
		Double d1 = 4.0;
		Double d2 = 5.0;
		
		double resultado = somar(d1, d2);
		System.out.println(resultado);
		
		Integer i3 = 5;
		i3++;
		System.out.println(i3);
	}
	
	private static double somar(double d1, double d2) {
		return d1 + d2;
	}
}
