package thisDemo;
//2.It can be used to invoke or initiate current class constructor

public class Flower2 {
	
	//private data member
	private String name;
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//default constructor
	public Flower2() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized constructor

	public Flower2(String name) {
		this.name=name;
	}
	
	

}
