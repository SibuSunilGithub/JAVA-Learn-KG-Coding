//  Create a program to reverse an array.

import java.util.Scanner;
class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Welcome To Array Reverse Program.");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Reverse Array Is: ");
		reverse(numArr);
        ArrayUtility.displayArray(numArr);
    }

    public static void reverse(int arr[]) {
        int i = 0;
        while (i < arr.length / 2) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
    }
}