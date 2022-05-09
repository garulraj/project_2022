
public class lettersusingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lettersusingJava lt = new lettersusingJava();
		lt.a();

	}

	private void a() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1||row==4||row==7) {
			for(int col=1;col<=7;col++) {
			System.out.print("*");	
			}
			}
			else {
				for(int col=1;col<=7;col++) {
					if(col==1||col==7) {
						System.out.print("* "
								+ "");
					}
					else {
						System.out.print(" ");
					}
			}}
			System.out.println();
		}
		
	}

}
