package Week1Day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
    int divisible =0;
    int trigger=0;
    int i;
		Scanner getVal = new Scanner(System.in);
		System.out.println("Enter The max value of the series");
		int inputNumber = getVal.nextInt();
		divisible = inputNumber/2;
		

		if (inputNumber == 0 || inputNumber == 1) {

			System.out.println("Entered value is not a Prime Number");

		}
		
		else 
		{
		for(i=2;i<=divisible;i++)

			if (inputNumber%i==0)
			{
				System.out.println("Not a Prime Number");
			trigger=1;
			break;
			}	
		}
		
		if (trigger==0)
			System.out.println("Is a Prime Number");
		
		
	}

}
