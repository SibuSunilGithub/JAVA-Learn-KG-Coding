// Create a program to return a new array deleting a specific element.

import java.util.Scanner;

class DeleteSpecificArrayElement{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int[] numArray = ArrayUtility.inputArray();
		System.out.println("Enter The Number You Want To Delete: ");
		int numToDelete = input.nextInt();
		int[] newArray = deleteNumber(numArray, numToDelete);
		System.out.println("Here Is Your New Array: ");
		ArrayUtility.displayArray(newArray);
	}
	
	// Delete Num Array Method
	public static int[] deleteNumber(int[] numArray, int numToDelete){
		int occ = noOfOccurences(numArray, numToDelete);
		if(occ == 0){
			return numArray;
		}
		int newSize = numArray.length - occ;
		
		int[] newArray = new int[newSize];
		int i = 0, j = 0;
		while(i < numArray.length){
			if(numArray[i] != numToDelete){
				newArray[j] = numArray[i];
				j++;
			}
			i++;
		}
		return newArray;
	}
	// Count Occurences Method
	public static int noOfOccurences(int[] numArray, int num){
		int occ = 0;
		int i = 0;
		while(i < numArray.length){
			if(numArray[i] == num){
				occ++;
			}
			i++;
		}
		return occ;
	}
}