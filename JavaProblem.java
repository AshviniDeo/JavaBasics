package javaProblem;

import java.util.Scanner;
//import java.lang.*;
//import java.awt.*;

public class JavaProblem {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i = 0; i<5; i++) {
			
			for (int j = 0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("L Pattern Program ");
		for (int i = 0; i<5; i++) { 
			System.out.println("*");
		}
		for (int j = 0; j<5; j++) {
				System.out.print("* ");
		}
		
		System.out.println("Largest number program");
		System.out.println("Enter first number :");
		int first_number = scanner.nextInt();
		System.out.println("Enter Second number :");
		int second_number = scanner.nextInt();
		int largest = first_number > second_number ? first_number : second_number;
		System.out.println("Largest Number is : " + largest);
		
		
		System.out.println("Largest string Program");
		System.out.println("Enter first string :");
		String first_string = scanner.next();
		System.out.println("Enter second string :");
		String second_string = scanner.next();
		String largest_string = first_string.length() > second_string.length() ? first_string : second_string ;
		System.out.println("Long string is : " + largest_string);
		
		System.out.println("Palindrom Program ");
		System.out.println("Enter number to check palindrom :" + '\n');
		int number = scanner.nextInt();
		System.out.println("Enter string to check palindrom :");
		String string = scanner.next();
		boolean isPalindrom = true;
		int rem;
		int sum = 0;
		int temp = number;
		if (number != 0 && string != "" ) {
			
			
			for (int j = 0; j<number; j++) {
				
					rem = number % 10;
					sum = ((sum * 10) + rem);
					number = number / 10;
				
				
			}
			
			for (int i = 0; i<string.length()/2; i++) {
				if (string.charAt(i) != string.charAt(string.length()-i-1)) {
					isPalindrom = false;
					System.out.println(string + "is not Palindrom string ");
					break;
				}
			}
			
			if (number == temp && isPalindrom == true ) {
				System.out.println(number + "is a Palindrom");
				System.out.println(string + "is a Palindrom String");
			}else 
			{
				if (sum == temp) {
					System.out.println(temp + "is Palindrom ");
					
				}else if (isPalindrom == true)
				{
					System.out.println(string + " is a Palindrom ");
				}else {
			
				System.out.println(temp + "is not  a Palindrom");
				}
			}
				
		}	
	
	
	}

}



