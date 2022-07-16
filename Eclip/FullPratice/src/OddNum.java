import java.util.ArrayList;
import java.util.Iterator;

public class OddNum {
	static int a=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddNum od = new OddNum();
		// od.display();
		 od.result();

	}

	private void result() {
		// TODO Auto-generated method stub
ArrayList al = new ArrayList();
al.add(10);
al.add(5);
al.add(7+1);
al.add("Hello");
al.add(55);

	//System.out.println(al);
	/*for(Object n:al) {
		try {
		Integer in=(Integer)n;
		if(in%2==0) {
			System.out.println(in);}
		}catch(ClassCastException ce) {
			
		}*/
	Iterator ii= al.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next()+ " ");
		}
	}
	
	}//

	public static void display() {
		// TODO Auto-generated method stub
		//this.a=a;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}

}
