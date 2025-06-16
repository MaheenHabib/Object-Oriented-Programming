package lab6;
import java.util.Scanner;


public class PowerCalculator {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Base: ");
		double base = input.nextDouble();
		
		System.out.println("Enter Exponent: ");
        double exponent = input.nextDouble();
        
        double result = Math.pow(base, exponent);
		System.out.println("Result: "+ result);

		
		
	}
}
