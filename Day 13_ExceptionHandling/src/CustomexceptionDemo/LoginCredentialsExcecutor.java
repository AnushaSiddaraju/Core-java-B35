package CustomexceptionDemo;

import java.util.Scanner;
//driver class for custom exception
public class LoginCredentialsExcecutor {

	public static void main(String[] args) throws LoginCredentials  {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		//validating
		if(id!="sanusha@gmail" && password!="427abc")
		{
			throw new LoginCredentials(id, password);
		}
		
			

		

	}

}