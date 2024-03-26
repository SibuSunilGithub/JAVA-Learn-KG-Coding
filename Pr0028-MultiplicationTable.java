// Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;
class MultiplicationTable{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		mulTable(num);
	}
	public static void mulTable(int num){
		int i = 1;
		while(i <= 10){
			System.out.println(num+" X "+i+" = "+(num*i));
			i++;
		}
	}
}