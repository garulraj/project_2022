
public class Collection2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Mobiles m1 = new Mobiles(10000, 4, 12);
		Mobiles m2 = new Mobiles(12000, 6, 10);
		Mobiles m3 = new Mobiles(8000, 2, 14);
		Mobiles m4 = new Mobiles(11000, 8, 8);
		
		//What is Array?
	Mobiles[] mobiles = {m1,m2,m3,m4}; 
	System.out.println("Before Sorting");
	for(Mobiles mob:mobiles)
	{
		System.out.println(mob);
	}	//toString() - Object
//		Arrays.sort(mobiles);


		}

	}//another method.
	public class Mobiles {

		int price, ram, mp; 
		
		public Mobiles(int price, int ram, int mp)
		{
			this.price = price; 
			this.ram = ram; 
			this.mp = mp; 
		}
		public String toString()
		{
			return this.price + " "+ this.ram+ " "+
		this.mp; 
		}
		public static void main(String[] args) 
		{
		
		}

	}

}
