package lab8;

public abstract class BankAccount {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void getBalance();
}

class SavingsAccount extends BankAccount
{
	double Balance = 343455.786;
	
	public void deposit(double amount)
	{
		Balance += amount;
		
		System.out.println(amount + " Rs. has been deposited to your Savings Account.");
	}
	
	public void withdraw(double amount)
	{
		Balance -= amount;
		System.out.println(amount + " Rs. has been withdrawn from your Savings Account!");
	}
	
	public void getBalance()
	{
		System.out.println("Your current balalnce in Savings Account is: "+ Balance);
	}
}

class CurrentAccount extends BankAccount
{
	double Balance = 96575.723;
	
	public void deposit(double amount)
	{
		Balance += amount;
		
		System.out.println(amount + " Rs. has been deposited to your Current Account.");
	}
	
	public void withdraw(double amount)
	{
		Balance -= amount;
		System.out.println(amount + " Rs. has been withdrawn from your Current Account!");
	}
	
	public void getBalance()
	{
		System.out.println("Your current balalnce in Current Account is: "+ Balance);
	}
}