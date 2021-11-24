package modulo12.exemplos2;

public class Aplicacao {

	public static void main(String[] args) {
		
		String[] array = new String[7];
		array[0] = "a";
		array[1] = "b";
		
		for (String s : array) {
			System.out.println(s);
		}
		
		Object[] array2 = new Object[7];
		array2[0] = "a";
		array2[1] = new Object();
		array2[2] = new int[3];
		array2[3] = 10;
		
		String str = (String) array2[0];
		System.out.println(str);
		
		int i = (int) array2[3];
		System.out.println(i);
	}
}
