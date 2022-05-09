import java.util.Scanner;

public class TwodArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]=new int[2][5];
		Scanner sc =new Scanner(System.in);
		int temp=0;
		String[] name= {"Arul", "raj"};
		for(int row=0;row<ar.length;row++) {
			int total=0;
			for(int col=0;col<ar[row].length;col++) {
				System.out.println("Please enter the val:");
			ar[row][col]=sc.nextInt();
			total=total+ar[row][col];
			}System.out.println("Total is" + name[row]+ total);
			if(total>temp) {
				temp=total;
			}
		
		}System.out.println("Higest total is:"+temp);
	
	
	}	
		
	}
	

