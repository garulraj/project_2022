
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Arulraj"; 
		int[] freq = new int[name.length()];
		int j =0; 
		while(j<name.length())
		{
		char ch = name.charAt(j); 
		int count = 1; 
		for(int i=j+1; i<name.length(); i++)
		{
		if(ch == name.charAt(i))
			{
			count++; 
			freq[i] = -1; 
			}
		}
		if(freq[j]!=-1)
		freq[j] = count; 
		j++; 
		}
		for(int i=0; i<freq.length; i++)
		{
		if(freq[i]>0)
		{
System.out.println(name.charAt(i) + " appears " + freq[i] + " times"); 
		}
		}

	}

}
