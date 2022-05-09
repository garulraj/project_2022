
public class Shop {
			int price, discount; 

			public Shop(int price, int discount) {
				// TODO Auto-generated constructor stub
				this.price = price;
				this.discount = discount; 
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Shop tv1 = new Shop(20000,2000); 
				Shop tv2 = new Shop(20000,2000);
				System.out.println(tv1.hashCode());
				System.out.println(tv2.hashCode());
				System.out.println(tv1.equals(tv2));
				//this keyword
			}
		public int hashCode()
			{
				return 1; 
			}
			public boolean equals(Object obj)
			{
				
				Shop tv2 = (Shop)obj; // Upcasting - Down Casting
				if(this.price==tv2.price)
				{
					if(this.discount == tv2.discount)
						return true;
				}

					return false; 
			}

		

	}

}
