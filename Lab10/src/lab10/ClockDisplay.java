package lab10;
import java.time.*;

public class ClockDisplay extends Thread {
	public void run()
	{
		while(true)
		{
			LocalTime time = LocalTime.now();
			System.out.println("Current time is " + time.getHour()+ " : " + time.getMinute()+ " : " +time.getSecond());
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}

