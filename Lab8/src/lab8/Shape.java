package lab8;

public abstract class Shape {

	public abstract void getArea();
}

class Circle extends Shape
{
	public void getArea()
	{
		int radius = 34;
		double area = Math.PI*(Math.pow(radius, 2));
		
		System.out.println("Area: " + area);
	}
}

class Rectangle extends Shape
{
	public void getArea()
	{
		int length = 34;
		int width = 21;
		
		int area = length * width;
		
		System.out.println("Area: " + area);

	}
	
}