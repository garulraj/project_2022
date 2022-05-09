import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Arulraj/";
		int age = 26;
		String Degree="/BSCcs/";
		 
		String str=name+age+Degree;
		
		//System.out.println(name/+age/+Degree);
		System.out.println(str);
		int age1;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your age:");
		age1 = in.nextInt();
		String replaced=name+age1+Degree;
		System.out.println(replaced);
		//name.replaceAll(age, replaced)
		

		

	
	}
}
