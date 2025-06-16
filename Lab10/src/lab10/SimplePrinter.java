package lab10;

public class SimplePrinter extends Thread {
	public void run()
	{
		for(int i=0; i <5; i++)
	    {
		 System.out.println("Hello from Thread");
		
           try {
    	  Thread.sleep(1000);
           }
		   catch(Exception e)
		   {
			System.out.println("Error: "+ e.getMessage()); 
		   }
	    }
	}  
}
