package modulo7.exercicios3.propostos;

/**
 * @author Ezandro Bueno
 * O Java possui uma interface chamada Cloneable, que pode ser implementada por classes que 
* s�o capazes de gerar c�pias de objetos. Esta interface n�o possui m�todos, mas classes que a 
* implementam devem sobrescrever o m�todo clone(), definido na classe Object. Dentro 
* deste m�todo � implementada a l�gica para criar um novo objeto com base no objeto original. 
* Com base nisto, crie uma classe Porta que suporta a cria��o de novos objetos (c�pia). Ela
* deve ter os atributos altura (double), largura (double) e aberta (boolean). Tamb�m deve 
* possuir os m�todos abrir(), fechar() e os m�todos getters correspondentes aos atributos. 
* Como uma porta pode criar outras c�pias dela mesma, voc� deve sobrescrever o m�todo 
* clone(), o qual deve criar um novo objeto com os valores dos atributos copiados e retorn�-lo.
* Dica: O m�todo clone() lan�a uma exce��o (CloneNotSupportedException). N�o � preciso 
* se preocupar com ela neste momento, ent�o declare o m�todo main() da sua aplica��o da 
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
