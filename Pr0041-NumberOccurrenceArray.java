// Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

class NumberOccurrenceArray{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int[] numArray = ArrayUtility.inputArray();
		System.out.println("Enter The Number You Want To Find: ");
		int num = input.nextInt();
		int occurrences = noOfOccurences(numArray, num);
		System.out.println("Your Number Was Found "+occurrences+" Times.");
	}
	
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