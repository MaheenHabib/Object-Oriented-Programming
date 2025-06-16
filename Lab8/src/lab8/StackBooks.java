package lab8;

import java.util.Stack;

public class StackBooks {

	public static void main(String[] args) {
		
		Stack<String> Books = new Stack<String>();
		
		Books.push("Harry Potter");
		Books.push("Alchemist");
		Books.push("Atomic Habits");
        Books.push("1984");
        Books.push("The Hobbit");
        
        String Removed1 = Books.pop();
        String Removed2 = Books.pop();
        
        System.out.println("Books removed: "+ Removed1+ " & "+ Removed2);
        
        System.out.println("Remaining Books: ");
        
        for(String B : Books)
        {
           System.out.println(B);
        }

	}
}
