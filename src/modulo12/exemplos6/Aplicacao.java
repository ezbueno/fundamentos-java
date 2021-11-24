package modulo12.exemplos6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("A7");
		set.add("B6");
		set.add("C5");
		set.add("D4");
		set.add("E3");
		set.add("F2");
		set.add("G1");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("------");
		
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("D4");
		set2.add("C5");
		set2.add("A7");
		set2.add("E3");
		set2.add("B6");
		set2.add("F2");
		set2.add("G1");
		
		for (String s : set2) {
			System.out.println(s);
		}
		
		System.out.println("------");
		
		Set<String> set3 = new TreeSet<>();
		set3.add("D4");
		set3.add("C5");
		set3.add("A7");
		set3.add("E3");
		set3.add("B6");
		set3.add("F2");
		set3.add("G1");
		
		for (String s : set3) {
			System.out.println(s);
		}
	}
}
