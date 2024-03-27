// Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;
class LcmOfTwoNo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		int lcm = lcm(num1, num2);
		System.out.println("LCM Of "+num1+" & "+num2+" Is: " + lcm);
	}
	//Lcm Function
	public static int lcm(int num1, int num2){
		int i = 1;
		while(true){
			int factor = num1 * i;
			if(factor % num2 == 0){
				return factor;
			}
			i++;
		}
	}
}