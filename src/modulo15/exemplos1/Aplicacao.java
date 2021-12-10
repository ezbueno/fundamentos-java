package modulo15.exemplos1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("([a-z])+");
		Matcher m = p.matcher("a1bc2def3");
		
		 while (m.find()) {
			 int pos = m.start();
			 String group = m.group();
			 
			 System.out.println(pos + " => " + group);
		 }
	}
}
