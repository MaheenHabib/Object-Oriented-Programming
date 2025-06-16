package lab10;

public class Timer1 extends Thread 
{
	    public void run() {
	        try {
	            Thread.sleep(2000); // wait for 2 seconds
	            System.out.println("Timer 1 (2 seconds) finished");
	        } catch (Exception e) {
	            System.out.println("Timer 1 interrupted");
	        }
	    }
	}

	// Timer2 class — waits 4 seconds
	class Timer2 extends Thread {
	    public void run() {
	        try {
	            Thread.sleep(4000); // wait for 4 seconds
	            System.out.println("Timer 2 (4 seconds) finished");
	        } catch (Exception e) {
	            System.out.println("Timer 2 interrupted");
	        }
	    }
	}

	// Timer3 class — waits 6 seconds
	class Timer3 extends Thread {
	    public void run() {
	        try {
	            Thread.sleep(6000); // wait for 6 seconds
	            System.out.println("Timer 3 (6 seconds) finished");
	        } catch (Exception e) {
	            System.out.println("Timer 3 interrupted");
	        }
	    }
	}

