import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception_demo1 de = new Exception_demo1();
		de.div();
		de.add();
  	}

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am here");
		
	}

	public void div()throws InputMismatchException{
		// TODO Auto-generated method stub
		int a, b;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Please enter a");
		a = in.nextInt();
		System.out.println("please enter b");
		b=in.nextInt();
		
		System.out.println(a/b);
		 
		
	}

	
		
	}
