// Create a program to calculate product of two floating points numbers

import java.util.Scanner;
class ProductFloatingNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Floating Number: ");
		float num1 = sc.nextFloat();
		System.out.println("Please Enter Second Floating Number: ");
		float num2 = sc.nextFloat();
		float product = num1*num2;
		System.out.println("Product Of "+num1+" & "+ num2+" Is: "+product);
	}
}