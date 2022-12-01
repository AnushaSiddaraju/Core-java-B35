package thisDemo;
//5.to invoke current class constructor
public class Color5 {
	
	public String name;
	
	//default constructor
	Color5()
	{
		this("RED");//invoking paramterized constructor
		System.out.println("Default Constructor");
	}
	//paramterized constructor
	Color5(String name)
	{
		System.out.println("The color is: "+name);
	}

}