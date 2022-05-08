import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding the correct number.
		
		int a=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any four no:");
		int no=sc.nextInt();
		
		if(no==a) {
			System.out.println("You entered correct");
		}else
			System.out.println("Please try again");
	}

}
