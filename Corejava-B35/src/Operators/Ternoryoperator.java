package Operators;


import java.util.Scanner;

public class Ternoryoperator {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enetr the value of a and b:");
	int a=s.nextInt();//a=10
    int b=s.nextInt();//b=20
    int result=(a>b)?a:b;
    System.out.println("the result is:"+result);
    s.close();
   
    	
    
	}

}
