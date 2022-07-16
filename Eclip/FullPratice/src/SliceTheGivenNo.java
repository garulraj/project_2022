
public class SliceTheGivenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=4321;
		int a=4321;
		int digits=0;
		int add=0;
		while(a>0) {
		System.out.println(a%10);
		add=(add*10)+(a%10);
		a=a/10;
		digits++;
		}
		System.out.println("digits=" +digits);
		System.out.println("total="+add);
	/*	int a,b,c,d;
		a=z/1000;
		b=z/100%10;
		c=z/10%10;
		d=z%10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		/*int a=z%10;
		z=z/10;
		System.out.println(a);
		int b=z%10;
		z=z/10;
		System.out.println(b);
		int c=z%10;
		z=z/10;
		System.out.println(c);
		int d=z%10;
		z=z/10;
		System.out.println(d);
		System.out.println("Its a new method I have tried");
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);*/
		

	}

}
