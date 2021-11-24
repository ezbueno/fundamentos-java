package modulo12.exemplos7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {
		
		Map<Integer, Produto> map = new HashMap<>();
		
		Produto p1 = new Produto(1, "Produto 1");
		Produto p2 = new Produto(2, "Produto 2");
		Produto p3 = new Produto(3, "Produto 3");
		
		map.put(1, p1);
		map.put(2, p2);
		map.put(3, p3);
		
		Produto p = map.get(2);
		System.out.println(p);
		
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		Collection<Produto> values = map.values();
		for (Produto prod : values) {
			System.out.println(prod);
		}
		
		Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		for (Map.Entry<Integer, Produto> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
