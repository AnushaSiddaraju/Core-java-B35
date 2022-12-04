package PolymerizationDemo;
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//Object creation
		MethodOverloadingExample m=new MethodOverloadingExample();
		//method calling
		m.addition(12, 10);
		m.addition(34, 20, 9);
		
		System.out.println();
		
		//Object creation
		MethodOverloadingExample m1=new MethodOverloadingExample();
		//method calling
		m1.addition(23, 50);
		m1.addition(25, 20, 56);

	}

}
