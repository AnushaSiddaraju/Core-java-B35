package Operators;

import java.util.Scanner;
public class Airthmeticoperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt(); // a=10
		int b=s.nextInt(); // b=20

		System.out.println("The addition is:"+(a+b));
		System.out.println("The addition is:"+(a-b));
		System.out.println("The addition is:"+(a*b));
		System.out.println("The addition is:"+(a/b));
		System.out.println("The addition is:"+(a%b));
		s.close();
	}

}
