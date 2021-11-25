package modulo12.exemplos9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {

		Produto p1 = new Produto(4, "Arroz", 3.9);
		Produto p2 = new Produto(3, "Feijão", 3.9);
		Produto p3 = new Produto(5, "Macarrão", 2.9);
		Produto p4 = new Produto(1, "Lentilha", 6.5);
		Produto p5 = new Produto(2, "Lasanha", 8.0);

		Set<Produto> produtos = new TreeSet<>(new DescricaoComparator());
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);

		for (Produto p : produtos) {
			System.out.println(p);
		}

		System.out.println("-------------------");

		List<Produto> prods = new ArrayList<>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		Collections.sort(prods);

		for (Produto p : prods) {
			System.out.println(p);
		}

		System.out.println("-------------------");

		List<Produto> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);

		Collections.sort(products, new DescricaoComparator());

		for (Produto p : products) {
			System.out.println(p);
		}
	}
}
