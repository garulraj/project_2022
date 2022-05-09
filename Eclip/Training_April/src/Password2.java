import java.util.Scanner;

public class Password2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String password;
		System.out.println("Please Enter your Password");
		password=in.nextLine();
		
		
		int count=password.length();
		int upChars=0, lowChars=0, digits=0;
		
		for(int i=0;i<count;i++) {
		char c=password.charAt(i);
		 c = password.charAt(i);
         if(Character.isUpperCase(c))
            upChars++;
         else if(Character.isLowerCase(c))
            lowChars++;
         else if(Character.isDigit(c))
            digits++;
         System.out.print(upChars );
         System.out.print(lowChars );
         System.out.print(digits );
 		}
 
}
}
