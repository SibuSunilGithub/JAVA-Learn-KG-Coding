// Create a program to find the maximum and minimum element in an array.

import java.util.Scanner;

class ArrayMaxMin{
	public static void main(String []args){
		int[] numArray = ArrayUtility.inputArray();
		int max = max(numArray);
		int min = min(numArray);
		System.out.println("Maximim Number Is: "+max);
		System.out.println("Minimim Number Is: "+min);
	}
	
	// Maximum Of Array
	public static int max(int[] numArray){
		if(numArray.length == 0){
			return Integer.MIN_VALUE;
		}
		int max = numArray[0], i = 1;
		while(i < numArray.length){
			if(numArray[i] > max){
				max = numArray[i];
			}
			i++;
		}
		return max;
	}
	// Minimum Of Array
	public static int min(int[] numArray){
		int min = Integer.MAX_VALUE;
		int i = 0;
		while(i < numArray.length){
			if(numArray[i] < min){
				min = numArray[i];
			}
			i++;
		}
		return min;
	}
}