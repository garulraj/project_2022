import java.io.StringReader;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		str=in.next();
		String a[]=str.split("/");
		//System.out.println(a[1]);
		System.out.println("Please enter your age:");
		String age= in.next();
		//System.out.println(a[0]+"/"+age+"/"+a[2]);
		//StringBuffer in= new StringBuffer();
		String newStr = str.replaceAll(a[1], age);
		System.out.println(newStr);
 	}

}
