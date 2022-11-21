package Datatypes;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   
   char a='\u0029';
   char b='\u0022';
   char c='\u0030';
   System.out.println((int)a);
   System.out.println((int)b);
   System.out.println((int)c);
   s.close();


	}

}
