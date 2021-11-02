package modulo7.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * O Java possui uma interface chamada Cloneable, que pode ser implementada por classes que 
* são capazes de gerar cópias de objetos. Esta interface não possui métodos, mas classes que a 
* implementam devem sobrescrever o método clone(), definido na classe Object. Dentro 
* deste método é implementada a lógica para criar um novo objeto com base no objeto original. 
* Com base nisto, crie uma classe Porta que suporta a criação de novos objetos (cópia). Ela
* deve ter os atributos altura (double), largura (double) e aberta (boolean). Também deve 
* possuir os métodos abrir(), fechar() e os métodos getters correspondentes aos atributos. 
* Como uma porta pode criar outras cópias dela mesma, você deve sobrescrever o método 
* clone(), o qual deve criar um novo objeto com os valores dos atributos copiados e retorná-lo.
* Dica: O método clone() lança uma exceção (CloneNotSupportedException). Não é preciso 
* se preocupar com ela neste momento, então declare o método main() da sua aplicação da 
 * seguinte forma:
 * public static void main(String[] args) throws CloneNotSupportedException { 
 * //... 
 * }
 */
public class Aplicacao {

	public static void main(String[] args) throws CloneNotSupportedException {
		Porta p1 = new Porta(2.1, 0.9);
		
		p1.abrir();
		
		System.out.println("p1 -> altura = " + p1.getAltura());
		System.out.println("p1 -> largura = " + p1.getLargura());
		System.out.println("p1 -> aberta = " + p1.isAberta());
		
		Porta p2 = (Porta) p1.clone();
		
		System.out.println("p2 -> altura = " + p2.getAltura());
		System.out.println("p2 -> largura = " + p2.getLargura());
		System.out.println("p2 -> aberta = " + p2.isAberta());
	}
}
