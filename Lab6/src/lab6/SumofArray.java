package lab6;

public class SumofArray 
{

	public static void main(String[] args) 
	{
		
		        int[] num = {10, 20, 30, 40, 50};
		        int sum = 0;

		        for (int i=0; i<num.length; i++) 
		        {
		            sum += num[i];
	            }

		        System.out.println("Sum of array elements: " + sum);
	}
}
