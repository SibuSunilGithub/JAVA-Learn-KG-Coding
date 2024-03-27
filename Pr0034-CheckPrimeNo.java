// Create a program to check whether a given number is prime.

import java.util.Scanner;
class CheckPrimeNo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)){
			System.out.println("Number Is Prime.");
		}
		else{
			System.out.println("Number Is Not Prime!");
		}
	}
	// Prime Check Method
	public static boolean isPrime(int num){
		int i = 2;
		while(i < num){
			if(num % i == 0){
				return false;
			}
			i++;
		}
		return true;
	}
}