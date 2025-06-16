package lab7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Circle C1 = new Circle();
		System.out.println("The area of circle is: " + C1.Area(7.14));
		
		Rectangle R1 = new Rectangle();
		System.out.println("The area of rectangle is: " + R1.Area(4.2, 6.6));
		
		Printable P1;
		
		P1 = new Book();
		P1.print();
		
		P1 = new Magazine();
		P1.print();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = input.nextInt();
		
		Operations OP;
		OP = new Calculator();
		
		OP.add(a,b);
		OP.subtract(a,b);
		OP.multiply(a,b);
		OP.divide(a,b);
		
		Vehicle V1;
		V1 = new Car();
		V1.start();
		
        V1 = new Bike();
        V1.start();
        
        V1 = new Bus();
        V1.start();
        
        Welcome w = new Welcome();
        w.sayHello("Maheen");
        w.sayGoodbye();
        Greeting.staticGreet();
	}

}
