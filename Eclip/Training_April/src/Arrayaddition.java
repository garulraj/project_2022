
public class Arrayaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4}}; 
		int[][] b = {{2,3},{4,5}};
		int len = a.length; 
		int len2 = a[0].length; 
		int[][] result = new int[len][len2]; 
		for(int row=0; row<a.length; row++){
		for(int col=0;col<a[row].length;col++)
		   {
		   result[row][col] = a[row][col]+b[row][col];
			System.out.print(result[row][col]); 
		   }
			row++; 
			System.out.println(); 
		}


	}

}
