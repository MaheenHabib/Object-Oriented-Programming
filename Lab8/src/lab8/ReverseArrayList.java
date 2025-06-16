package lab8;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseArrayList {

	public void reverse()
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.print("Enter 5 Numbers: ");
		for(int i=0; i<5; i++)
		{
		  numbers.add(input.nextInt());
		}
		
		System.out.print("Original List: ");
		for(Integer N : numbers)
		{
			System.out.print(N + " ");
		}
		System.out.print("Reverse List: ");
		for(int i=numbers.size()-1; i>=0; i--)
		{
			System.out.print(numbers.get(i) + " ");
		}
		input.close();
	}
}
