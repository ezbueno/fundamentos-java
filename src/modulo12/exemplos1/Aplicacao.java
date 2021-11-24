package modulo12.exemplos1;

public class Aplicacao {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		array[1] = 6;
		array[4] = 7;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("-----------");
		
		for (int num : array) {
			System.out.println(num);
		}
	}
}
