package assignment2;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number :" );
        int num3 = scanner.nextInt();
        if(num1 != 0 && num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " is Largest amoung three numbers");
            }else{
                System.out.println(num3 + " is Largest amoung three numbers");
            }
        }else if(num2 != 0 && num2 > num3){
            System.out.println(num2 + " is Largest amoung three numbers");
        }else{
            System.out.println(num3 + " is Largest amoung three numbers");
        }
    }
}
