import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array5 ar = new Array5();
          ar.getmarks();
	
	
	}

	private void getmarks() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter Total sub:");
		int count = in.nextInt();
		int higest=0;int index=0;
		int marks[] = new int[count];
		for(int i=0;i<marks.length;i++) {
			System.out.println("Please enter your marks:");
			marks[i]=in.nextInt();
		}for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}higest =marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]>higest) {
				higest=marks[i];
			index=i;}
		}in.close();
		System.out.println("Higest is ="+higest);
		System.out.println(index);
	}

}
