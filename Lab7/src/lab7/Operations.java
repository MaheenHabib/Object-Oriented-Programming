package lab7;

public interface Operations 
{
	public void add(int a, int b);
	public void subtract(int a, int b);
	public void multiply(int a, int b);
	public void divide (double a, double b);	
}

class Calculator implements Operations
{
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("The sum of "+ a + " & "+ b + " is "+ sum);
	}
	
	public void subtract(int a, int b)
	{
		int ans = a-b;
		System.out.println("The answer of "+ a + " - "+ b + " is "+ ans);

	}
	
	public void multiply(int a, int b)
	{
		int ans = a*b;
		System.out.println("The answer of "+ a + " x "+ b + " is "+ ans);
	}
	
	public void divide(double a, double b)
	{
		double ans = a/b;
		System.out.println("The answer of "+ a + "/"+ b + " is "+ ans);
	}
}


