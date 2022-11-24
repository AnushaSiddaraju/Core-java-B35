package Looping;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	
		int num=s.nextInt();
		
		switch (num)
		{
		 case 1:
		{
			System.out.println(" Anusha");
		break;
			
		}
		 case 2:
		 {
			 System.out.println("Anu");
			break;
			// if dont use break the output returns next values
		 }
		 
		 case 3:
		 {
			 System.out.println("jyoo");
			 
			 
		 }
		 
		 default:
		 {
		 System.out.println("Invalid inputs");
		 
		 }
		 
		 
		}
		

	}

}
