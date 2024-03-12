// Create a program to convert Fahrenheit to Celsius °C = (°F - 32) × 5/9

import java.util.Scanner;
class FahrenheitToCelsius{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Temperature In Fahrenheit: ");
		float fah = sc.nextFloat();
		float cel = (5/9) * (fah-32);
		System.out.println(fah+" Fahrenheit = "+cel+" Degree Celsius");
	}
}