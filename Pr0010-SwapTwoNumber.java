// Create a program to swap two numbers. 

import java.util.Scanner;
class SwapTwoNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		System.out.println("Before Swap Num1: "+num1+" Num2: "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap Num1: "+num1+" Num2: "+num2);
	}
}