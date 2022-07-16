import java.util.Scanner;

public class TestPatten2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value");
		int no=in.nextInt();
		int i=no; int j=1;
		
		for(int col=no;col>=1;col--) {
			
			
			for(int row=no;row>=1;row--) {
				System.out.print(" ");
				if(row==i||row==j) {
					System.out.print(row);
				}
				
			}System.out.println();i--;j++;
		}
		
	}

}
