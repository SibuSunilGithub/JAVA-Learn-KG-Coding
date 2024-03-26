// Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;
class BitWiseCheckEvenOdd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		if((num & 1) == 1){
			System.out.println("Your Number Is Odd.");
		}
		else{
			System.out.println("Your Number Is Even.");
		}
	}
}