package modulo6.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie duas classes: Ponto2D e Ponto3D. Ponto2D possui como atributos as coordenadas x e y, 
 * enquanto Ponto3D, al�m delas, tamb�m possui a coordenada z. Utilize a rela��o de heran�a 
 * para representar estas classes. 
 * A respeito dos construtores, Ponto2D deve ter apenas um construtor, que recebe os valores 
 * de x e y como par�metros (tipo double). J� Ponto3D tamb�m deve ter apenas um construtor, 
 * que deve receber x, y e z como par�metros (tamb�m do tipo double). 
 * Dica: Se a rela��o de heran�a e a declara��o dos construtores foram feitas corretamente, 
 * voc� dever�, obrigatoriamente, chamar o construtor da superclasse explicitamente. 
 * Ambas as classes devem sobrescrever o m�todo toString(), que � originalmente declarado 
 * na classe Object. Este m�todo deve retornar uma representa��o do objeto em forma de 
 * String, indicando qual o valor de cada coordenada. � importante que Ponto3D tire proveito do 
 * m�todo toString() de Ponto2D para mostrar os valores das coordenadas x e y. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		Ponto2D ponto2d = new Ponto2D(10, 2);
		System.out.println(ponto2d);
		
		Ponto3D ponto3d = new Ponto3D(5, 2, 1);
		System.out.println(ponto3d);
	}
}
