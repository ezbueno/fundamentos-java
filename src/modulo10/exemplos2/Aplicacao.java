package modulo10.exemplos2;

public class Aplicacao {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(20);
		imprimir(i);
		
		Double d = Double.valueOf(23.5);
		imprimir(d);
		
		int i2 = i.intValue();
		System.out.println(i2);
		
		double d2 = d.doubleValue();
		System.out.println(d2);
		
		Integer i3 = Integer.valueOf("20");
		System.out.println(i3);
		
		Double d3 = Double.valueOf("23.5");
		System.out.println(d3);
		
		int i4 = Integer.parseInt("20");
		System.out.println(i4);
		
		double d4 = Double.parseDouble("23.5");
		System.out.println(d4);
		
		String bin = "0111";
		int i5 = Integer.parseInt(bin, 2);
		System.out.println(i5);
		
		String bin2 = Integer.toBinaryString(7);
		System.out.println(bin2);
		
		imprimir(100);
	}
	
	private static void imprimir(Object object) {
		System.out.println(object);
	}
}
