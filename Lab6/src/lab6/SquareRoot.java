package lab6;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String args[])
	{
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Enter a Number to find its Square Root.");
	  
	  double num = input.nextDouble();
	  double result = Math.sqrt(num);
	  
	  System.out.println("the sqrt of "+ num + " is "+ result);
	  
	}
}
