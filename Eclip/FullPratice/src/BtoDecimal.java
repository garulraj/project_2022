import java.util.Scanner;

public class BtoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary=1010;
		int count=0;;
		while(binary>0) {
		int dec=binary%10;
		//System.out.println(dec);
		binary=binary/10;
		String a="";
		a=a+dec;
		 count++;
		//System.out.println(a);
		//System.out.println("digits="+count);
		//System.out.println(dec);
		BtoDecimal bb = new BtoDecimal();
		//bb.calc();
		bb.display();
		}

	}

	private void display() {
		// TODO Auto-generated method stub
		
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Ente the no:");
		a=in.nextInt();
		int b=a;
		int binary;
		int count=-1;
		//if(a>1) {
			while(a>0) {
				System.out.println(a%10);
				a=a/10;
				count++;				
			}
			double mul=2;
			System.out.println("count ="+count);
			double result=Math.pow(mul, count);
			result=result+b%10;
			System.out.println(result);
			
		//}
	}

	private void calc() {
		// TODO Auto-generated method stub
		double count=3;double mul=2;
		double result=0;
		result=Math.pow(mul, count);
		System.out.println(result);
		
	}

}
