package modulo12.exemplos5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("abc");
		lista.add("def");
		lista.set(0, "ghi");
		
		lista.forEach(System.out::println);
		
		System.out.println("----------");
		
		Iterator<String> it = lista.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
