import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 ar = new Array2();
		ar.getmark();

	}

	private void getmark() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of sub:");
		int count = in.nextInt();
		int[] marks = new int[count];
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter the marks");
			marks[i]=in.nextInt();
		
		}
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
	}

	
		
	}


