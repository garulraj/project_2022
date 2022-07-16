
public class AlphPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output is A,
		
		for(int row=1;row<=7;row++) {
			if(row==1||row==7) {
			for(int col=1;col<=7;col++)
			{
				System.out.print("* ");
			}}
			else {
				
				for(int k=1;k<=6;k++) {
					if(k==1) {
				System.out.print("* ");
			}System.out.print("  ");
					}}
			
			System.out.println();
		}
		

	}

}
