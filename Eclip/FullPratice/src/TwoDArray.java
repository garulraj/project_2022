import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[][]=new int [2][5];
		Scanner in = new Scanner(System.in);
		
		for(int row=0;row<mark.length;row++) {
		for(int col=0;col<mark[row].length;col++) {
			System.out.println("Enter the No:");
			mark[row][col]=in.nextInt();
		}}
System.out.println(mark.length);
System.out.println(mark[1].length);
	}

}
