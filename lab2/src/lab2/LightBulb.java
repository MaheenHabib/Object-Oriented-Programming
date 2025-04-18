package lab2;

public class LightBulb {

	private boolean isOn;
	
	boolean turnOn ()
	{
		System.out.println("The bulb is on.");
		
		return true;
	}
	
	boolean turnOff ()
	{
		System.out.println("The bulb is off.");
		
		return false;
	}
	
	void showStatus()
	{
		if(isOn == true)
		{
			System.out.println("The bulb is on.");
		}
		else
		{
			System.out.println("The bulb is off.");
		}
	}
}
