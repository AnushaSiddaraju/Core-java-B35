package Operators;

 import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");// a=10 b=20
        int a=s.nextInt();
        int b=s.nextInt();
       
        a*=b;
       
        System.out.println("The value of a is:"+a);
        s.close();
        
	}

}
