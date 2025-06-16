package lab7;

public interface Shape 
{
	double Area();
}

class Circle implements Shape
{
	double Area(double radius)
	{
		double area = 22/7 * Math.pow(radius, 2);
		
		return area;
	}
}

class Rectangle implements Shape
{
	double Area(double length, double width)
	{
		double area = length * width;
		
		return area;
	}
}