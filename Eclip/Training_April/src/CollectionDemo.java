import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		int no=6;
		al.add(5);
		al.add(3);
		al.add("hello");
		al.add(no);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList a2=new ArrayList();
		
		a2.addAll(al);
		System.out.println(a2);
		a2.clear();
		System.out.println(a2);
		a2.add(10);
		a2.add("help");
		a2.add(122);
		a2.add(42.3);
		System.out.println(a2);
		System.out.println(a2.contains("help"));
		System.out.println(al.containsAll(a2));
		a2.remove("help");
		a2.remove(42.3);
		System.out.println(a2);
		a2.removeAll(al);
		System.out.println(al);
		System.out.println(a2);
		


	}

}
