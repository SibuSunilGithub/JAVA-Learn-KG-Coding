// Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;
class SumOddNumbers{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Sum Of All Odd Numbers Upto "+num+" Is: "+oddSum(num));
	}
	
	// oddSum Function
	public static int oddSum(int num){
		int sum = 0, i = 1;
		while(i <= num){
			sum+= i;
			i+=2;
		}
		return sum;
	}
}
