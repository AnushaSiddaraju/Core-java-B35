package PolymerizationDemo;

public class MethodOverloadingExample {
	
	//method overloading
	//1.By changing the no.of arguments
	public void addition(float f,int y)
	{
		System.out.println("The addition of x and y is: "+(f+y));
	}
	public void addition(int x,int y,int z)
	{
		System.out.println("The addition of x and y is: "+(x+y+z));
	}

}
