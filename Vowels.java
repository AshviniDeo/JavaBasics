package assignment2;

import java.util.Locale;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet:");
        String alphabet = scanner.nextLine().toLowerCase(Locale.ROOT);

            if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")){
                System.out.println(alphabet + " is a Vowel");
            }
            else
            {
                System.out.println(alphabet + " is a Consonant");
            }


    }
}
