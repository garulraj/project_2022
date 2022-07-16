
public class StarandAtPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//patten like *****, @****, @@***, @@@**,
		
		/*for(int row=1;row<=5;row++) {
			for(int at=1;at<row;at++) {
				System.out.print("@ ");
			}
			for(int col=5; col>=row;col--) {
				
				System.out.print("* ");
				
			}System.out.println();
		}*/
		//exp op -- *****, ****
		
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++){
				System.out.print("* ");
				
			}System.out.println();
		}

	}

}
