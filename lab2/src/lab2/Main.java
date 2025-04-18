package lab2;

public class Main {

	public static void main(String[] args) {
		
		PasswordManager P1 = new PasswordManager();
		
		P1.SetPassword("abcd");
		P1.ChangePassword("abcd", "efgh");
		P1.ValidatePassword("efgh");
		
		LightBulb L1 = new LightBulb();
		L1.turnOn();
		L1.turnOff();
		L1.showStatus();
	}

}
