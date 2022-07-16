import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter subject");
		int count=in.nextInt();
		int marks[]=new int[count];
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Please enter your marks");
			marks[i]=in.nextInt();
		}System.out.println("OUTPUT");
		for(int i=0;i<marks.length;i++) {
			System.out.println("Subject "+"="+marks[i]);
		}
		int higest=0;
		for(int i=0;i<marks.length;i++) {
			if(higest<marks[i]) {
				higest=marks[i];
			}
		}System.out.println("Higest mark is:"+higest);
		

	}

}
