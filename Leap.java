import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check");
		int year = sc.nextInt();
		if(year%4 == 0 && year%100 != 0) {
			System.out.println(year + "It is a leap year");
		}else {
			System.out.println(year + "Is not Leap year");
		}

	}

}
