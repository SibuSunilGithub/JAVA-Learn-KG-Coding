// Write a function that calculates the factorial of a given number.

import java.util.Scanner;
class Factorial{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Factorial Of "+ num +" Is "+fact(num));
	}
	// Fatorial Function
	public static long fact(int num){
		int i = 2, fc = 1;
		if(num < 2){
			return 1;
		}
		while(i <= num){
			fc *= i;
			i++;
		}
		return fc;
	}
}
