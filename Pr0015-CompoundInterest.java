// Create a program to calculate Compound interest. Compound Interest = P(1 + R/100)t

import java.util.Scanner;
class CompoundInterest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount, Time Period & Rate Of Interest: ");
		double p = sc.nextDouble();
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		double ci = (p * t * (1+(r/100)));
		System.out.println("Compound Interest: "+ci);
	}
}