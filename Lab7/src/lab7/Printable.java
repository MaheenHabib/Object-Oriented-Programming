package lab7;

public interface Printable 
{
	public void print();
}

class Book implements Printable
{
	String title = "Shinning";
	String author= "StephenKing";
	
	public void print()
	{
		System.out.println("Title of the Book: "+ title);
		System.out.println("Author of the Book: "+ author);
	}
}

class Magazine implements Printable
{
	int IssueNumber = 43566;
	
	public void print() 
	{
		System.out.println("The Issue Number of the Magazine is: "+ IssueNumber);
	}
}
