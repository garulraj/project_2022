
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6789;
		int b=a;
		int pal=6789;
		int rev=0;
		while(a>0) {
		 rev=(rev*10)+a%10;
		 a=a/10;
		} 
		System.out.println(rev);
		System.out.println(a);
		if(b==pal)
		{
			System.out.println("Yes its pal");
		}
		else
			System.out.println("Ohh no dear!!");

	}

}
