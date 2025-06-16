package lab9;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> Num = new LinkedList<Integer>();
		
		Num.addFirst(54);
		Num.add(98);
		Num.add(22);
		Num.add(43);
		Num.addLast(77);
		
		System.out.println("LinkedList: ");
		
		for(Integer N : Num)
		{
			System.out.print(N + " ");

		}
		
		Num.remove(1);
		Num.removeFirst();
		Num.removeLast();
		
        System.out.println("LinkedList: ");
		
		for(Integer N : Num)
		{
			System.out.print(N + " ");

		}
		
		LinkedList<Integer> reversed = new LinkedList<Integer>();
		
		for(int i = Num.size()-1; i>=0; i--)
		{
			reversed.add(Num.get(i));
		}
		
		 System.out.println("Reversed LinkedList: ");
			
			for(Integer R : reversed)
			{
				System.out.print(R + " ");

			}


	}
}
