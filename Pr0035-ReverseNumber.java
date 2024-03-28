// Create a program to reverse the digits of a number.

import java.util.Scanner;
class ReverseNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.println("Reverse Of Your Number Is: "+rev);
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
