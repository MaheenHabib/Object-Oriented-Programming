package lab4;

public class Main {

	public static void main(String[] args) 
	{
		 Employee emp1 = new Employee();

	        System.out.println("Bonus: " + emp1.calculateBonus(30000));
	        System.out.println("Bonus: " + emp1.calculateBonus(50000.0, 4));

		 Employee2 emp;

	        emp = new Manager();
	        emp.calculateSalary();

	        emp = new Developer();
	        emp.calculateSalary();
	        
	        Animal[] animals = new Animal[2];
	        animals[0] = new Dog();
	        animals[1] = new Cat();

	        for (Animal animal : animals) 
	        {
	            animal.makeSound();
	        }

	        Employee3 emp3 = new Employee3();

	        emp3.printDetails(101);
	        emp3.printDetails("Maheen");
	        emp3.printDetails(102, "Eiman");
	}
}