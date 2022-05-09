
public class Patten10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*exop
		 * * * * * *	12345   54321 12345     5
		 * * * * *		1234    4321  2345		45
		 * * * *		123     321   345		345
		 * * *			12      21    45		2345	
		 * * 			1       1     5			12345
		 */
		/*for(int row=5; row>=1;row--)
		{
			for(int col=1;col<=row;col++) {
				System.out.print(" *");
			}System.out.println();
		}
		int val=1;
      for(int row=5;row>=1;row--) {
    	  for(int col=1;col<=row;col++) {
    		  System.out.print(val);
    		  val++;
      	  }System.out.println();
      }*/		
		
		for(int row=5;row>=1;row--) {
			for(int col=5;col<=row;col--) {
				System.out.print(col+" ");
				
			}System.out.println();
		}
	
	}
	

}
