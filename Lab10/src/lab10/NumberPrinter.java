package lab10;

public class NumberPrinter extends Thread 
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Number: " + i);
			try 
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}

class CharacterPrinter extends Thread
{
	public void run()
	{
		for(char ch='A'; ch<='E'; ch++)
		{
			System.out.println("Character: " + ch);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("Error: " + e.getMessage());
			}
		 }	
	}	
}