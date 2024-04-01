// Create a program to find if the given number is even or odd.

import java.util.Scanner;

class EvenOddCheckTernary{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n1 = input.nextInt();
		if(n1 % 2 == 0){
			System.out.println("Even Number.");
		}
		else{
			System.out.println("Odd Number.");
		}
		}
}