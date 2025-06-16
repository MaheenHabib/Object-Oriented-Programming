package lab6;
import java.util.Scanner;


public class MaxNumber {

	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);

		  System.out.println("Enter 1st number: ");
		  int num1 = input.nextInt();
		  
		  System.out.println("Enter 2nd number : ");
		  int num2 = input.nextInt();
		  
		  System.out.println("Enter 3rd number : ");
		  int num3 = input.nextInt();

		  int max = Math.max(num1, Math.max(num2, num3));
		  System.out.println("Maximum of the three numbers is: " + max);
		  
	}
}
