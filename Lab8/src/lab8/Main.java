package lab8;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new Employee(24, "Maheen", 24600));
		emps.add(new Employee(16, "Eiman", 25000));
		emps.add(new Employee(12, "Mishaal", 34000));
		
		Employee highest = emps.get(0);
		
		for(int i=1; i<emps.size(); i++)
		{
			if(emps.get(i).salary > highest.salary);
			{
				highest = emps.get(i);
			}
		}
		
		System.out.println("Employee with the Highest Salary is: ");
		highest.display();
		
		ReverseArrayList R1 = new ReverseArrayList();
		R1.reverse();
		
		Circle C1 = new Circle();
		C1.getArea();
		Rectangle R = new Rectangle();
		R.getArea();
		
		SavingsAccount S1 = new SavingsAccount();
		S1.deposit(462.45);
		S1.withdraw(234.66);
		S1.getBalance();
		
		CurrentAccount C = new CurrentAccount();
		C.deposit(235.65);
		C.withdraw(2374.6);
		C.getBalance();
		
		
	}

}
