package Lab1;

public class Student {

	String name = "Maheen";
	double marks = 84;
	
	void checkPass()
	{
		if(marks >= 50)
		{
			System.out.print("Passed");
		}
		else
		{
			System.out.print("Failed");
		}
	}
}
