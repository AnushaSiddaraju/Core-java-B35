package Inheritancedemo;

//Child class for Vehicle
public class BMW extends Vehicle{
	private String name1;
	public void display1()
	{
		System.out.println("The Car name is:"+name1);
		
	}
	//setters and getters 
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}

	
	

}
