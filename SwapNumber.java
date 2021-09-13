package assignment2;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1 :");
        int number = scanner.nextInt();
        System.out.println("Enter second number :");
         int number2 = scanner.nextInt();
        System.out.println("Numbers are :" + number + " And " + number2);
        int temp;
        if(number != number2){

            temp = number;
            number = number2;
            number2 = temp;
            System.out.println("Number After swap is :" + number + " And " + number2);
         }

    }
}
