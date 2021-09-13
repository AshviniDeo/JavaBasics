package assignment2;

import java.util.Scanner;

public class Distance {
    public int EuclideanDistance(int x,int y){
        int origin = 0;
        int dx = x - origin;
        int dy = y - origin;
        int dist = (int)Math.sqrt(dx * dx + dy * dy);
        return dist;


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Co-ordinates to calculate Distance:");
        System.out.println("X Co-ordinate :");
        int x_co_ordinate = scanner.nextInt();
        System.out.println("Y Co-ordinat:");
        int y_co_ordinate = scanner.nextInt();
        Distance obj = new Distance();
        System.out.println("(" + x_co_ordinate +","+ y_co_ordinate +") Distance from origin is :" + obj.EuclideanDistance(x_co_ordinate,y_co_ordinate));
       scanner.close();
    }
}
