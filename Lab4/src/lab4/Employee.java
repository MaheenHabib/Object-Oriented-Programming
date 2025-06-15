package lab4;

public class Employee 
{
    public double calculateBonus(int salary) {
        return salary * 0.05;
    }

    public double calculateBonus(double salary, int rating) {
        double bonus = 0;
        if (rating == 5) bonus = salary * 0.20;
        else if (rating == 4) bonus = salary * 0.15;
        else if (rating == 3) bonus = salary * 0.10;
        else if (rating == 2) bonus = salary * 0.05;
        else bonus = 0;

        return bonus;
    }
}