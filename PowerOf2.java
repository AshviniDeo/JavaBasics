package assignment2;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for Power of table 2 :");
        int number = scanner.nextInt();
        int power = 1;
        final int base = 2;
        System.out.println("Table of  power of 2 : ");
        for(;number != 0; number--){
            if(number > 0 && number < 32){
                power *= base;

            }
            else{
                System.out.println("Enter number between 1-32");
                break;
            }


        }
        System.out.print(power);

    }
}
