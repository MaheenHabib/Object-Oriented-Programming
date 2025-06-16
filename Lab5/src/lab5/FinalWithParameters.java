package lab5;

public class FinalWithParameters {

	    public static double calculateArea(final double radius) {
	    	
	        return 3.14 * radius * radius;
	    }

	    public static void main(String[] args) {
	        System.out.println("Area: " + calculateArea(5));
	    }
	}

