package thisDemo;
//3. this can be passed as an argument in the method call
public class Vehicle3 {
	//data members
	public int speed;
	public void display1(Vehicle3 v)
	{
		System.out.println("Speed is: "+speed+"Km/hr");
	}
	
	public void display2()
	{
		//passing this keyword as an argument to call display1()method
		display1(this);
	}

}