
public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Second lowest.
		
		int m[]= {20,30,50,60,10};
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int i=0;i<m.length;i++) {
			if(m[i]<min) {
				smin=min;
				min=m[i];
			}else if(m[i]<smin)
				smin=m[i];
		}System.out.println(min);
		System.out.println(smin);
	}

}
