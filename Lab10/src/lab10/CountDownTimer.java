package lab10;

public class CountDownTimer extends Thread {

	public void run()
	{
		for(int i=10; i>0; i--)
		{
			System.out.println("CountDown: " + i);
			
			try 
			{
			  Thread.sleep(1000);
			}
			catch(Exception e)
			{
		      System.out.println("Error: "+ e.getMessage()); 
			}
		}
		System.out.println("Time's Up!");
	}
}
