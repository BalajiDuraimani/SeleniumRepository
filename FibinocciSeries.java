package Week1Day1;

import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args) {
	
		
		int firstNumber = 0;
		int secondNumber =1;
		int thirdNumber;
		int i;
		Scanner getVal = new Scanner(System.in);
		System.out.println("Enter The max value of the series");
		int range = getVal.nextInt();
		System.out.print(firstNumber);
		System.out.print(" "+secondNumber);
	for (i=2;i<range;i++)
	{
		thirdNumber = firstNumber+secondNumber;
		System.out.print(" "+thirdNumber);
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
	}
			

	}

}