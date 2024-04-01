// Create a program to find the minimum of two numbers(Using Ternary Operator)

import java.util.Scanner;

class MinOfTwo{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1 = input.nextInt();
		System.out.println("Enter Second Number: ");
		int n2 = input.nextInt();
		int min = n1>n2 ? n2 : n1;
		System.out.println("Minimum Is: "+min);
	}
}