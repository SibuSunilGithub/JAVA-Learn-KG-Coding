// Create a program that shows bitwise compliment of a number.

import java.util.Scanner;
class BitCompliment{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num = sc.nextInt();
		System.out.println("Result Is: "+(~num));
	}
}