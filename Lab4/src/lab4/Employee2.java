package lab4;

public class Employee2 
{
    public void calculateSalary() 
    {
        System.out.println("Base Salary: $3000");
    }
}

class Manager extends Employee2 
{
    public void calculateSalary() 
    {
        System.out.println("Manager Salary: $5000 + Bonus");
    }
}

class Developer extends Employee2 
{
    public void calculateSalary() 
    {
        System.out.println("Developer Salary: $4000 + Project Allowance");
    }
}