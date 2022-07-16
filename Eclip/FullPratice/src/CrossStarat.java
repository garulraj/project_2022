
public class CrossStarat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int star=1;star<row;star++) {
				System.out.print(" ");
			}for(int at=1;at<=6-row;at++) {
				System.out.print("* ");
			}System.out.println();
		}

	}

}
