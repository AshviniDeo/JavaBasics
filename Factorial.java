package assignment2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++){

            fact *= i;
        }
        System.out.println(number + " Factorial is :" + fact);
    }


}
