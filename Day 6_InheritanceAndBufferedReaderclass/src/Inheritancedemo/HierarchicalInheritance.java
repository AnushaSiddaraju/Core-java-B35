package Inheritancedemo;
// driver class
public class HierarchicalInheritance {

	public static void main(String[] args) {
		KitKat k=new KitKat();
		
		k.display();
		k.print();
		
		System.out.println();
		Tiramisu t=new Tiramisu();
		
		t.display();
		t.print();
		
	}

}
