
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {20,15,13,8};
		int temp=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
			temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
			}
		}
		
		int len=ar.length;
		System.out.println(ar[len-1]);
		System.out.println(ar.length);
	}

}
