import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array4 ar = new Array4();
		//ar.getsalary();
		ar.high();
	}

	private void high() {
		// TODO Auto-generated method stub
		int salary_high[] = {1000, 1500,1800,2500};
		int higest = salary_high[0];
		for(int i=1;i<salary_high.length;i++) {
			if(salary_high[i]>higest)
				higest=salary_high[i];
		}
		System.out.println(higest);
	}

	private void getsalary() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Please enter how many emp:");
		Scanner in=new Scanner(System.in);
		int count = in.nextInt();
		int salary[] = new int[count];
		int total =0;
		int avg;
		for(int i=0;i<salary.length;i++) {
			System.out.println("Please enter your salary:");
			salary[i] = in.nextInt();
			total=total+salary[i];
		}for(int i=0;i<salary.length;i++) {
			System.out.println(salary[i]);
		}			System.out.println(total);
		System.out.println("Avg : = " +total/count);

	}

}
