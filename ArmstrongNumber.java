package Week1Day1;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int obtainedValue;
		int temporarystore = 0;
		int cuber;
		int getlastdigit;
		int referenceCapture = 0;
		// Assign input into variable original

		Scanner getVal = new Scanner(System.in);
		System.out.println("Enter Number to be checked for Armstrong criteria");
		obtainedValue = getVal.nextInt();

		referenceCapture = obtainedValue;

		while (obtainedValue > 0) {

//		Code to isolate the last digit of the input value			
			getlastdigit = obtainedValue % 10;

//		Code to Cube the last value
			cuber = getlastdigit * getlastdigit * getlastdigit;

// Store the cubed value in a temporarystore variable   	
			temporarystore = temporarystore + cuber;

//This line reduces or truncates the last value from the initial number	  	
			obtainedValue = obtainedValue / 10;

		}

		if (temporarystore == referenceCapture) {
			System.out.println("This is a Armstrong number");
		}

		else {
			System.out.println("This is not an Armstrong number");
		}

	}

}
