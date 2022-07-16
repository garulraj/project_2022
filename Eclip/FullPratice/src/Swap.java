
public class Swap {
	int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Swap two variables.
		Swap s = new Swap();
		s.display();

	}
	private void display() {
		// TODO Auto-generated method stub
   int a = 1000; int b=200;
   		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
