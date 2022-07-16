
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int n,m;
		while(i<=100) {
			//n=i%2;
			//m=i%3;
			
			if((i%2==0)||(i%3==0)) {
				//System.out.println(i +"Not Prime");
				
			}else
				System.out.println(i+" prime");
			i++;
		}

	}

}
