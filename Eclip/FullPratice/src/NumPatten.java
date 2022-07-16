import java.util.Scanner;

public class NumPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		//ep op --12345, 2345, 345, 45, 5
		/*int i=5;
		for(int row=i;row>=1;row--) {
			for(int col=i; col>=1;col--) {
				System.out.print(col);
			}System.out.println();*/
		
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int row=in.nextInt();
		
		/*for(int row=5;row>=1;row--) {
			for(int j=row;j>=1;j--) {
				System.out.print(j + " ");
			}System.out.println();
		}*/
		
		for(int row=1;row<=5;row++) {
			for(int col=row;col<=5;col++) {
				System.out.print(col);
			}System.out.println();
		}
		
		
		
	}

}
