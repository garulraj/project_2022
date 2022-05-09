import java.util.Scanner;

public class Password1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password1 ps=new Password1();
		ps.getinput();
		ps.lengthcheck();
		
		
		int low=0;
		int up=0;
		int num=0;
		int count = password.length();
		if(count>=6) {
		
		for(int i=0;i<password.length();i++) { 		
		char c= password.charAt(i);
		//System.out.println(c);	
		if(Character.isUpperCase(c))
		up++;
		if(Character.isLowerCase(c))
			low++;
		}
		}else {
			System.out.println("Please retry");
			}
		
		if(up>=1 && low>=1) {
			System.out.println("reached");
		}else
			System.out.println("retry");
		
		
		/*if((count>=6)&&(count<8)) {
			System.out.println("week password");
		}
		else if((count>=8)&&(count<10)){
			System.out.println("Strong Password");
		}
		else if(count>=10){
			System.out.println("very strong Password");
		}
		
		else
			System.out.println("please check your password");
		*/
	}

	private void lengthcheck() {
		// TODO Auto-generated method stub
		
	}

	private void getinput() {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String password;
		System.out.println("Please Enter your Password");
		password=in.next();	
	}

	
	
}
