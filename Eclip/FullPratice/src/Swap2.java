import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a and b");
		a=in.nextInt();
		b=in.nextInt();
		//swap this variable without using 3rd var
		in.close();
		a=a+b; //300-200
		b=a-b; //100-100
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
