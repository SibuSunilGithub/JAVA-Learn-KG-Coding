// Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;
class SumOfDigits{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Sum Of The Gigits Is: "+sumDigit(num));
	}
	// Sum Of Digits Method
	public static int sumDigit(int num){
		int sum = 0;
		while(num != 0){
			sum+=(num % 10);
			num/=10;
		}
		return sum;
	}
}
