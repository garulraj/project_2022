import java.util.Scanner;

public class TwoDtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[][]= new int[2][5];
		Scanner in = new Scanner(System.in);
		
		for(int row=0;row<mark.length;row++) {
			
			for(int col=0;col<mark[row].length;col++) {
				System.out.println("Enter the mark:");
				mark[row][col]=in.nextInt();				
			}}
			int row=5;
			for(int i=0;i<mark.length;i++) {
				for(int j=0;j<mark[i].length;j++) {
					System.out.print(mark[i][j]+" ");
				}
			}
		
		
		

	}

}
