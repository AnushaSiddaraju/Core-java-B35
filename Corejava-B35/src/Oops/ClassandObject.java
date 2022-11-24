package Oops;

import java.util.Scanner;
// driver class
public class ClassandObject {

	public static void main(String[] args) {

		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the speedof the car:");
		 int speed=s.nextInt();
		
		 // creation of object
		
		 Car obj=new Car();
		 
		 // compile time input
		 //obj.speed=45;
		 obj.speed(speed);
		 s.close();
		 
				 ;
	}

}
