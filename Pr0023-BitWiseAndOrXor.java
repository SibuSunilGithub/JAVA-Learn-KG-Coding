// Create a program that shows bitwise (AND/OR/XOR) of two numbers.

import java.util.Scanner;
class BitWiseAndOrXor{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("Bitwise AND: "+(a & b));
		System.out.println("Bitwise OR: "+(a | b));
		System.out.println("Bitwise XOR: "+(a ^ b));
	}
}