package lab6;

public class EvenNumsInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 7, 6, 13, 20, 3, 4, 9, 8, 10};

        System.out.println("Even numbers in the array:");
        for (int num : arr) 
        {
            if (num % 2 == 0) 
            {
                System.out.println(num);
            }
        }
    }
}

