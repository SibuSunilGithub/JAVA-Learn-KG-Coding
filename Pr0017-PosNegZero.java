// Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;
class PosNegZero{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Number: ");
		int num = sc.nextInt();
		if(num > 0){
			System.out.println("Number Is Positive.");
		}
		else if(num < 0){
			System.out.println("Number Is Negative.");
		}
		else{
			System.out.println("Number Is Zero!");
		}
	}
}