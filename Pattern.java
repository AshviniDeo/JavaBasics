package assignment5.four;

import java.util.Scanner;

public class Pattern {
	
	public void Lpattern(int number) {
		for (int i = 0; i<number; i++) {
			System.out.println("*");
		}
		for (int j = 0; j<number; j++) {
			System.out.print("* ");
		}
	}
	public void Hpattern(int number) {
		System.out.println("\n");
		for (int i = 0; i<number; i++ ) {
			for(int j = 0;j<1;j++) {
				System.out.print("*");
			
			}
			for(int k = 0;k<number;k++) {
				if(i == number/2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j = 0;j<1;j++) {
				System.out.print("*");
			
			}
			System.out.println();
			
		}
		
		
	}
	

	public static void main(String[] args) {
		Pattern obj = new Pattern();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		obj.Lpattern(number);
		obj.Hpattern(number);
	}

}
