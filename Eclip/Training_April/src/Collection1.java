import java.util.Arrays;

public class Collection1 {
	public static void main(String[] args) {
		
	
	int[] ar = {5,10,3,8,2};
	System.out.println("Before Sorting");
for(int no:ar)
{
System.out.print(no+ " ");
}
System.out.println();
Arrays.sort(ar);
System.out.println("After Sorting");
for(int no:ar)
{
System.out.print(no+ " ");

}
}

}
