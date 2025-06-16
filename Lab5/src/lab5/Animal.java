package lab5;

public class Animal {

	final void MakeSound()
	{
		System.out.println("Animal makes sound");
	}
}

public class Dog extends Animal {
	
	void MakeSound() 
	{
		System.out.println("Dog Barks");
	}
}