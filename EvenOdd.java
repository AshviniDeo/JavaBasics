package assignment2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is Even Number..!");
        }else {
            System.out.println(number + " is Odd Number..!");
        }
    }
}
