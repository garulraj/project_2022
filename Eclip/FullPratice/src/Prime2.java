
public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primecount=1;
		int start=2;
		int upto;
		while(primecount<=20) {
			++start;
			upto=(int)Math.sqrt(start);
			
			int primeflag=1;
			for(int i=2; i<=upto;i++) {
				if(start%i==0) {
					primeflag=0;	
					break;
				}
				if(primeflag==1) {
					primecount++;
					System.out.println(start);
					System.out.println("primecount"+primecount);
					//System.out.println(i);
				}
			}
			
		}
		
		

	}

}
