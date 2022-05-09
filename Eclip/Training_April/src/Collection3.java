
public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(5); 
		al.add(10); 
		al.add(true); 
		al.add("jenifer");
		al.add('c'); 
		al.add(43.4f);
		al.add(456);
		System.out.println(al);
		int[] ar = {10,20,2}; 
		for(Object no:al)
		{
			try {
			Integer in = (Integer)no;
			System.out.println(no);
			}
			catch(ClassCastException cce)
			{
				
			}
			
		}
	}

}
