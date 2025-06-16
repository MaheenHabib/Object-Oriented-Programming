package lab6;
import java.util.Random;

public class RandomNumbers {

	public static void main(String args[])
	{
		Random rand = new Random();
		
		System.out.println("5 random numbers from 1 to 100");
		
		for(int i=1; i<=5; i++)
		{
			int randomNum = rand.nextInt(100); 
		}
	}

}
