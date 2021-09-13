package assignment2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.println("Division Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int dividend = scanner.nextInt();
        System.out.println("Enter Divisor : ");
        int divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient is :" + quotient);
        System.out.println("Remainder is :" + remainder);
    }
}
