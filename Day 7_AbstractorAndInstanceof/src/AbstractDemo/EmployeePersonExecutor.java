package AbstractDemo;
// Driver class

public class EmployeePersonExecutor {

	public static void main(String[] args ) {
	Person p1=new Employee("Rajesh","male", 23);
	Person p2=new Employee("Monika","female",-4);
	
	//to return the data that we inserted 
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	p1.work();
	p2.work();
	}
}


