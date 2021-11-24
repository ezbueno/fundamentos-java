package modulo12.exemplos4;

public class Aplicacao {

	public static void main(String[] args) {
		
		int[][] array = new int[3][5];
		
		array[2][3] = 10;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
