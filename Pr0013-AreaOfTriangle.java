// Create a program to calculate the Area of a Triangle, By Input Base And Height. Area of triangle = ½*B*H

import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Base Of The Triangle: ");
		float b = sc.nextFloat();
		System.out.println("Please Enter Height Of The Triangle: ");
		float h = sc.nextFloat();
		float area = (b * h)/2;
		System.out.println("Area Of The Triangle Is: "+ area);
	}
}

