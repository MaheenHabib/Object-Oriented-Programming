package Lab1;

public class Main {

	public static void main(String[] args) {
		
	     Person P1 = new Person();
	     P1.display_info("Maheen", 19);
	     P1.display_info("Mishaal", 19);
	     
	     Rectangle R1 = new Rectangle();
	     System.out.println("The Area of the Rectangle is " + R1.calculate_area(42.8, 6.98));
	    
	     Calculator C1 = new Calculator();
	     System.out.println("The addtion = " + C1.add(6, 8));
	     System.out.println("The multiplication = " + C1.multiply(7, 4));
	     
	     Bank_Account B1 = new Bank_Account();
	     B1.deposit(46336.677);
	     System.out.println("The updated balance = " + B1.displayBalance());
	     
	     Student S1 = new Student();
	     S1.checkPass();
		}
}
