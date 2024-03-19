/*
Create a program that calculates grades based on marks 
A -> above 90% B -> above 75%
C -> above 60% D -> above 30%
F -> below 30%
*/

import java.util.Scanner;
class CalculateGrade{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Grade: ");
		float per = sc.nextFloat();
		char grd;
		if(per >= 90){
			grd = 'A';
		}
		else if(per >= 75){
			grd = 'B';
		}
		else if(per >= 60){
			grd = 'C';
		}
		else if(per >= 30){
			grd = 'D';
		}
		else{
			grd = 'F';
		}
		System.out.println("Your Grade Is: "+grd);
	}
}