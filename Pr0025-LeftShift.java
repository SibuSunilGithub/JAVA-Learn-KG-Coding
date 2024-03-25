// Create a program that shows use of left shift(<<) operator.

import java.util.Scanner;
class LeftShift{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Enter Shift Position: ");
		int pos = sc.nextInt();
		int res = num << pos;
		System.out.println("Result Is: "+res);
	}
}