package lab10;

public class Main {

	public static void main(String[] args) {

		SimplePrinter S = new SimplePrinter();
		S.start();
		
		NumberPrinter N = new NumberPrinter();
		CharacterPrinter C = new CharacterPrinter();
		
		N.start();
		C.start();
		
		CountDownTimer C1 = new CountDownTimer();
		C1.start();
		
		ClockDisplay C2 = new ClockDisplay();
		C2.start();
		
		Timer1 t1 = new Timer1();
        Timer2 t2 = new Timer2();
        Timer3 t3 = new Timer3();

        t1.start();
        t2.start();
        t3.start();
	}
}
