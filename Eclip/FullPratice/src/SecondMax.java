
public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[]={109,200,305,40};
		int max=0,smax=0;
		
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>max) {
				smax=max;
				max=mark[i];
			}else if(mark[i]>smax) {
				smax=mark[i];
			}
		}System.out.println("Max = :"+ max);
		System.out.println("Min = :" +smax);
		
		
		 

	}

}
