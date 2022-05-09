
public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		looping lo = new looping();
		//lo.oddno();
		System.out.println();
		//lo.eveodd();
		System.out.println();
		//lo.star();
		//lo.oddNeven();
		//lo.nump1();
		lo.same1();
		//lo.reverse1();
		

	}

	private void reverse1() {
		// TODO Auto-generated method stub
		
 		for(int no=1;no<=1;no++) {
		System.out.print(1);
		}System.out.println();
 		for(int no=1;no<=2;no++) {
			System.out.print(1);
			}
			System.out.println();
		for(int no=1;no<=3;no++) {
			System.out.print(1);
			}
			System.out.println();
		for(int no=1;no<=4;no++) {
			System.out.print(1);
			}
			System.out.println();
		for(int no=1;no<=5;no++) {
			System.out.print(1);
			}

	}

	private void same1() {
		// TODO Auto-generated method stub
		
		for(int row=5;row>=1;row--) {
			for(int no=1;no<=row;no++) {
			System.out.print(row+" ");	
		    }System.out.println();
			}
		
		/*int row=5;
		for(int no=1;no<=row;no++) {
			System.out.print(1+" ");	
		    }row--;
 		    System.out.println();
			for(int no=1;no<=row;no++) {
			System.out.print(1+" ");
			}row--;
			System.out.println();
			for(int no=1;no<=row;no++) {
			System.out.print(1+" ");
			}row--;
			System.out.println();
			for(int no=1;no<=row;no++) {
			System.out.print(1+" ");
			}row--;
			System.out.println();
			for(int no=1;no<=row;no++) {
			System.out.print(1+" ");
			}row--;*/
	
	
		} 

		
	

	private void nump1() {
		// TODO Auto-generated method stub
		for(int count=1;count<=5;count++) {
		for(int no=1;no<=7;no++) {
			System.out.print(count);
		}System.out.println();
		}

		
		
	}

	private void oddNeven() {
		// TODO Auto-generated method stub
		for(int no=1;no<=10;no+=2) {
			System.out.println(no);
			if(no==9) {
				no=-2;
			}
		}
		
	}

	private void star() {
		// TODO Auto-generated method stub
		int no=15;
		for(int row=5;row>0;row--) {
		for(int col=1;col<=row;col++) {
			System.out.print(no+" ");
			no--;
		}		System.out.println();

		}
		
	}

	private void eveodd() { 	
		// TODO Auto-generated method stub
		for(int no=2; no<=10;no+=2) {
			System.out.print(no);
		}
		
	}

	private void oddno() {
		// TODO Auto-generated method stub
		for(int no=1;no<=9;no+=2) {
			System.out.print(no);
		}

		
	}

}
