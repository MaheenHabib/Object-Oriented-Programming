package lab7;

public interface Greeting 
{
	public abstract void sayHello(String name);
    public default void sayGoodbye()
    {
    	System.out.println("GoodBye!");
    }
    
    public static void staticGreet()
    {
    	System.out.println("Good Morning!");
    }
}

class Welcome implements Greeting 
{
	public void sayHello (String name)
	{
		System.out.println("Hello "+ name + "!");
	}
}
