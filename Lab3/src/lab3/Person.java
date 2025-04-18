package lab3;

public class Person 
{

	String name = "Maheen";
	int age = 19;
	
	void introduce()
	{
		System.out.println("Hello my name is " + name + " and I am " + age + " years old.");
	}
}

class Student extends Person 
{
 
	String school = "SHU";
	
}