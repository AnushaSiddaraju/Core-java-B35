package Decisionmaking;

public class nestedif {

	public static void main(String[] args) {
     int age=16, weight=55;
      if(age>=14)
      {
    	  if(weight>=45)
    	  {
    		if (weight<=100)
    		{
    			System.out.println("eligible for bunjee jumping");
    			
    		}
    		else 
    		{
    			System.out.println("extra ropes will be added");
    		}
    		 }
    	  else
    	  {
    		  System.out.println(" not eligible for bunjee jumping");
    		  
    	  }
      }
	}

}
