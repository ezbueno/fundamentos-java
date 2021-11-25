package modulo12.exemplos9;

import java.util.Comparator;

public class DescricaoComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		if (p1.getDescricao().equals(p2.getDescricao())) {
			return 0;			
		}
		
		if (p1.getDescricao().compareTo(p2.getDescricao()) > 0) {
			return 1;
		}
		
		return -1;
	}
}
