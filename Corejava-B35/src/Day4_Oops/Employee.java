package Day4_Oops;


public class Employee {
	
	public String name;
	// default constructor
	Employee()
	{
		System.out.println(" Default constructor");
		
	}
	// parameterized constructor
	public Employee(int salary,String name) {
		/*super();
		  this.salary=salary;
		    this.name = name;*/
		
		salary=25000;
		name="Anusha";
	}
	public void print()
	{
		System.out.println("The salary of "+name+" is: "+salary);
	}
				
	}
	


