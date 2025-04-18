package Lab1;

public class Bank_Account {

	String accountNumber = "DGDFH54680HGN";
	double balance = 1467698.975;
	
	void deposit (double amount)
	{
		balance = balance + amount;
	}
	
	double displayBalance()
	{
		return balance;
	}
}
