import java.util.Scanner;

public class TestPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*	5    1
		 4  2
		   3
		 2  4
		1	 5  */
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the value:");
		int no=in.nextInt();
		
		for(int i=no;i>=1;i--) {
			System.out.print(" ");
			if(i==5||i==1) {
				System.out.print(i);
			}
			}			System.out.println();
			
		for(int i=no;i>=2;i--) {
			System.out.print(" ");
			if(i==4||i==2) {
				System.out.print(i);
			}			
		}
		System.out.println();
		for(int i=no;i>=3;i--) {
			System.out.print(" ");
			if(i==3) {
				System.out.print(" "+i);
			}}
		System.out.println();
		for(int i=1;i<=no;i++) {
			System.out.print(" ");
			if(i==2||i==4) {
				System.out.print(i);
			}
		}System.out.println();
		for(int i=1;i<=no;i++) {
			System.out.print(" ");
			if(i==1||i==5) {
				System.out.print(i);
			}
		}

	}

}
