package AbstractDemo;

public class ATMMachinesChild  extends ATMMachine {
	//provided the implementation to abstract method of parent class

	@Override
	void withdraw() {
		int balance=50000;
		System.out.println("Withdrawing amount is:"+balance);
		
	}
	

}
