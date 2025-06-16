package lab6;
import java.util.Scanner;


public class AbsoluteDifference {

	public static void main(String args[])
	{
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter 1st number: ");
		  int num1 = input.nextInt();
		  
		  System.out.println("Enter 2nd number : ");
		  int num2 = input.nextInt();
		  
		  int result = Math.abs(num1 - num2);
		  System.out.println("Difference b/w " + num1 + " & " + num2 + " is " + result);
	}
}
