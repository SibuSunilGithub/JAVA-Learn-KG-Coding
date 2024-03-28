/*/ Create a program to check if a number is an Armstrong number.

import java.util.Scanner;
class CheckArmstrong{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		boolean isArmstrong = isArmstrong(num);
		if(isArmstrong){
			System.out.println("Your Number Is Armstrong.");
		}
		else{
			System.out.println("Your Number Is Not Armstrong.");
		}
	}
	// Armstrong Number Check Method
	public static boolean isArmstrong(int num){
		int numCopy = num;
		int totaldigits = countDigits(num);
		int finalNumber = 0;
		while(num != 0){
			int lastDigit = num % 10;
			num/=10;
			finalNumber += pow(lastDigit, totaldigits);
		}
		System.out.println(finalNumber);
		return finalNumber == numCopy;
	}
	
	// Pow Method
	public static int pow(int n1, int n2){
		int result = n1;
		int i = 0;
		while(i < n2){
			result *= n1;
			i++;
		}
		return result;
	}
		
		// Number Of Digits Count Method
		public static int countDigits(int num){
			int totaldigits = 0;
			while(num != 0){
				totaldigits++;
				num/=10;
			}
			return totaldigits;
		}
		
	}
