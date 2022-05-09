import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ex-op, ini arr, use scanner, get 5 marks and display.
		 */
		Array3 ar = new Array3();
		//ar.getmarks();
		ar.getscore();

				
	}

	private void getscore() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("ENter no of Overs:");
		int ovno = in.nextInt();
		int total=0;
		int index=0;
		int cricket[]=new int[ovno];
		for(int i=0;i<cricket.length;i++) {
			System.out.println("Enter score");
			cricket[i]=in.nextInt();
			total=total+cricket[i];
		}for(int i=0;i<cricket.length;i++) {
			System.out.println(cricket[i]);
			
		}System.out.println("total =" +total);
		System.out.println("Percentage = "+ total/ovno);
		int higest=cricket[0];
		for(int i=1;i<cricket.length;i++) {
			if(cricket[i]>higest) {
				higest=cricket[i];
				index = i;
			}
		}System.out.println("higest is = "+higest);
		System.out.println("index is :"+index);
		
		
		
		
		
		
	in.close();	
	}

	private void getmarks() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter how many subjects:");
		int count = in.nextInt();
		int mark[] = new int[count];
		for(int a=0;a<mark.length;a++) {
			System.out.println("please enter your mark:");
			mark[a]=in.nextInt();
		}
		for(int i=1;i<mark.length;i++) {
			System.out.println(mark[i]);
		}
	}

}
