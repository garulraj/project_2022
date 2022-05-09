
public class Ls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] marks = {90, 45, 65, 72, 100}; 
		int key = 100; 
		for(int i=0; i<marks.length;i++)
		{
		if(key == marks[i])
			{
			System.out.println("yes, key is present at "+ i);
			break; 
			}*/
		
		int[] ar = {5,10,15,18,21};
		//	  	1   2   3   4
	int key = 180; 
	int min =0, max = ar.length-1;
	while(min<=max)
	{ 
	int mid = (min+max)/2; 
	if(key==ar[mid])
	{
	System.out.println("Yes it is present at " + mid); break;
	}
	if(key<ar[mid]){
		max = mid-1; 
	}
	else if(key>ar[mid]){
		min = mid+1;
		}
	}
	
	if(min>max)
	{
	System.out.println("Not found");
	}
		}

	}


