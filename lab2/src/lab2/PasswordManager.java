package lab2;

public class PasswordManager {

	private String Password;
	
	void SetPassword (String Password)
	{
		this.Password = Password;
	}
	
	boolean ChangePassword (String OldPass, String NewPass)
	{
		if (OldPass == Password)
		{
			Password = NewPass;
			System.out.println("The new Password is: " + Password);
			return true;
		}
		
		else 
		{
		 return false;	
		}
	}
	
	void ValidatePassword (String inputPass)
	{
		if (inputPass == Password)
		{
			System.out.println("The password is correct.");
		}
		else
		{
			System.out.println("The password is invalid.");
		}
	}
}
