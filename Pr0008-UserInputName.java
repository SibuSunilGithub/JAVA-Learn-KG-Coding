// Welcome The User By Taking Input His Name

import java.util.Scanner;
class UserInputName{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Name: ");
		String name = sc.nextLine();
		System.out.println("Welcome "+ name +" ji");
	}
}