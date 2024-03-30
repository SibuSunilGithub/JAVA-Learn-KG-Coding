// Create a program to find the sum and average of all elements in an array.

import java.util.Scanner;

class ArraySumAvg{
	public static void main(String []args){
		int[] numArray = ArrayUtility.inputArray();
		long sum = sum(numArray);
		double avg = avg(numArray);
		System.out.println("Sum Of The Number Is: "+ sum);
		System.out.println("Avg Of The Number Is: "+ avg);
	}
	
	public static long sum(int[] numArray){
		long sum = 0;
		int i = 0;
		while(i < numArray.length){
			sum+=numArray[i];
			i++;
		}
		return sum;
	}
	
	public static double avg(int[] numArray){
		long sum = sum(numArray);
		return (sum/numArray.length);
	}
}