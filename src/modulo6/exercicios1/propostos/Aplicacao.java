package modulo6.exercicios1.propostos;

/**
 * @author Ezandro Bueno
 * Crie duas classes: Ponto2D e Ponto3D. Ponto2D possui como atributos as coordenadas x e y, 
 * enquanto Ponto3D, além delas, também possui a coordenada z. Utilize a relação de herança 
 * para representar estas classes. 
 * A respeito dos construtores, Ponto2D deve ter apenas um construtor, que recebe os valores 
 * de x e y como parâmetros (tipo double). Já Ponto3D também deve ter apenas um construtor, 
 * que deve receber x, y e z como parâmetros (também do tipo double). 
 * Dica: Se a relação de herança e a declaração dos construtores foram feitas corretamente, 
 * você deverá, obrigatoriamente, chamar o construtor da superclasse explicitamente. 
 * Ambas as classes devem sobrescrever o método toString(), que é originalmente declarado 
 * na classe Object. Este método deve retornar uma representação do objeto em forma de 
 * String, indicando qual o valor de cada coordenada. É importante que Ponto3D tire proveito do 
 * método toString() de Ponto2D para mostrar os valores das coordenadas x e y. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		Ponto2D ponto2d = new Ponto2D(10, 2);
		System.out.println(ponto2d);
		
		Ponto3D ponto3d = new Ponto3D(5, 2, 1);
		System.out.println(ponto3d);
	}
}
