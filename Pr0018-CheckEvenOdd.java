// Create a program that determines if a number is odd or even.

import java.util.Scanner;
class CheckEvenOdd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Number: ");
		 int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println("Even Number!");
		}
		else{
			System.out.println("Odd Number!");
		}
	}
}