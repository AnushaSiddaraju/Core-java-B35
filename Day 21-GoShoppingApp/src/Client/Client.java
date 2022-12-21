package Client;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopFactory;
import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

//Driver class(Executor)
public class Client {

	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Girisha",500,true);
		NormalAcc n=new GSNormalAcc(1002,"Dharmendra",500,70);
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getCharges());
		
		System.out.println();

		
		System.out.println(p);
		System.out.println(n);

		

	}

}
