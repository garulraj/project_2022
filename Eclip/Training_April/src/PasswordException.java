
	
	public class PasswordException extends Exception {
		
		public void checkPassword(String password)
		{
			if(password.length()>=8)
			{
				System.out.println("Ok, Valid Password");
			}
			else
			{
				PasswordException pe = new PasswordException(); 
				
			}
		}

	}

}
