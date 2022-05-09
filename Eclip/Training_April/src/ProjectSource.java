import java.util.Scanner;

public class ProjectSource {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectSource sc=new ProjectSource();
		Scanner in=new Scanner(System.in);
		 int no=1947;
		 			
		 //seperate the no and name each no;
			int a=no/1000%10;
			int b=no/100%10;
			int c=no/10%10;
			int d=no%10;
		//getting input and seperate it 	
		System.out.println("Please Enter any four digit no:");
		int userno=in.nextInt();
		
		int w=userno/1000%10;
		int x=userno/100%10;
		int y=userno/10%10;
		int z=userno%10;
		
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		//conditions for check output.
		
		if(a==w) {
			System.out.print(w);
		}else if(b==w||c==w||d==w) {
			System.out.print("P");
		}else
			System.out.print("W");
		
		if(b==x) {
			System.out.print(x);
		}else if(a==x||c==x||d==x) {
			System.out.print("P");
		}else
			System.out.print("W");
			
		if(c==y) {
			System.out.print(y);
		}else if(a==y||b==y||d==y) {
			System.out.print("P");
		}else
			System.out.print("W");
		
		if(d==z) {
			System.out.print(z);
		}else if(a==z||b==z||c==z) {
			System.out.print("P");
		}else
			System.out.print("W");
	
	
	
	
	
	
	}
		
		}
			
	

	


