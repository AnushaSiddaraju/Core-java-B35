package Operators;

import java.util.Scanner;

public class Relationaloperator {

	public static void main(String[] args) {
 
		Scanner s=new Scanner(System.in);
  System.out.println("Enter the value of a and b:");
 
  int a=s.nextInt();
  int b=s.nextInt();
 
  boolean result=a>b;// if condition is true it returns true else flase
  //Relational operator returns boolean value :true/false
 
  boolean value=(a==b);
  System.out.println("The result is:"+result);
  System.out.println("The value is:"+value);
	}
	

}
