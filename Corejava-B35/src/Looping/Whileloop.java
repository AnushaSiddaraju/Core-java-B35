package Looping;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt(); //5
		int i=1;
		while(i<=num)
		{
			System.out.println("Welcome to java"+i);
			i++;
		}
	}

}
