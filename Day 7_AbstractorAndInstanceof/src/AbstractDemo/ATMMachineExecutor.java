package AbstractDemo;
// driver class
public class ATMMachineExecutor {

	public static void main(String[] args) {
      ATMMachine a=new ATMMachinesChild();
      //      ATMMachineChild a=new ATMMachinesChild();

      a.withdraw();
      a.display();
      
	}

}
