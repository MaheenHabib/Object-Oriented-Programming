package lab6;

public class MaxInArray {

	public static void main(String[] args) 
	{
		int[] arr = {4, 12, 7, 19, 2, 8};
		int max = arr[0];

		for (int num : arr) 
		{
		    if (num > max) 
		    {
		        max = num;
		    }
		}

		System.out.println("Maximum value in the array: " + max);
     }
}

	
