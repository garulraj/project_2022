import java.util.Scanner;

public class DtoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec =10;String binary="";
		while(dec>0) {
		//System.out.println(dec%2);
		binary = binary+dec%2;
		dec=dec/2;
		System.out.println(binary);
		
		
		//System.out.println(d);
		}
		 //int u;
		 //Scanner in = new Scanner(System.in);
		 
		// System.out.println("Enter the value");
		// u=in.nextInt();
		 //System.out.println(Integer.toBinaryString(u));

	}

}
