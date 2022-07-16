import java.util.ArrayList;

public class CollPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("hello");
		al.add('j');al.add(98944);
		System.out.println(al);
		System.out.println(al.size());
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		al2.clear();
		System.out.println(al2);

		al2.add(10);
		al2.add(22);
		al2.add("hai");
		System.out.println(al2);
		

	}

}
