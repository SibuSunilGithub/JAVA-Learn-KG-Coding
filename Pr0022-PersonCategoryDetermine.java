/*
Create a program that categorize a person into different age groups 
Child -> below 13 
Teen -> below 20
Adult -> below 60 
Senior-> above 60
*/

import java.util.Scanner;
class PersonCategoryDetermine{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		String cat;
		if(age > 60)
		{
			cat = "Senior";
		}
		else if(age >= 20)
		{
			cat = "Adult";
		}
		else if(age >= 13)
		{
			cat = "Teen";
		}
		else
		{
			cat = "Child";
		}
		System.out.println("Your Category Is: "+cat);
	}
}