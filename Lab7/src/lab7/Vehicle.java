package lab7;

public interface Vehicle 
{
	public void start();
}

class Car implements Vehicle
{
	public void start() 
	{
		System.out.println("Car is starting...");
	}
}

class Bike implements Vehicle
{
	public void start() 
	{
		System.out.println("Bike is starting...");
	}
}

class Bus implements Vehicle 
{
	public void start()
	{
		System.out.println("Bus is starting...");
	}
}
