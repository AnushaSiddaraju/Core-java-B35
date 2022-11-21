package Decisionmaking;

import java.util.Scanner;

public class switchcase
{
	public static void main(String[] args){
		// switch case
	Scanner s=new Scanner(System.in);
	char  a=s.next().charAt(0);
		switch(a)
		{
		case 'a':
	    System.out.println("Anusha");
	    break;
		case 'b':
		System.out.println("Hello");
	    break;
		case 'c':
		System.out.println("Hi");
	    break;
		default:
			System.out.println(" Invalid input");
			s.close();
		}
	}
	

}
		
	
	

	


