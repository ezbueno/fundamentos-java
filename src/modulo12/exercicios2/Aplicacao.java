package modulo12.exercicios2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Ezandro Bueno
 * Crie uma classe Produto com dois atributos: nome (String) e valor (double). Implemente a 
 * interface Comparable de forma que os produtos possam ser ordenados em ordem crescente 
 * de valor quando adicionados a um Set. Sobrescreva também os métodos equals() e 
 * hashCode(), considerando que produtos iguais são produtos que possuem o mesmo nome. E 
 * por último sobrescreva também o método toString(), para mostrar uma representação 
 * amigável do produto quando ele for impresso no console. 
 * Na sequência crie uma classe Produtos, responsável por armazenar os produtos criados. Esta 
 * classe tem um atributo produtos, do tipo Collection<Produto>, e os métodos 
 * adicionar(), que adiciona um produto à coleção, e imprimir(), que imprime todos os 
 * produtos.
 * Crie uma aplicação que cria os seguintes produtos:
 * Nome			Valor
 * Laranja		2,50
 * Laranja		2,70
 * Maçã			1,45
 * Mamão		4,95
 * Limão		2,30
 * Experimente adicionar os produtos acima a coleções de diversos tipos, como ArrayList, 
 * HashSet e TreeSet, e imprima os resultados. Lembre-se que todos estes tipos podem ser 
 * atribuídos ao atributo produtos, pois todos são do tipo Collection. Procure perceber o que 
 * acontece com os elementos quando você muda o tipo de coleção na qual o produto está 
 * inserido, com relação à duplicidade de elementos e ordenação. 
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Laranja", 2.50);
		Produto p2 = new Produto("Laranja", 2.70);
		Produto p3 = new Produto("Maçã", 1.45);
		Produto p4 = new Produto("Mamão", 4.95);
		Produto p5 = new Produto("Limão", 2.30);
		
		Produtos produtos = new Produtos(new ArrayList<>());
		
		produtos.adicionar(p1);
		produtos.adicionar(p2);
		produtos.adicionar(p3);
		produtos.adicionar(p4);
		produtos.adicionar(p5);
		produtos.imprimir();

		produtos.mudarColecao(new HashSet<>());
		produtos.imprimir();
		
		produtos.mudarColecao(new TreeSet<>());
		produtos.imprimir();
	}
}
