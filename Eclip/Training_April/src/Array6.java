import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Second highest Program:
	Array6 arr = new Array6();
	arr.secondmax();
	}

	private void secondmax() {
	// TODO Auto-generated method stub
	 Scanner scanner = new Scanner(System.in);
	 int second[]= {100,20,80,40,50,70};
	
	 int max=Integer.MIN_VALUE;
	 int smax=Integer.MIN_VALUE;

	 for(int i=0;i<second.length;i++) {
		 if(second[i]>max)
		 {
			 smax=max;
			 max=second[i];}
		 else if(second[i]>smax) {
			 smax=second[i];
		 }
	 }System.out.println(smax);
System.out.println(max);
	}

}
