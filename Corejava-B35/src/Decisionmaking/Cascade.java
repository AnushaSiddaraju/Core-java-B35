package Decisionmaking;

public class Cascade {

	public static void main(String[] args) {

		int a=11, b=7, c=13;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>c && b>c)
		{
			System.out.println(b);
		}
			else 
			{
				System.out.println(c);
			}
			
		
	}

}
