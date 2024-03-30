// Create a program to check if the given array is sorted.

import java.util.Scanner;

class CheckArraySorted{
	public static void main(String []args){
		int[] numArray = ArrayUtility.inputArray();
		boolean isInc = isIncreasing(numArray);
		boolean isDec = isDecreasing(numArray);
		if(isInc || isDec){
			System.out.println("Your Array Is Sorted.");
		}
		else{
			System.out.println("Your Array Is Not Sorted.");
		}
	}
	// Check Increasing Method
	public static boolean isIncreasing(int[] numArray){
		int i = 1;
		while(i < numArray.length){
			if(numArray[i] < numArray[i-1]){
				return false;
			}
			i++;
		}
		return true;
	}
	// Check Decteasing Method
	public static boolean isDecreasing(int[] numArray){
		int i = 1;
		while(i < numArray.length){
			if(numArray[i] > numArray[i-1]){
				return false;
			}
			i++;
	}
	return true;
}
}
