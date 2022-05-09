import java.util.Scanner;

public class Projects2 {
	
	 
 	public static void main(String[] args) {
	    ProjectSource sc=new ProjectSource();
	    Scanner in=new Scanner(System.in);
	 
	     int no=1947;//user need to find this number
	 
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
	 
	     //conditions for check output.
	     //if the input Wrong it display "W"
	    //if the input displaced it display "P"
	    if(no==userno) {
	    	System.out.println("You Entered correct");
	    }
	    
	 
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


