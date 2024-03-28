// Create a program to verify if a number is a palindrome.

import java.util.Scanner;
class CheckPalindrome{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int rev = reverse(num);
		if(rev == num){
			System.out.println("Number Is Palindrome.");
		}
		else{
			System.out.println("Number Is Not Palindrome.");
		}
	}
	//Reverse Number Function
	public static int reverse(int num){
		int rev = 0;
		while(num != 0){
			rev = (rev * 10) + (num%10);
			num/=10;
		}
		return rev;
	}
}