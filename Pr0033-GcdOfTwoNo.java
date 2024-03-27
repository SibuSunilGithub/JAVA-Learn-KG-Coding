// Create a program to find the Greatest Common Divisor (GCD) of two integers.

import java.util.Scanner;
class GcdOfTwoNo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int first = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int second = sc.nextInt();
		int gcd = gcd(first, second);
		System.out.println("GCD Of "+first+ " & "+ second+" Is: "+ gcd);
	}
	// Gcd Method
	public static int gcd(int first, int second){
		int gcd = 1, i = 2;
		int least = least(first, second);
		while(i <= least){
			if(first % i == 0 && second % i == 0){
				gcd = i;
			}
			i++;
		}
		return gcd;
	}
	// Find Least Number 
	public static int least(int n1, int n2){
		if(n1 < n2){
			return n1;
		}
		else{
			return n2;
		}
	}
}