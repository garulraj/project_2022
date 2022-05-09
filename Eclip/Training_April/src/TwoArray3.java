import java.util.Scanner;

public class TwoArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int mark[][]=new int[2][3];
		int max=0;int count=0;
		for(int row=0;row<mark.length;row++) {
			int total=0;
			for(int col=0;col<mark[row].length;col++) {
				System.out.println("Please enter ur Mark:");
			mark[row][col]=sc.nextInt();
			total=total+mark[row][col];
			if(mark[row][col]==100)
				count++;
 			}System.out.println("total="+total);
			System.out.println("count ="+count);
			if(total>max) {
				max=total;
		}
		}System.out.println(max);
		
	}

}
