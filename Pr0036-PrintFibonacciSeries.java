// Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;
class PrintFibonacciSeries{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fibonacci Series Range: ");
	    int range = sc.nextInt();
		System.out.println("Your Fibonacci Series Is: ");
		fiboPrint(range);
	
	}
	// Print Fibonacci Series Function
	public static void fiboPrint(int num){
		if(num < 0) return;
		System.out.print("0 ");
		if(num == 0) return;
		System.out.print("1 ");
		int first = 0, second = 1;
		while(first + second <= num){
			int third = first + second;
			System.out.print(third+ " ");
			first = second;
			second = third;
		}
	}
}

