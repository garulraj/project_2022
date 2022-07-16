import java.util.Date;
//mport java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
public class Dateproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat fm = new SimpleDateFormat("hh.mm aa");
		String time= fm.format(d);
		System.out.println("updated date "+ time);
		
	}

}
