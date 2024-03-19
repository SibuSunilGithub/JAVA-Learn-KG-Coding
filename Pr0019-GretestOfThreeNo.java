// Create a program that determines the greatest of the three numbers.

import java.util.Scanner;
class GretestOfThreeNo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Numbers: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Numbers: ");
		int n2 = sc.nextInt();
		System.out.println("Enter Third Numbers: ");
		int n3 = sc.nextInt();
		if(n1 >= n2 && n1 >= n3){
			System.out.println("First Number Is Greater!");
		}
		else if(n2 >= n3){
			System.out.println("Second Number Is Greater!");
		}
		else{
			System.out.println("Third Number Is Greater!");
		}
	}
}