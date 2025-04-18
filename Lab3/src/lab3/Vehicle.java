package lab3;

public class Vehicle {

	String brand;
	
	void startEngine()
	{
		System.out.println("The vehicle engine starts.");
	}
	
}

class Car extends Vehicle
{
	void Honks() 
	{
	
		System.out.println("The car Honks.");
	}
}