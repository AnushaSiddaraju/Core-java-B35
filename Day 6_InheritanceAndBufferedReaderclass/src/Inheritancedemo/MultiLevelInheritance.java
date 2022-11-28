package Inheritancedemo;

import java.util.Scanner;

// Derive class
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Vehicle name-Parent1
		System.out.println("Enter the Vehical name:");
		String veh_name=s.nextLine();
		Tyre t=new Tyre();
		t.setName(veh_name);
		t.display();
		
		//brand-Parent2 and child1
		System.out.println("Enter the vehicle brand name:");
		String brand=s.nextLine();
		t.setName1(brand);
		t.display1();
		
		//tyre-child class2
		System.out.println("Enter the tyre name:");
		String t_name=s.nextLine();
		t.setTyre_name(t_name);
		t.display3();
		
		
		
	}

}
