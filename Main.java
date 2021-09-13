package assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number for Harmonic :");
        int number = scanner.nextInt();
        System.out.println("Harmonic Series are :");
        int k = 1;
        int i = 1;
        while (k <= number){
           if(k != 1) {
               System.out.print(" + ");
           }
            System.out.print(i + "/" + k);
           k++;
        }
    }
}
