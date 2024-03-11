// Create a program to calculate Perimeter of a rectangle, Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;
class PerimeterRectangle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Four Sides Of The Rectangle: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		float perimeter = a+b+c+d;
		System.out.println("Perimeter Of The Rectangle Is: "+perimeter);
	}
}