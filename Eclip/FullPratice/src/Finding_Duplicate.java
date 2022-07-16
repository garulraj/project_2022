import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Finding_Duplicate {
	public static void main(String[] args) {
		ArrayList no = new ArrayList();
		no.add(10);
		no.add(3);
		no.add('h');
		no.add(5);
		no.add("false");
		no.add(5);
		System.out.println(no);
		LinkedHashSet ls = new LinkedHashSet();
		for(Object ob:no) {
			boolean add=ls.add(ob);
			if(add==false) {
				System.out.println(ob);
			}
		}
	}

}
