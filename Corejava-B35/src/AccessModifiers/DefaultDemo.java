package AccessModifiers;

public class DefaultDemo {
	// default data member
		/*if any var,method,constructor or class is a defaul 
		 * then we can access this only insidethe same package*/
	
	
	int speed;
	
	//constructor
	public DefaultDemo(int speed)
	{
		super();
		this.speed= speed;
	}
	//method
	void display()
	{
		System.out.println("The speed is:"+speed);
	}
	
		
	}


