
public class alphainfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) {
		if(row==1||row==5||row==9) 
		{
			for(int col=1;col<=7;col++){
			System.out.print("*");	
			
			}
		}
		else{
			for(int col=1;col<=7;col++)
			{
				if(col==1||col==7) {
					System.out.print("* ");

					}
				
				else {				
					System.out.print(" ");
				 }
 			}
			
		}
		System.out.println();
		}
		
	}

}
