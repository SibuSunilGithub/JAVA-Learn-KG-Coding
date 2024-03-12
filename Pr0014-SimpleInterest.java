// Create a program to calculate simple interest. Simple Interest = (P x T x R)/100

import java.util.Scanner;
class SimpleInterest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount, Time Period & Rate Of Interest: ");
		double p = sc.nextDouble();
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		double si = (p * t * r)/100;
		System.out.println("Simple Interest: "+si);
	}
}