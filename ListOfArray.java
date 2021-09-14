package assignment5.four;


import java.util.Scanner;

public class ListOfArray {
 public void List(int m,int n) {
	 int[][] array = new int[m][n];
	 System.out.println("Array of (" + m + ")(" + n + ") are :");
	 for (int row = 0; row < m; row++) {
		 for (int column = 0; column < n; column++) {
		   array [row][column] = row + column;
		  
		   System.out.print(" " + array [row][column]);
		 }
		 System.out.println();
	 }
	
	 
		 

 }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListOfArray obj = new ListOfArray();
		System.out.println("Enter rows for 2D array :");
		int m = scanner.nextInt();
		System.out.println("Enter columns for 2D array :");
		int n = scanner.nextInt();
		obj.List(m, n);
		scanner.close();
	}

}
