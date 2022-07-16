import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(5);
		al.add("true");
		al.add('h');
		al.add(5);
		al.add(12);
		System.out.println(al);
		LinkedHashSet st = new LinkedHashSet();
		//System.out.println(st);
		
		for(Object ob:al) {
			//System.out.println(st.add(ob));
			boolean add=st.add(ob);
			if(add==false) {
				System.out.println(ob);
			}
		}
		

	}

}
