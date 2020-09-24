/*
 * Author : Giao Le
 * Created on : Friday, September 18th 2020
 * Description : It's seem to be easy to everyone but I didn't know how to solve it ^_^
 *               Update : This solution does not pass SPOJ's limitation as Java I/O is slow
 * */

import java.util.Scanner;


public class WPC4F {

    public static int min(int a, int b, int c) {
        return Math.min(a,Math.min(b,c));
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int noOfTurtles = scanner.nextInt();
            int[][] turtles = new int[noOfTurtles][3];
            for (int i = 0; i < noOfTurtles; i++) {

                turtles[i][0] = scanner.nextInt();
                turtles[i][1] = scanner.nextInt();
                turtles[i][2] = scanner.nextInt();

                if (i > 0) {
                    turtles[i][0] += Math.min(turtles[i - 1][1], turtles[i - 1][2]);
                    turtles[i][1] += Math.min(turtles[i - 1][0], turtles[i - 1][2]);
                    turtles[i][2] += Math.min(turtles[i - 1][1], turtles[i - 1][0]);
                }
            }
            System.out.println(min(turtles[noOfTurtles - 1][0], turtles[noOfTurtles - 1][1], turtles[noOfTurtles - 1][2]));
        }
    }
}
