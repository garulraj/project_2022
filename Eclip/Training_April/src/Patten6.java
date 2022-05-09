
public class Patten6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * exp op
		 * 1 2 3 4 5
		 * 6 7  8 9 
		 * 10 11 12
		 * 13 14
		 * 15
		 */
		int val=1;
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
				val++;
			}System.out.println();
		}
		
		/*for(int col=1;col<=5;col++) {
			System.out.print(col);
		}System.out.println();
		for(int col=1;col<=4;col++) {
			System.out.print(col+5);
		}System.out.println();
		for(int col=1;col<=3;col++) {
			System.out.print(col+9);
		}System.out.println();
		for(int col=1;col<=2;col++) {
			System.out.print(col+12);
		}System.out.println();
		for(int col=1;col<=1;col++) {
			System.out.print(col+14);
		}System.out.println();*/

	}

}
