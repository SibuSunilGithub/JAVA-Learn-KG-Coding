// Create a program to check is the array is palindrome or not.

class ArrayPalindrome{
	public static void main(String []args){
		System.out.println("Welcome To Palindrome Checker Program");
		int[] numArr = ArrayUtility.inputArray();
		boolean isPalin = isPalindrome(numArr);
		if(isPalin){
			System.out.println("Array Is Palindrome.");
		}
		else{
			System.out.println("Array Is Not Palindrome.");
		}
	}
	
	public static boolean isPalindrome(int[] numArr){
		int i = 0;
		while(i < numArr.length/2){
		if(numArr[i] != numArr[numArr.length - 1 - i]){
			return false;
		}
		i++;
		}
		return true;
	}
}