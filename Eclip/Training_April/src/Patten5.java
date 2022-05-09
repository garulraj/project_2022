
public class Patten5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ex op
		 * 11111
		 * 2222
		 * 333
		 * 44
		 * 5
		 */
		//int val =1;
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}System.out.println();
			//val++;

		}
	}

}
